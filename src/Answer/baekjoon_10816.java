package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class baekjoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strNums = br.readLine().split(" ");
        // int[] nums = new int[strNums.length];
        Map<String, Integer> results = new HashMap<>();

        for(String num : strNums){
            // nums[i] = Integer.parseInt(strNums[i]);
            results.put(num, results.getOrDefault(num, 0) + 1);
        }
     
        int m = Integer.parseInt(br.readLine());
        String[] check = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(String num : check){
            sb.append(results.getOrDefault(num,0)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }   
}
