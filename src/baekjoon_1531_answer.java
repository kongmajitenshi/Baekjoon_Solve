import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1531_answer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[][] picture = new int[101][101];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int lx = Integer.parseInt(st.nextToken()), ly = Integer.parseInt(st.nextToken());
            int rx = Integer.parseInt(st.nextToken()), ry = Integer.parseInt(st.nextToken());
            for(int j=lx; j<=rx; j++){
                for(int k=ly; k<=ry; k++){
                    picture[j][k] ++; // 그냥 종이가 채워진 부분 다 1씩 증가. 겹치는 부분은 숫자가 1보다 클거임.
                }
            }
        }
        int count = 0;
        for(int i=1; i<=100; i++){
            for(int j=1; j<=100; j++){
                if(picture[i][j]>m){  // 겹치는 부분이 내가 입력한 m보다 크다면 count를 키워줌. count는 얼마나 겹쳤나 세는 변수.
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
