import java.util.Scanner;

public class baekjoon_1094 {
    public static void main(String[] args) {
        /* 막대 길이 64로 시작. 내가 입력한 값보다 막대 합이 크다면, 가장 짧은 막대 반토막.
         * 방금 자른 막대들 중 나머지 절반 하나 버리고, 남은 막대들 다 합친게 x이상이라면 남은 절반 버림.
         * 위 과정을 반복하고, 남은 막대들 붙여서 내가 원하는 길이 완성.
         */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();  // 입력받은 값. 내가 만들고 싶은 막대 길이
        sc.close();

        int count = 0;
        int stick = 64; // 처음엔 64 하나 가지고있음
        int sum = 0;

        while (sum != x) {
            if(stick > x){
                stick /= 2;  // stick이 x보다 클 때만 실행됨. 23 입력 시 stick이 16부턴 실행 안됨.
                continue;  // stick > x가 만족할 때 까지 나누기만 함.
            }
            if(x >= sum+stick){
                sum += stick;
                count ++; 
            }
            stick /= 2;  // stick>x 가 된 뒤부턴 여기서 반으로 나눠짐.
        }

        System.out.println(count);
   
    }
}
