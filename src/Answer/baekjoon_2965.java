package Answer;
import java.util.Scanner;

public class baekjoon_2965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];
        for(int i=0; i<3; i++){
            nums[i] = sc.nextInt();
        }
        int max = 0;
        if(nums[1] - nums[0] > nums[2] - nums[1]){
            max = nums[1] - nums[0] - 1;
        }else if(nums[2] - nums[1] > nums[1] - nums[0]){
            max = nums[2] - nums[1] - 1;
        }else if(nums[2] - nums[1] == nums[1] - nums[0]){
            max = nums[2] - nums[1] - 1;
        }

        System.out.println(max);

        sc.close();
    }
}
