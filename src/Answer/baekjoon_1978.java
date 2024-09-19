package Answer;
import java.util.Scanner;

public class baekjoon_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // int[] nums = new int[N];
        int count = 0;
        int sosu_count = 0;
        for(int i=0; i<N; i++){
            count = 0;
            int number = sc.nextInt();
            for(int j=2; j<=number; j++){
                // if(number == 2){
                //     continue;
                // }
                if(number % j == 0){
                    count ++;
                }
            }

            if(count == 1){
                sosu_count++;
            }
        }

        System.out.println(sosu_count);
        // for(int i=0; i<nums.length; i++){
        //     nums[i] = sc.nextInt();
        //     for(int j=2; j<nums[i]; j++){
        //         if(nums[i] % j == 0){
        //             count++;
        //         }else if(nums[i] == 1){
        //             continue;
        //         }
        //     }
        // }
        // System.out.println(count);


        sc.close();
    }
}
