package Answer;

import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon_2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        // long A = sc.nextInt();
        // long B = sc.nextInt();

        
        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));

        sc.close();
    }
}
