import java.util.Scanner;

public class co_baekjoon1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            // Calculate MN (M - N)
            int MN = M - N;

            // Create arrays to store values
            long[] factN = new long[N + 1];
            long[] factM = new long[M + 1];
            long[] factMN = new long[MN + 1];

            // Initialize factorials
            factN[0] = factM[0] = factMN[0] = 1;
            for (int j = 1; j <= M; j++) {
                factM[j] = factM[j - 1] * j;
                if (j <= N) {
                    factN[j] = factN[j - 1] * j;
                }
                if (j <= MN) {
                    factMN[j] = factMN[j - 1] * j;
                }
            }

            // Calculate nCr using factorials
            long nCr = factM[M] / (factMN[MN] * factN[N]);

            System.out.println(nCr);
        }

        sc.close();
    }
}
