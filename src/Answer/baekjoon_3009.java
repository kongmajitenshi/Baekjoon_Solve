package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        
        // int[] count = new int[1001];
        int[] x = new int[3];
        int[] y = new int[3];

        int n1, n2;

        for(int i=0; i<3; i++){
            String input = br.readLine();
            x[i] = Integer.parseInt(input.split(" ")[0]);
            y[i] = Integer.parseInt(input.split(" ")[1]);
        }
        
        if(x[0] == x[1]){
            n1 = x[2];
        }else if(x[0] == x[2]){
            n1 = x[1];
        }else{
            n1 = x[0];
        }

        if(y[0] == y[1]){
            n2 = y[2];
        }else if(y[0] == y[2]){
            n2 = y[1];
        }else{
            n2 = y[0];
        }

        System.out.printf("%d %d\n", n1, n2);
        

        br.close();
    }
}
