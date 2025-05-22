package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine(), "\n");
            int num = Integer.parseInt(st.nextToken());
            int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
            c1 = num / 25;
            num %= 25;
            // System.out.println(num);
            c2 = num / 10;
            num %= 10;
            // System.out.println(num);
            c3 = num / 5;
            num %= 5;
            // System.out.println(num);
            c4 = num / 1;
            num %= 1;
            // System.out.println(num);
            System.out.printf("%d %d %d %d\n", c1, c2, c3, c4);
        }
        br.close();
    }
}
