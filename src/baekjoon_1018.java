import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]),  // 세로 
        m = Integer.parseInt(input.split(" ")[1]);  // 가로
        String wStart = "WBWBWBWB", bStart = "BWBWBWBW";
        int count = 0;
        char[][] chess = new char[n][m];
        for(int i=0; i<n; i++){
            String in = br.readLine();
            for(int j=0; j<m; j++){
                chess[i][j] = in.charAt(j);
            }
        }
        String result;
        for(int i=0; i<m; i++){
            
            System.out.print(chess[0][i]);
        }
        



    }  // main
}  // class
