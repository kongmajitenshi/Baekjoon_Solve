package Answer;
import java.util.Scanner;

public class baekjoon_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] xywh = new int[4];
        int[] results = new int[4];
        int x, y, w, h;
        for(int i=0; i<xywh.length; i++){
            xywh[i] = sc.nextInt();
        }
        x = xywh[0];
        y = xywh[1];
        w = xywh[2];
        h = xywh[3];
        // x랑 y는 비교해봐야 하는 값.
        // 0+x랑 w-x 비교, 0+y랑 h-y 비교
        // 모든 값 저장 후, 가장 작은 값 출력하면 됨
        results[0] = 0+x;
        results[1] = w-x;
        results[2] = 0+y;
        results[3] = h-y;

        int min = results[0];

        for(var result : results){
            if(min > result){
                min = result;
            }
        }
        System.out.println(min);

        sc.close();
    }
}
