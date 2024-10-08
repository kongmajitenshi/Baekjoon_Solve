package Answer;
import java.util.Scanner;

public class baekjoon_2775 {
    public static void main(String[] args) {
        /*
         * a층의 b호에 살기 위해선 a-1(아래)층의 1호부터 b호까지 
         * 사람들의 수의 합만큼 사람들을 데려와 살아야함
         * 1층 3호에 살려면 0층 1 2 3호 합친만큼. 즉, 6명이 필요.
         * 1층 2호는 0층 1 2호 니까 3명
         * 2층 3호에 살기 위해선 1층 1 2 3 호 니까 10명
         * 2층 2호는 1층 1~2호니까 4명
         * x층 1호에는 무조건 1명만 살게 됨.
         * 3층 2호라면 2층 1~2호니까 5명
         * 3층 3호라면 15명
         * x층 1호는 1명, x층 2호는 x+2명, x층 3호는 x+2
         * 아파트는 0층부터 있고, 호 수는 1호부터 시작
         * 0층의 i호에는 i명이 살고있음.
         */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 전체 케이스 수
        int[] result = new int[T];  // 결과 저장할 배열 미리 생성

        for(int i=0; i<T; i++){
            int k = sc.nextInt(); // 층 수
            int n = sc.nextInt(); // 호 수
            int[] people = new int[n];  // 사람 수 저장할 배열 생성
            
            for(int j=0; j<n; j++){
                people[j] = j+1;  // 0층 초기화
            }

            for(int j=0; j<k; j++){  // 층 수 만큼 반복
                for(int x=1; x<n; x++){  // 호 수 만큼 반복
                    people[x] = people[x-1] + people[x];  // 이전 층의 값을 현재 층으로 더해줌
                }
            }

            result[i] = people[n-1];  // 현재 층 마지막 호 값을 결과 배열에 저장
        }

        for(int i=0; i<T; i++){
            System.out.println(result[i]);  // 결과 출력
        }

        sc.close();
    }
}
