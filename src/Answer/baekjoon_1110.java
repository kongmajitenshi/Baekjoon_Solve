package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        if(input.length() == 1){
            input = "0" + input;
        }

        int count = 0;
        String now = input;

        while(true){
            int num1 = now.charAt(0) - '0';
            int num2 = now.charAt(1) - '0';
            int sum = num1 + num2;
            now = Character.toString(now.charAt(1)) + Integer.toString(sum%10);
            
            count++;

            if(now.equals(input)){
                break;
            }
        }
        System.out.println(count);

        br.close();
    }
}
