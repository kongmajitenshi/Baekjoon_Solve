package Answer;
import java.util.Scanner;

public class baekjoon_2741 { //240404
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        int num = scan.nextInt();
    
        if(num<=100_000){
            for(int i=1; i<=num; i++){
                System.out.println(i);
            }
    
        }
        scan.close();
    }

}
