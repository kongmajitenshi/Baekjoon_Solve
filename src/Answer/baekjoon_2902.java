package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        // st = new StringTokenizer(st.nextToken(), "-");

        while((st.hasMoreTokens())){
            System.out.print(st.nextToken().charAt(0));
        }
        br.close();
    }// main
}// class
