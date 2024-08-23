import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int R;
        String S;
        int T = sc.nextInt();
        List<String> results = new ArrayList<String>();

        for(int i=0; i<T; i++){
            R = sc.nextInt();
            S = sc.next();
            char[] charS = S.toCharArray();
            
            for(int j=0; j<charS.length; j++){
                S = String.valueOf(charS[j]);
                results.add(S.repeat(R));
            }
        }
        
        for(int i=0; i<results.size(); i++){
            System.out.print(results.get(i));
        }

        sc.close();
    }
}
