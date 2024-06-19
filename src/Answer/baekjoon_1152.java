package Answer;
import java.util.Scanner;

public class baekjoon_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] split_line = line.strip().split(" ");
        int result = 0;
        
        for(String val : split_line){
            if(val != null && val != ""){
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
