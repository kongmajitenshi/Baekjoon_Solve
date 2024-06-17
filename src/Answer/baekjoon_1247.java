package Answer;
import java.util.Scanner;
import java.math.BigInteger;

public class baekjoon_1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int z = 0; z < 3; z++) {
            int N = sc.nextInt();
            BigInteger sum = BigInteger.ZERO;

            for (int i = 0; i < N; i++) {
                BigInteger num = sc.nextBigInteger();
                sum = sum.add(num);
            }

            if (sum.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else if (sum.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            } else {
                System.out.println("0");
            }
        }
        
        sc.close();
    }
}
