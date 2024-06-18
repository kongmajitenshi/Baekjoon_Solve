import java.util.Scanner;

public class baekjoon_2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // int n = N;
        // int m = 0;

        for(int i=0; i<N; i++){
            //System.out.println(i);
            // for(int j=0; j<n-1; j++){
            //     System.out.print(" ");
            // }
            for(int j=N-1; j>i; j--){
                System.out.print(" ");
            }

            // for(int j=0; j<=2*m; j++){
            //     System.out.print("*");
            // }
            for(int j=0; j<=2*i; j++){
                System.out.print("*");
            }

            // n--;
            // m++;
            System.out.println();
        }

        sc.close();
    }
}
