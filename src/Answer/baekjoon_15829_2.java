import java.math.BigInteger;
import java.util.Scanner;

public class baekjoon_15829_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger value = new BigInteger("0");
        BigInteger M = new BigInteger("1234567891");
        int num = sc.nextInt();
        char[] munjas = new char[num];
        sc.nextLine();
        String munja = sc.nextLine();
        for(int i=0; i<munjas.length; i++){
            munjas[i] = munja.charAt(i);
        }

        for(int i=0; i<munjas.length; i++){
            BigInteger asciiNum = new BigInteger(Integer.toString(munjas[i]-96));
            //System.out.println("asciiNum: " + asciiNum);
            BigInteger baera = new BigInteger("31");
            //System.out.println("baera: " + baera);
            value = value.add(asciiNum.multiply(baera.pow(i)));
            //System.out.println("value: " + value);
        }
        // System.out.println(value);
        System.out.println(value.mod(M));

        sc.close();
    }
}
