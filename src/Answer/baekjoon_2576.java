package Answer;
import java.util.Scanner;

public class baekjoon_2576 {
    public static void main(String[] args) {
        /* 입력 7개 고정
         * 입력된 수 중 홀수만
         * 1. 그 홀수들의 합 구하기
         * 2. 홀수 중 최솟값 구하기
         * 출력1 홀수 합
         * 출력2 홀수 최솟값
         * if 홀수 없음, -1출력
         */
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[7];
        int sum=0, min=100;
        
        for(int i=0; i<7; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        for(int num : nums){
            if(num%2==1){
                sum += num;
                if(min > num){
                    min = num;
                }
            }
        }
        
        if(sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum + "\n" + min);
        }
        
    }
}
