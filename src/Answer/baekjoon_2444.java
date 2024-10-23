package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(input.readLine());
        
        input.close();

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                System.out.printf(" ");
            }
            for(int k=0; k<=2*i; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<i+1; j++){
                System.out.printf(" ");
            }
            for(int j=2*i; j<2*N-3; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}