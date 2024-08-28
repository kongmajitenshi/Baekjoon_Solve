package Answer;

import java.util.Scanner;

public class baekjoon_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N개의 정수로 이루어진 수열(둘째줄에 입력 예정)
        // N개의 정수 중 X보다 작은 값만 출력
        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] nums = new int[N];

        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            if(nums[i] < X){
                System.out.print(nums[i] + " ");
            }
        }

        sc.close();
    }
}
