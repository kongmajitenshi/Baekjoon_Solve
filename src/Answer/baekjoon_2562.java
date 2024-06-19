import java.util.Scanner;

public class baekjoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[9];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int max = nums[0];
        int count = 0;
        for(int num : nums){
            if(max < num){
                max = num;
            }
        }
        for(int num : nums){
            if(max != num){
                count ++;
            }else if(max == num){
                count ++;
                break;
            }
            
        }
        System.out.println(max);
        System.out.println(count);
        sc.close();
    }
}
