package Answer;
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
        // int count = 0;  // 몇 개 바꿔야하나 세서 저장. 결과적으로 이 변수가 출력될 것.
        char[][] chess = new char[n][m];
        for(int i=0; i<n; i++){
            String in = br.readLine();
            for(int j=0; j<m; j++){
                chess[i][j] = in.charAt(j);  // 입력받은 값 저장
            }
        }

        int minCount = Integer.MAX_VALUE;
        for(int i=0; i<= n-8; i++){
            for(int j=0; j<= m-8; j++){
                int wCount = 0, bCount = 0;  // 몇개 바뀌었는지 체크. wCount는 화이트가 바뀐거.
                for(int k=0; k<8; k++){
                    for(int l=0; l<8; l++){  // 여기서부터 본격적으로 체크. 
                        if(chess[i+k][j+l] != ((k%2==0) ? wStart.charAt(l):bStart.charAt(l))) wCount++;
                        if(chess[i+k][j+l] != ((k%2==0) ? bStart.charAt(l):wStart.charAt(l))) bCount++;
                    }
                }
                minCount = Math.min(minCount, Math.min(wCount, bCount));
            }
        }
        System.out.println(minCount);


    }  // main
}  // class
