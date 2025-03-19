package Answer;
import java.util.Scanner;

public class baekjoon_2921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int result = 0;

        for(int j=size; j>0; j--){
            for(int i=0; i<=size; i++){
                result += 2 * j - i;
            }
        }

        System.out.println(result);

        sc.close();
    }
}
