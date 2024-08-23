package Answer;

import java.util.Scanner;

public class baekjoon_11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Scanner 객체는 char 타입을 받을 수 없음. 
        // 따라서 String으로 받은 후에 char로 변환해주는 과정이 필요함.
        String ascii = sc.next();

        int asciint = ascii.charAt(0);
        System.out.println(asciint);
        
        // char A = 'A';
        // int aint = A;
        // System.out.println(aint);

        sc.close();
    }
}
