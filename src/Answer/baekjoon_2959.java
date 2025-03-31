package Answer;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_2959 {
    public static void main(String[] args) {
        /* 거북이는 숫자만큼 직선으로 이동 후 회전함.
         * 가장 큰 직사각형을 만들면 됨.(넓이가)
         * 가장 작은 수 * 두 번째로 큰 수 하면 가장 큰 경우의수 나옴.
         */
        Scanner sc = new Scanner(System.in);
        
        int[] nums = new int[4];

        for(int i=0; i<4; i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        System.out.println(nums[0] * nums[2]);

        sc.close();
    }
}
