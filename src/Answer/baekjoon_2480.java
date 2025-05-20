package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[3];
        for(int i=0; i<3; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        if(nums[0] == nums[1] && nums[1] == nums[2]){
            System.out.println(10000 + nums[2] * 1000);
        }else if(nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]){
            int big = 0;
            for(int j=0; j<3; j++){
                if(nums[j] > big){
                    big = nums[j];
                }
            }
            System.out.println(big * 100);
        }else{
            if(nums[0] == nums[1]){
                System.out.println(1000 + nums[0] * 100);
            }else if(nums[0] == nums[2]){
                System.out.println(1000 + nums[0] * 100);
            }else if(nums[1] == nums[2]){
                System.out.println(1000 + nums[1] * 100);
            }
        }
        // int[] counts = new int[7];
        // int big = 0;
        // for(int i=0; i<3; i++){
        //     int num = Integer.parseInt(st.nextToken());
        //     counts[num] ++;
        //     if(num > big){
        //         big = num;
        //     }
        // }

        // for(int i=0; i<7; i++){
        //     int p3 = 0, p2 = 0, p1 = 0;
            
        //     if(counts[i] >= 3){
        //         p3 += 10000 + (i * 1000);
        //         // System.out.println(10000 + ((i) * 1000));
        //         break;
        //     }else if(counts[i] >= 2){
        //         p2 += 1000 + (i * 100);
        //         // System.out.println(1000 + ((i) * 100));
        //         break;
        //     }else if(counts[i] >= 1){
        //         p1 += big * 100;
        //         // System.out.println(big * 100);
        //         break;
        //     }

        //     if(p3 != 0){
        //         System.out.println(p3);
        //     }else if(p3 == 0 && p2 != 0){
        //         System.out.println(p2);
        //     }else if(p2 == 0){
        //         System.out.println(p1);
        //     }
        // }

        br.close();

    }
}

