package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] nums = new int[input.length()];
        for(int i=0; i<input.length(); i++){
            nums[i] = Character.getNumericValue(input.charAt(i));
        }
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=0; i--){
            System.out.printf("%d", nums[i]);
        }
    }
}
