import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nml = br.readLine();
        int N = Integer.parseInt(nml.split(" ")[0]);  // 1부터 N까지 자리에 앉음. 즉 인원은 M명
        int M = Integer.parseInt(nml.split(" ")[1]);  // 공 던지는 횟수. 한 사람이 M회 받으면 종료.
        int L = Integer.parseInt(nml.split(" ")[2]);  // 현재 공을 잡은 사람은 자기 위치 기준 L번째로 공을 던질거임.
        br.close();

        // 시계방향은 +로 할거고, 반시계는 -로 할거임.
        int[] people = new int[N];
        int num = 0;
        int count = 0;
        people[0] ++;  // 1번(0번인덱스) 자리 받고 시작.

        while(true){
            if(people[num] >= M){
                break;
            }
            if(people[num] % 2 == 1){ // 공을 받은 횟수가 홀수라면.
                num += L;  // 시계방향
                if(num >= N){
                    num = num - N;
                }
            }else if(people[num] % 2 == 0){  // 공을 받은 횟수가 짝수라면.
                num -= L;  // 반시계 방향
                if(num < 0){
                    num = N + num;
                }
            }
            people[num] ++;
            count ++;
        }
        System.out.println(count);
    } // main
}
