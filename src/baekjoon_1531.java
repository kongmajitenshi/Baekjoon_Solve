import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1531 {
    public static void main(String[] args) throws IOException {
        /* 내용 정리
         * 100*100의 그림을 가지고 있음
         * N개의 종이로 그림을 가렸고, M개 초과만큼 올려야 그림이 안보임.
         * 입력: N M(N:종이개수 M:M개 초과 올려야 그림 안보임)
         * 입력: lx ly rx ry(왼쪽 아래 모서리 x,y 좌표 오른쪽 위 모서리 x,y좌표)(N만큼 반복)
         * 출력: 보이지 않는 그림의 개수
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input.split(" ")[0]), m = Integer.parseInt(input.split(" ")[1]);
        int size = 0;
        for(int i=0; i<n; i++){
            int[] eren = new int[4];
            input = br.readLine();
            for(int j=0; j<4; j++){
                eren[j] = Integer.parseInt(input.split(" ")[j]);
            }
            size += (eren[3] - eren[1] + 1) * (eren[2] - eren[0] + 1);  
            // +1을 안해주면 첫 칸 제외하게 됨. 시작 칸도 포함이라 +1 해줘야함.
            /* if 종이 겹친 개수 m개 초과한다면
             * size += (eren[3] - eren[1]) * (eren[2] - eren[0]);
             * 단순히 크기만 계산해선 안됨.
             * 21 21 80 80 
             * 41 41 60 60 
             * 까지 계산해보면, 41 41 60 60 부분이 겹침. 즉 19*19 부분은 그림이 안보임.
             * 71 71 90 90 까지 껴본다면, 71 71 80 80 까지가 겹침. 즉, 9*9부분은 그림이 안보임.
             */
            System.out.println(size);
        }
    }
}
