package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[2_000_001];

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            nums[Integer.parseInt(br.readLine()) + 1_000_000]++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                sb.append(i-1_000_000).append('\n');
            }
        }

        System.out.println(sb);
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // bw.flush();
        // bw.close();
    }
}
