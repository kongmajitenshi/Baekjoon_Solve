package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];

        for(int i=0; i<3; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        
        }
        br.close();

        Arrays.sort(nums);
        
        for(int num : nums){
            System.out.printf("%d ", num);
        }
    }
}
