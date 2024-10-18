package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int white = 0;
        String chessArea;

        for(int i=0; i<8; i++){
            chessArea = in.readLine();
            if(i==0 || i%2==0){
                // 첫 칸과 짝수칸이 흰색
                for(int j=0; j<8; j+=2){
                    if(chessArea.charAt(j) == 'F'){
                        white ++;
                    }   
                }
            }else if(i%2==1){
                // 첫 칸과 짝수칸이 검정색
                for(int j=1; j<8; j+=2){
                    if(chessArea.charAt(j) == 'F'){
                        white ++;
                    }   
                }
            }
        }
        in.close();

        System.out.println(white);

    }
}
