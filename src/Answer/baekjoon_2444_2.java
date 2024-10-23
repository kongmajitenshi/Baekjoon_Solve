package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2444_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(input.readLine());
        
        input.close();

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                sb.append(" ");
            }
            for(int k=0; k<=2*i; k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<i+1; j++){
                sb.append(" ");
            }
            for(int j=2*i; j<2*N-3; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.printf("%s", sb);
    }
}