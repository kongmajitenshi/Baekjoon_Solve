import java.util.Scanner;

public class baekjoon_1009{ // 240402 새벽
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt();
        // int[] testCaseArray = new int[test+1];
        int[] result = new int[test];

        for(int i=0; i<test; i++){
            int testCase1 = scan.nextInt();
            int testCase2 = scan.nextInt();
            // testCase2 만큼 반복하면서 값 꺼내오기.
            // 배열로 2의 제곱수, 3의 제곱수 ... 를 만들어두고 돌면서 체크하기?
            if((1<=testCase1 && testCase1<100) && (1<=testCase1 && testCase1<1_000_000)){
                // testCaseArray[i] = testCase1;
                // testCaseArray[i+1] = testCase2;
                if(testCase2 == 1) {
                    result[i] = testCase1;
                }
                // int num = testCase1 % 10;
                // for(int j=0; j<testCase2-1; j++) {
                    //     num = (num*testCase1)%10;
                    // }
                    // result[i] = num;
                int testCase1Copy = testCase1 % 10;
                for(int j=0; j<testCase2-1; j++){
                    testCase1Copy = (testCase1Copy*testCase1) % 10;
                    result[i] = testCase1Copy;
                }
            }
            // if(1<=testCase1 && testCase1<1_000_000){
            // }
            
            // System.out.println("1: " + testCaseArray[i] + " " + testCaseArray[i+1]);
            // System.out.println("2: " + result[i]);
        } 
        for(int k=0; k<test; k++){
            System.out.println( "값: " + ((result[k]%10)==0?10:result[k]%10) );
        }
        
    
        scan.close();

    }
} 