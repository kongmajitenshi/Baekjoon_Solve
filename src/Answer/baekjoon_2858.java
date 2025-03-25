package Answer;
import java.util.Scanner;

public class baekjoon_2858 {
    public static void main(String[] args) {
        /* 빨간블럭 r, 갈색블럭 b, 가장자리는 r이고 가운데가 b임.
         * 입력: r b(빨강블럭개수 갈색블럭개수)
         * 출력: l w(가로 세로 길이 출력, 큰 수 먼저 출력)
         */
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), b = sc.nextInt();
        int w = 1, l = 1;
        while(true){
            l = (r+b)/w;
            if(r+b == l*w && (l-2)*(w-2) == b){
                break;
            }
            w++;
        }
        System.out.printf("%d %d\n", l, w);
        sc.close();
    }
}
