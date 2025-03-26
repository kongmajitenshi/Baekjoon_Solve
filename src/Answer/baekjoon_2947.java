package Answer;
import java.util.Scanner;

public class baekjoon_2947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        
        for(int i=0; i<5; i++){
            nums[i] = sc.nextInt();
        }

        while(true){
            int temp = 0;
            for(int i=0; i<5-1; i++){
                if(nums[i] > nums[i+1]){
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    System.out.printf("%d %d %d %d %d \n", nums[0], nums[1], nums[2], nums[3], nums[4]);
                }    
            }
            // if(nums[0] > nums[1]){
            //     temp = nums[0];
            //     nums[0] = nums[1];
            //     nums[1] = temp;
            //     System.out.printf("%d %d %d %d %d \n", nums[0], nums[1], nums[2], nums[3], nums[4]);
            // }
            // if(nums[1] > nums[2]){
            //     temp = nums[1];
            //     nums[1] = nums[2];
            //     nums[2] = temp;
            //     System.out.printf("%d %d %d %d %d \n", nums[0], nums[1], nums[2], nums[3], nums[4]);
            // }
            // if(nums[2] > nums[3]){
            //     temp = nums[2];
            //     nums[2] = nums[3];
            //     nums[3] = temp;
            //     System.out.printf("%d %d %d %d %d \n", nums[0], nums[1], nums[2], nums[3], nums[4]);
            // }
            // if(nums[3] > nums[4]){
            //     temp = nums[3];
            //     nums[3] = nums[4];
            //     nums[4] = temp;
            //     System.out.printf("%d %d %d %d %d \n", nums[0], nums[1], nums[2], nums[3], nums[4]);
            // }
            // System.out.printf("%d %d %d %d %d \n", nums[0], nums[1], nums[2], nums[3], nums[4]);
            if(nums[0] == 1 && nums[1] == 2 && nums[2] == 3 && nums[3] == 4 && nums[4] == 5){
                break;
            }else{
                continue;
            }
        }

        sc.close();

    }
}
