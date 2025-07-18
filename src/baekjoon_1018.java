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
        String[] chess = new String[n];
        for(int i=0; i<n; i++){
            String in = br.readLine();
            chess[i] = in;
        }
        // char[][] chess = new char[m][n];
        // for(int i=0; i<n; i++){
        //     String chessIn = br.readLine();
        //     for(int j=0; j<m; j++){
        //         chess[i][j] = chessIn.charAt(j);
        //     }
        // }
        System.out.println("----------");
        for(String c : chess){
            System.out.println(c);
        }



    }  // main
}  // class
