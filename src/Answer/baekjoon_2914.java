package Answer;

import java.util.Scanner;

public class baekjoon_2914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // i는 평균값. 즉, 23.000001 도 24로 올림이 됨. 38*23.000..01 은 결국 38*23에 수렴하게됨. 그 수렴하는 값도
        // 올림을 해서 출력을 해야함. 즉, 38*(24-1)을 한 값에 +1을 해주면 최소값을 구할 수 있게 됨.
        int a = sc.nextInt(), i = sc.nextInt();  // a=곡 수, i=평균값
        sc.close();
        int result = a*(i-1)+1;

        System.out.println(result);


    }
}
