package Answer;
import java.util.Scanner;

public class baekjoon_2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int n = N;
        for(int i=0; i<N; i++){ 
            if(N < 1 || N > 100){
                break;
            }
            for(int k=n; k<N; k++){
                System.out.print(" ");
            }           
            for(int j=n; j>0; j--){
                System.out.print("*");
            }
            n--;
            System.out.println();
        }

        sc.close();
    }
}
