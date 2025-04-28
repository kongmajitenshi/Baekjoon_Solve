package Answer;

import java.util.Scanner;

public class baekjoon_1834 {
    public static void main(String[] args) {
        // 나머지가 자기 자신 이상이 될 수 없음. n=3인 경우, 나머지 몫과 나머지가 같아야 하는데 몫=3, 나머지=3이 불가능함. 나머지는 0, 1, 2 까지만 가능.
        // 즉, 나머지는 n-1까지 가능한 것. 반복 자체도 n-1 까지만 하면 되는것. i=0인 경우는 나머지가 0인 경우라서 제외.
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long sum = 0;
        
        for(int i=1; i<=n-1; i++){
            sum += n*i + i;
        }
        System.out.println(sum);

        sc.close();
    }
}
