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
                    picture[j][k] ++;
                }
            }
        }
        int count = 0;
        for(int i=1; i<=100; i++){
            for(int j=1; j<=100; j++){
                if(picture[i][j]>m){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
