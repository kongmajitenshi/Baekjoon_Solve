package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]), m1 = Integer.parseInt(input.split(" ")[1]), 
        m2 = Integer.parseInt(input.split(" ")[2]), t = Integer.parseInt(input.split(" ")[3]), r = Integer.parseInt(input.split(" ")[4]);
        // N = 운동 N분, m1 = 초기 맥박. 맥박이 m보다 작아지면 안됨, m2 = 최대 맥박(넘어가면안됨, M까진 됨), T = 맥박 증가량, R = 휴식하면 R만큼 맥박 감소
        // 운동 N분 하는데 필요한 최소한의 시간 출력(휴식이나 운동은 1분 단위임. 운동 1 휴식 1 하면 총 2분 소모)
        // 예시: 5 70 120 25 15 -> 운동 5분, 초기맥박 70, 최대맥박 120, 운동하면 맥박 25씩 증가, 휴식하면 맥박 15씩 감소
        int count = 0;  // 시간 체크
        int countEx = 0; // 운동시간 체크
        int current = m1;
        // if(current + t > m2){
        //     System.out.println(-1);
        //     return;
        // }
        while(countEx < n){
            // System.out.printf("%d %d %d\n",current, t, m2 );
            if(countEx == 0 && current + t > m2){
                count = -1;
                break;
            }
            if(current + t <= m2){
                current += t;
                countEx ++;
                count ++;
            }else if(current + t > m2){
                if(current - r < m1){
                    current = m1;
                    count ++;
                    continue;
                }
                current -= r;
                count ++;
            }
            // }else if(current + t > m2 && current - r < m1){
            //     current = m1;
            //     count ++;
            // }
        }
        // System.out.printf("%d %d %d %d %d\n", n, m1, m2, t, r);
        System.out.println(count);
    }
}
