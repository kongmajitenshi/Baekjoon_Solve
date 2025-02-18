package Answer;
import java.util.Scanner;

public class baekjoon_1681 {
    public static void main(String[] args) {
        /*
         * N개의 숫자(양수) 라벨 붙임
         * 단, 숫자 L이 라벨에 포함되면 안됨.
         * 만약 L이 9 라면, 
         * 1 2 3 4 5 6 7 8 10 11 12 ... 18 20 21 ... 
         * 이런 형태로 숫자 9가 제외된 형태로 정렬
         * 출력은 정렬된 수 중 가장 큰 수
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 라벨 개수
        int l = sc.nextInt();  // 제외할 숫자
        String strL = Integer.toString(l);
        
        sc.close();

        int num = 1;
        String result = "";  // 결과 저장할 것
        int count = 0;
        while(count < n){
            result = Integer.toString(num);
            
            
            while(result.contains(strL)){
                num ++;
                result = Integer.toString(num);
            }
            num++;
            count++;
            /*
             * 숫자 1부터 시작
             * 숫자를 문자열로 변환
             * 해당 문자열을 strL과 비교
             * strL이 포함되면 +1을 함. 포함되지 않을 때 까지 반복.
             * 위 과정이 끝나면 count 1 증가.
             */
        }
        System.out.println(result);
        // for(int i=1; i<=n; i++){
        //     // 숫자를 문자열로 변환해서 해당 문자열에 l이 포함되는지 검사하면 될듯?
        //     result = Integer.toString(i);
        //     if(result.contains(strL)){

        //     }
    
    }  //main
}  //class
