package Answer;
import java.util.Scanner;

public class baekjoon_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];

        // add values in 'nums'
        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
        }

        // find max
        int max = -1_000_000;
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        
        // find min
        int min = 1_000_000;
        for(int i=0; i<nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        
        System.out.printf("%d %d \n", min, max);


        sc.close();
    }
}
