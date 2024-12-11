import java.util.Scanner;

public class baekjoon_2163 {
    public static void main(String[] args) {
        // N * M 크기의 초콜릿. 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.close();
        // 처음에 n-1번만큼 쪼갬. 그럼 n개의 초콜릿이 생기고, n개의 초콜릿을 m-1번 쪼갬.
        // 즉, n-1 + n*(m-1) 을 하는거임.
        System.out.println((n-1) + n*(m-1));
    }
}
