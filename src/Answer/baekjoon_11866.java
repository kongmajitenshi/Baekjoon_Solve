package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_11866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]), k = Integer.parseInt(input.split(" ")[1]);
        int[] nums = new int[n];
        StringBuilder yose = new StringBuilder();
        int who = 0;
        int count = 0;
        int step = 0;
        yose.append("<");
        while(count<n){
            who ++;
            if(who > n) who = 1;
            if(nums[who-1] == 1) continue;
            step ++;
            // if(who > n){
            //     who %= n;
            // }
            if(step == k){
                yose.append(who);
                nums[who-1] ++;
                count ++;
                step = 0;
                if(count != n) yose.append(", ");
            }else if(nums[who-1] != 0){
                // 0이 아닌 곳은 셀 때 제외하고 세야함. 0인 인덱스만 세야함.
                // 3 -> 6 -> 2 -> 7이 나와야 함. 2 -> 7 에서 3, 6은 제외되어 4, 5, 7 3개임.
            }
            // count ++;
            // if(count == n){
            //     break;
            // }
            // yose.append(", ");
        }
        yose.append(">");
        System.out.println(yose);
    }
}
