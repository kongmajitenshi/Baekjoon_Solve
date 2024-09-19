import java.util.Scanner;

public class baekjoon_2231 {
    public static void main(String[] args) {
        /* 1부터 입력된 숫자 까지 쭉 검사
         * 1부터 입력된 수 까지 1씩 더해지면서
         * 일의자리 십의자리 ... 를 모두 더한다
         * 나머지 연산을 통해 구하면 된다.
         * 10으로 나눈 나머지 값을 더해주고, 
         * 그 값을 실제로 10으로 나누어 저장해둔다.
         * 모든 나머지 값을 더하고, 
         * 
         */
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int number = i;
            int sum = 0;  // 각 자릿수 합

            while(number != 0){
                sum += number%10;  // 각 자릿수 더하기(1의자리도 더해짐)
                number /= 10;
            }

            // i 값과 각 자릿수 누적 합이 같을 경우
            if(sum + i == N){
                result = i;
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
