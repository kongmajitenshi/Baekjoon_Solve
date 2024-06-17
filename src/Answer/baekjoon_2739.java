package Answer;
import java.util.Scanner;

public class baekjoon_2739 { //240331
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(1 <= num && num <= 9){
            for(int i=1; i<=9; i++){
                System.out.printf("%d * %d = %d \n", num, i, num*i);
            }
        }
        scan.close();
    }
}
