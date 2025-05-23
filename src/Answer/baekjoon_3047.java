package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon_3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];
        for(int i=0; i<3; i++){
            nums[i] =  Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        // int n1 = Integer.parseInt(st.nextToken()), n2 = Integer.parseInt(st.nextToken()), n3 = Integer.parseInt(st.nextToken());
        String input = br.readLine();
        switch (input) {
            case "ABC": System.out.printf("%d %d %d\n", nums[0], nums[1], nums[2]); break;
            case "ACB": System.out.printf("%d %d %d\n", nums[0], nums[2], nums[1]); break;
            case "BAC": System.out.printf("%d %d %d\n", nums[1], nums[0], nums[2]); break;
            case "BCA": System.out.printf("%d %d %d\n", nums[1], nums[2], nums[0]); break;
            case "CAB": System.out.printf("%d %d %d\n", nums[2], nums[0], nums[1]); break;
            case "CBA": System.out.printf("%d %d %d\n", nums[2], nums[1], nums[0]); break;
            default: break;
        }
        // int max = 0, mid = 0, min = 0;
        // for(int i=1; i<3; i++){
        //     int bef = nums[i-1];
        //    if(nums[i] > max && nums[i] > bef){
        //         max = nums[i];
        //         bef = mid;
        //    }
        // }
        br.close();
    }
}
