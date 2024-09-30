package Answer;
import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        BigInteger C = new BigInteger(sc.next());
        // long A = sc.nextInt();
        // long B = sc.nextInt();
        // long C = sc.nextInt();
        System.out.println(A.add(B.add(C)));
        //System.out.println(A+B+C);

        sc.close();
    }
}
