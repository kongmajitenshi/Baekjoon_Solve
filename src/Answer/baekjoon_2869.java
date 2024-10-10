package Answer;
import java.util.Scanner;

public class baekjoon_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();  // 올라가는 높이
        int B = sc.nextInt();  // 떨어지는 높이
        int V = sc.nextInt();  // 올라가야할 높이
        // 마지막 날 전까진 항상 A-B로 움직이고
        // 마지막 날엔 A 만큼 움직임.
        // 며칠이 필요할지 계산하면 됨.
        // 정상 높이 / A-B + 하루 하면 됨
        double resultD = (double)(V-A)/(double)(A-B);
        int resultI = (int)Math.ceil(resultD);
        System.out.println(resultI + 1);
        //System.out.println(resultD);
        // V - A + (A-B)
        // int result = 0;
        // int day = 0;
        // while(result <= V){
        //     result += A;
        //     if(result == V){
        //         day ++;
        //         break;
        //     }
        //     result -= B;
        //     day ++;
        // }
        // System.out.println(V-A+(B%A));

        sc.close();
    }   
}
