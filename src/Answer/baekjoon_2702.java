package Answer;
import java.util.Scanner;

public class baekjoon_2702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();        

        for(int i=0; i<t; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int max = 0, min = 0;
            int j = 1;

            while(true){  // 1부터 증가시키면서 
                if(a % j == 0 && b % j == 0){
                    min = j;
                }
                if(j % a == 0 && j % b == 0){
                    max = j;
                    break;
                }
                j++;
            }
            // int a2 = a;
            // int b2 = b;
            // if(a > b){
            //     max = a;
            //     min = b;
            // }else if(b > a){
            //     max = b;
            //     min = a;
            // }
            // int result1 = min;//, result2 = 0;
            // while(true){
            //     if(result1 % a == 0 && result1 % b == 0){
            //         break;
            //     }
            //     a += a;
            //     b += b;
            // }
            // while(true){
            //     if(max % a2 == 0 && max % b2 == 0){
            //         break;
            //     }
            //     max --;
            // }
            System.out.printf("%d %d\n", max, min);
        }


        sc.close();
    }
}
