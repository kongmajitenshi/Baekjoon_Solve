package Answer;
import java.util.Scanner;

public class baekjoon_2588 { // 240331
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = 0;

        if((100<=a && a<=999) && (100<=b && b<=999)){
            c = b % 10; // 5
            System.out.println(a * c); // 472 * 5
            
            c = (b % 100)/10; // 8
            System.out.println(a*c);

            c = (b % 1000)/100; // 3
            System.out.println(a*c);

            System.out.println(a*b);
        }

        scan.close();

    }
}
