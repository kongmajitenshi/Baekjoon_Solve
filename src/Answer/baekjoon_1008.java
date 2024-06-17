package Answer;
import java.util.Scanner;

public class baekjoon_1008 { //240331
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        if(num1>0 && num2<10){
            System.out.println((double)num1/num2);
        }
        num.close();
    }
}
