package Answer;
import java.util.Scanner;

public class baekjoon_8393 { //240403
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;
        if(1<=num && num<=10_000){
            for(int i=1; i<=num; i++){
                result += i;
            }
        }
        System.out.println(result);

        sc.close();
    }
}
