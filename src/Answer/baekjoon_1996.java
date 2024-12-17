package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class baekjoon_1996 {
    // public static boolean isInteger(char map){
    //     int number = Character.getNumericValue(map);
    //     if(0<=number && number<=9){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());  // 가로 세로 칸 개수(정사각형)
        char[][] maps = new char[n][n];  // 맵 정보 저장할이중배열 생성

        for(int i=0; i<n; i++){  // 맵 생성
            String input = br.readLine();
            for(int j=0; j<n; j++){
                maps[i][j] = input.charAt(j);
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();  // sb를 통해 문자열을 만들고, 그 문자열을 출력할 것.

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        // 좌상, 상, 우상, 좌, 우, 좌하, 하, 우하
        int[][] result = new int[n][n];        

        for(int i=0; i<n; i++){  // 검사
            for(int j=0; j<n; j++){
                int count = 0;
                if(Character.isDigit(maps[i][j])){
                    result[i][j] = -1;  // 해당 위치에 숫자가 있음. 즉, 지뢰 개수가 저장되어있음.
                    count += Character.getNumericValue(maps[i][j]);  // 해당 숫자만큼 count에 더해줌.
                    for(int k=0; k<8; k++){
                        int nx = i+dx[k], ny = j+dy[k];
                        if(0<=nx && nx<n && 0<=ny && ny<n && result[nx][ny] != -1){
                            result[ny][nx] += count;
                        }
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(result[i][j] >= 10){
                    sb.append('M');
                }else if(result[i][j] == -1){
                    sb.append('*');
                }else{
                    sb.append(result[i][j]);
                }
            }
            sb.append('\n');
        }
        
        System.out.println("\n" + sb);
    }  // main
}
