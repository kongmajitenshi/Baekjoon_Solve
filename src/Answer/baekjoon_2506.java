import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int count=0, result = 0;
        
        br.close();
        
        for(int i=0; i<N; i++){
            if(Integer.parseInt(input.split(" ")[i]) == 1){
                count ++;
            }else{
                count = 0;
            }
            result += count;
        }

        System.out.println(result);
    }
}
