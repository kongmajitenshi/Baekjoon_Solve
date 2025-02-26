package Answer;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        
        int[] nums = new int[5];
        for(int i=0; i<5; i++){
            int input = sc.nextInt();
            nums[i] = input;
            sum += input;
        }
        sc.close();

        Arrays.sort(nums);

        System.out.println(sum/5);
        System.out.println(nums[2]);
    }
}
