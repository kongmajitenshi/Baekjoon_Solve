package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++){
            StringBuilder sb = new StringBuilder();
            String test = br.readLine();
            int where = Integer.parseInt(test.split(" ")[0]);
            String word = test.split(" ")[1];
            sb.append(word);
            sb.deleteCharAt(where-1);
            System.out.println(sb);
        }
    }
}
