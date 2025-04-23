package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1731 {
    public static void main(String[] args) throws IOException {
        /* 입력받은 값들을 보고 빼보거나 나눠보면 됨.
         * 빼보고 값이 일정하게 증가한다면 그 값 만큼 더해줌.
         * 나눠보고 몫이 같다면 그 값만큼 곱해주면 됨.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        }
        br.close();
        int mi1 = nums[1] - nums[0], mi2 = nums[2] - nums[1];
        int de1 = nums[1] / nums[0], de2 = nums[2] / nums[1];
        if(mi1 == mi2){
            System.out.println(nums[n-1] + mi1);
        }else if(de1 == de2){
            System.out.println(nums[n-1] * de1);
        }
        
    }
}
