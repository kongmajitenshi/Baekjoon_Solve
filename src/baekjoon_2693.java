import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_2693 {
    public static void main(String[] args) {
        /* 입력: T 테스트케이스, A 배열(항상 10)
         * 출력: 3번째로 큰 수
         * 배열에 값을 저장하고, 그 중 세번쨰 값 출력. 
         * 그런데, 그냥 
         */
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        // int result = 0;
        for(int i=0; i<test; i++){
            int[] nums = new int[10];
            for(int j=0; j<10; j++){  // 배열에 값 저장
                nums[j] = sc.nextInt();
            }
            Arrays.sort(nums);
            System.out.println(nums[7]);
        }
        
        sc.close();

    }
}
