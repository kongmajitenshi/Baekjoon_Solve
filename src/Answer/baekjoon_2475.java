package Answer;
import java.util.Scanner;

public class baekjoon_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        int result = 0;
        
        for(int num : nums){
            result += num*num;
        }
        result = result % 10;

        System.out.println(result);
        
        sc.close();
    }
}
