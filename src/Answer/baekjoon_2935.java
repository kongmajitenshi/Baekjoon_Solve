package Answer;

import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon_2935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        String mid = sc.nextLine();
        BigInteger b = new BigInteger(sc.nextLine());
        if(mid.equals("+")){
            System.out.println(a.add(b));
        }else if(mid.equals("*")){
            System.out.println(a.multiply(b));
        }
        sc.close();
    }
}
