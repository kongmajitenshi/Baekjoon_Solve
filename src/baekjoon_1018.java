import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 8*8의 칸을 임의로 선택하여 최소한으로 칠해야함. 즉, 칠하게 될 8*8의 칸을 선택할 때 최대한 WBWB BWBW 규칙을 잘 지킨 칸을 지키면 됨.
        // 그렇다면, 그 규칙을 잘 지킨 부분을 판별할 코드도 필요하다는 뜻. 그냥 count로 판별한 뒤에 칸을 잘라내고, count를 0으로 다시 초기화 해서 재활용 해도 될듯.
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);  // 세로
        int M = Integer.parseInt(input.split(" ")[1]);  // 가로
        char[][] chess = new char[N][M];  // 체스 판 틀만 생성.
        String chesspan;
        int count = 0;  // 몇 칸 칠해야 하는지 셀 것. 이걸 출력하면 됨.  
        for(int i=0; i<N; i++){
            chesspan = br.readLine();
            for(int j=0; j<M; j++){
                chess[i][j] = chesspan.charAt(j);  // 체스 판 진짜 생성.  // 문자 배열에 하나하나 넣어둠.
            }
        }  // for
        br.close();

    }  // main
}  // class
