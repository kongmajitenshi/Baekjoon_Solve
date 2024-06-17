import java.util.Scanner;

public class baekjoon_1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] S = new long[3];
        for(int z=0; z<3; z++){
            int N = sc.nextInt();
            long[] nums = new long[N];
            if(1 <= N && N <= 100_000){
                for(int i=0; i<N; i++){
                    long num = sc.nextLong();
                    nums[i] = num;
                }
                for(int i=0; i<N/2; i++){
                    S[z] += nums[i] + nums[N-1-i];
                }
                if(N%2 == 1){
                    S[z] += nums[(N/2)];
                }
            }
        }

        for(int z=0; z<3; z++){
            if(S[z]>0){
                System.out.println("+");
            }else if (S[z]<0) {
                System.out.println("-");
            }else{
                System.out.println("0");
            }
        }

        sc.close();
    }
}
