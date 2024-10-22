import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(input.readLine());
        
        input.close();

        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                System.out.printf(" ");
            }
            // for(int j=2*N-1; j>2*i; j--){
            //     System.out.printf("*");
            // }
            for(int j=2*i; j<2*N-1; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}