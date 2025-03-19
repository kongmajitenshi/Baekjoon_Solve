package Answer;
import java.util.Scanner;

public class baekjoon_2702_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int choidae, choiso;
            int a = sc.nextInt(), b = sc.nextInt();
            int oriA = a, oriB = b;
            while(b != 0){
                int before = b;
                b = a % b;
                a = before;
            }
            choidae = a;
            choiso = (oriA * oriB) / choidae;
            System.out.printf("%d %d\n", choiso, choidae);

        }

        sc.close();
    }
}