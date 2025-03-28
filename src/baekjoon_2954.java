import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        br.close();
        char[] inputArr = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<input.length(); i++){
            sb.append(inputArr[i]);
            if(inputArr[i] == 'a' || inputArr[i] == 'e' || inputArr[i] == 'i' || inputArr[i] == 'o' || inputArr[i] == 'u'){
                if(i+2 < input.length()){
                    i+=2;
                }
            }
        }
        System.out.println(sb);

    }
}
