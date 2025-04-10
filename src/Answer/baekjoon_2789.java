package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        br.close();

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch != 'C' && ch != 'A' && ch != 'M' && ch != 'B' && ch != 'R' && ch != 'I' && ch != 'D' && ch != 'G' && ch != 'E'){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
