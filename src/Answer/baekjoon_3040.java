package Answer;

import java.util.Scanner;

public class baekjoon_3040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];
        int num = 0;
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
            num += nums[i];
        }  // 숫자 9번 입력 받고 배열에 저장
        // System.out.println(num);
        // 배열을 돌면서 숫자를 7개 더했을 때 100인 경우만 체크해야함. 
        // 이게 단순히 0-6, 1-7, 2-8 이런식으로 돌면 안됨. 전체를 다 돌아야할듯.
        // 현재까지 더해진 숫자값을 따로 저장해서 100까지 몇 남았나 체크를 하는게 좋으려나? 정답이 무조건 있는 입력이 들어올거라서?
        // 아니면 모든 값을 다 더하고 특정 숫자들만 빼보는건 어떨까? 차라리 숫자 두개를 골라서 빼는게 더 빠를듯?
        // 모든 숫자를 다 더하고, 그 숫자에서 100을 빼면 남는 숫자가 가짜 숫자 2개의 합임.
        int difference = num - 100;
        int faker = -1, faker2 = -1;
        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                if(nums[i] + nums[j] == difference){
                    // for(int k=0; k<9; k++){
                    //     if(k == i || k == j){
                    //         continue;
                    //     }
                    //     System.out.println(nums[k]);
                    faker = i; 
                    faker2 = j;
                    // }
                }
            }
        }

        for(int i=0; i<9; i++){
            if(i != faker && i != faker2){
                System.out.println(nums[i]);
            }
        }
        sc.close();
    }
}
