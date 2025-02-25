import java.util.Scanner;

public class baekjoon_2592 {
    public static void main(String[] args) {
        /*
         * 입력: 자연수 10개 입력, 한 줄에 하나 씩. 10의 배수
         * 출력: 평균과 최빈값. 최빈값이 하나가 아닐 경우 하나만 출력하면 됨
         * 입력은 그냥 10번 받으면 됨.
         * int 타입 크기100의 배열을 생성. 그리고 입력된 값을 10으로 나누고, 
         * 해당 인덱스 자리 ++ 해줌.
         * 예시: 10 입력 시 10/10 = 1, 1번 인덱스 ++
         */
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int[] count = new int[100];
        for(int i=0; i<10; i++){
            num = sc.nextInt();
            sum += num;
            count[num/10] ++;
        }
        sc.close();

        int result1 = sum / 10;
        int result2 = 0;
        int max = 0;

        for(int i=0; i<100; i++){
            if(max < count[i]){
                max = count[i];
                result2 = i*10;
            }
        }
        System.out.println(result1);
        System.out.println(result2);
    }
}
