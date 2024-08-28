package Answer;

import java.util.Scanner;

public class baekjoon_31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(A + B - C);

        String strResult = Integer.toString(A) + Integer.toString(B);
        int intResult = Integer.parseInt(strResult);

        System.out.println(intResult - C);
        sc.close();
    }
}
