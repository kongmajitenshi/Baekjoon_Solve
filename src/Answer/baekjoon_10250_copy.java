package Answer;
import java.util.Scanner;

public class baekjoon_10250_copy {
    public static void main(String[] args) {
        // 각 층마다 W개의 방, 총 H층의 건물
        // 방 번호는 YYXX 형태. Y는 층 수, X는 엘리베이터로부터의 거리
        // 층 수와 상관 없이, 엘리베이터와 가까울 수록 선호도가 높음 (ex: 선호도 - 2101 > 103)
        // 높이가 6이라면, 10번 째 손님은 402호에 배정됨. (1~6번쨰는 101~601호, 7~10은 102~402호)

        Scanner sc = new Scanner(System.in);

        int H, W, N;  // H높이 W너비 N몇번째손님
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();
            
            if(N%H == 0){
                System.out.println((H * 100) + (N / H));
            }else{
                System.out.println(((N % H) * 100) + ((N / H) + 1));
            }

        }
        sc.close();
    }
}
