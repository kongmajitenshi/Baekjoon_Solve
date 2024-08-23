package Answer;
import java.util.Scanner;

public class baekjoon_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        if(90<=score && score <= 100){
            System.out.println("A");
        }else if(80<=score){
            System.out.println("B");
        }else if(70<=score){
            System.out.println("C");
        }else if(60<=score){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        sc.close();
    }
}
