package Answer;
import java.util.Scanner;

public class baekjoon_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 6의 배수마다 껍데기가 하나씩 늘어남.
        // 시작이 1이라서 2~7이 첫 껍질
        // 8~19(12개)가 두번째 껍질
        // 즉, 6*껍질번호수 만큼 필요함.
        // 내가 가려는 번호가 첫 껍질 번호라면, 
        // 2개의 방을 지나는거임. 시작과 끝 포함이기 때문
        int N = sc.nextInt();

        int floor = 1;
        int start = 1;

        // floor은 현재 껍질 층 수를 뜻함.
        // start는 시작지점. 1부터 시작함.
        while(start < N){ 
            // start가 입력값보다 작은 동안만 실행됨.
            // start는 1로 시작해서, 차례대로 6, 12, 18, ..., 6*floor 만큼 계속해서 더해짐
            // 
            start += 6 * floor;
            floor ++;
        }
        
        System.out.println(floor);

        sc.close();
    }
}
