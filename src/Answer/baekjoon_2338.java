package Answer;

import java.util.Scanner;

public class baekjoon_2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextInt();
        long B = sc.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);

        sc.close();
    }
}
