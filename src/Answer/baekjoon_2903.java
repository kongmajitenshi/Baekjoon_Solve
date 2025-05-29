package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int dot = 2;
        int result = 0;

        for(int i=0; i<n; i++){
            dot = dot*2-1;
            result = dot*dot;
        }
        System.out.println(result);

        br.close();
    }
}
