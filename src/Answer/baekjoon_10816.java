package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class baekjoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] strNums = input.split(" ");
        Set<Integer> nums = new HashSet<>();
        for(int i=0; i<n; i++){
            nums.add(Integer.parseInt(strNums[i]));
        }
        String input2 = br.readLine();
        String[] strNums2 = input.split(" ");
        int[] nums2 = new int[strNums2.length];
        for(int i=0; i<nums2.length; i++){
            nums2[i] = Integer.parseInt(strNums2[i]);
        }
        int[] result = new int[strNums2.length];
        for(int num : nums2){
            // int num = Integer.parseInt(s);
            if(nums.contains(num) == true){
                // nums2에서 추출한 num 값이 Set nums 안에 있다면
                // nums2의 몇번 인덱스에 num과 같은 값이 있는지 체크하고
                // result 배열의 그 인덱스에 위치한 값을 1 증가시켜준다.
                // num이 nums2의 2번 인덱스에 위치하고 있다면, result[2] ++ 을 해주는 것.
            }
        }
    }   
}
