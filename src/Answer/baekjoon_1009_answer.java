package Answer;
import java.util.Scanner;
// n의 제곱 = 1의 자리가 n으로 무한히 반복함 => 10으로 나눈 나머지 값으로
// 1의 자리만 계속해서 유지해줘도 아무 문제 없음.
// 결국 testCase2에 들어가는 값은 testCase1을 몇 번 반복하냐의 문제임.
public class baekjoon_1009_answer{ // 240402 새벽
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int[] result = new int[test];

        for(int i=0; i<test; i++){
            int testCase1 = scan.nextInt();
            int testCase2 = scan.nextInt();

            if((1<=testCase1 && testCase1<100) && (1<=testCase1 && testCase1<1_000_000)){
                if(testCase2 == 1) {
                    result[i] = testCase1;
                }
                
                int testCase1Copy = testCase1 % 10;
                for(int j=0; j<testCase2-1; j++){
                    testCase1Copy = (testCase1Copy*testCase1) % 10;
                    result[i] = testCase1Copy;
                }
            }
        } 

        for(int k=0; k<test; k++){
            System.out.println( "값: " + ((result[k]%10)==0?10:result[k]%10) );
        }

        scan.close();

    }
} 