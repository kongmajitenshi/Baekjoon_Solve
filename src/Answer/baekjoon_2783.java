package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        double x = Integer.parseInt(input.split(" ")[0]), y = Integer.parseInt(input.split(" ")[1]);
        int n = Integer.parseInt(br.readLine());
        // br.readLine();
        double result = x / y;
        double min = result;
        for(int i=0; i<n; i++){
            String in = br.readLine();
            x = Integer.parseInt(in.split(" ")[0]); 
            y = Integer.parseInt(in.split(" ")[1]);
            result = x / y;
            if(min > result){
                min = result;
            }
        }
        System.out.printf("%.2f\n", min*1000);
        br.close();
    }
}
