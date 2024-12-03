package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] nums = input.toCharArray();
        int[] values = new int[nums.length];
        br.close();
        int num = 0;
        int j = nums.length - 1;

        for(char n : nums){
            if(0<=Character.getNumericValue(n) && Character.getNumericValue(n) <= 9){
                values[j] = Character.getNumericValue(n);
                j--;
            }else if(65 <= (int)n && (int)n <= 70){
                values[j] = (int)n - 55;
                j--;
            }
        }
        for(int i=values.length-1; i>=0; i--){
            num = num + ((int)Math.pow(16, i) * values[i]);
            // System.out.println("num: " + num);
        }

        System.out.println(num);


    }
}
