package Answer;
import java.util.Scanner;

public class baekjoon_2721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int i=0; i<test; i++){
            int result = 0;
            int input = sc.nextInt();
            for(int j=1; j<=input; j++){
                int samgak = 0;
                for(int k=1; k<=j+1; k++){
                    samgak += k;
                    // System.out.println("samgak" + k + ": " + samgak);
                }
                result += j * samgak;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
