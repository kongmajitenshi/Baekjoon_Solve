package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int max = 0;
        int win = 0;
        for(int j=0; j<5; j++){
            String input = br.readLine();
            int[] nums = new int[4];
            result = 0;
            for(int i=0; i<4; i++){
                nums[i] = Integer.parseInt(input.split(" ")[i]);
                result += nums[i];
            }
            if(result > max){
                max = result;
                win = j+1;
            }
        }
        System.out.println(win + " " + max);
    }
}
