package Answer;
import java.util.Scanner;

public class baekjoon_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        for(int i=n-1; i>=0; i--){
            // n=5라면, 별1 찍, 공백4찍 > 별2 공3 ... 
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            for(int k=n; k>n-i; k--){
                System.out.print(" ");
            }
            for(int k=n; k>n-i; k--){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=0; i--){
            // n=5라면, 별1 찍, 공백4찍 > 별2 공3 ... 
            for(int k=n; k>n-i; k--){
                System.out.print("*");
            }
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=n; k>n-i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=0; i<n-1; i++){
        //     for(int j=n; j>n-i; j--){
        //         System.out.print("*");
        //     }
        //     for(int k=0; k<n-i; k++){
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        
    }
}
