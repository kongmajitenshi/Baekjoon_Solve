package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        
        int N = Integer.parseInt(in[0]);
        int K = Integer.parseInt(in[1]);
        // int N = Integer.parseInt(br.readLine());  // 자연수 N
        // int K = Integer.parseInt(br.readLine());  // 정수 K, K는 N이하의 값을 가짐

        br.close();

        int bunja = 1;
        int bunmo = 1;

        for(int i=N; i>0; i--){
            bunja *= i;
        }

        for(int i=K; i>0; i--){
            bunmo *= i;
        }

        for(int i=N-K; i>0; i--){
            bunmo *= i;
        }

        int result = bunja / bunmo;

        System.out.println(result);
    }
}
