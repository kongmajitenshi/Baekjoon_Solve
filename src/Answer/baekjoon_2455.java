package Answer;
import java.util.Scanner;

public class baekjoon_2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int EndStation = 4;
        int on, off, value = 0;
        int[] results = new int[EndStation];
        for(int i=0; i<EndStation; i++){
            off = sc.nextInt();
            on = sc.nextInt();
            value += on - off;
            results[i] = value;
            // System.out.println(results[i]);
        }
        
        int max = results[0];
        for(int result : results){
            if(max < result){
                max = result;
            }
        }
        System.out.println(max);

        sc.close();
    }
}
