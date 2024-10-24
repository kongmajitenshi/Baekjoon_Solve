package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1297 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int D = Integer.parseInt(input.split(" ")[0]);  // 대각선 길이
        int H = Integer.parseInt(input.split(" ")[1]);  // 높이 비율
        int W = Integer.parseInt(input.split(" ")[2]);  // 너비 비율
        
        br.close();

        // H제곱 W제곱을 합한 수의 제곱근. 즉, 비율상 최적의 대각선 길이
        double daegak = Math.sqrt((H*H) + (W*W)); 
        System.out.println("daegak: "+daegak);

        double length = D / daegak;  // q비율
        System.out.println("length: " + length);;
        H = (int) (H*length);
        W = (int) (W*length);

        System.out.println(H + " " + W);
        
        // System.out.println(D + H + W);
    }
}
 