import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        // N만큼 반복해서 일단 입력 받아서 저장.
        String[] nums = new String[N];  // 처음에 입력받고 저장할 공간 마련
        int[][] xy = new int[N][2];
        for(int i=0; i<N; i++){
            nums[i] = br.readLine();
            xy[i][0] = Integer.parseInt(nums[i].split(" ")[0]);  // x값 저장
            xy[i][1] = Integer.parseInt(nums[i].split(" ")[1]);  // y값 저장
        }

        Arrays.sort(xy, (num1, num2) -> {
            if(num1[0] == num2[0]){
                return num1[1] - num2[1];  // x값이 같다면 y값의 차이를 리턴.
            }else{
                return num1[0] - num2[0];  // x값이 다르다면 x값의 차이를 리턴.
            }
        });
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            sb.append(xy[i][0] + " " + xy[i][1] + "\n");
        }

        System.out.println(sb);


        /* 2차원 배열 쓰기 전 아이디어
        int[] xs = new int[N];  // x 좌표 값들 저장
        int[] ys = new int[N];  // y좌표 값들 저장
        for(int i=0; i<N; i++){
            nums[i] = br.readLine();  // 입력받은 값 저장
            xs[i] = Integer.parseInt(nums[i].split(" ")[0]);  // xs에 x좌표 저장
            ys[i] = Integer.parseInt(nums[i].split(" ")[1]);  // ys에 y좌표 저장
        }
        */



        /* 값 잘 들어가나 확인용 
        for(int i=0; i<N; i++){
            System.out.printf("x = %d, ", xs[i]);
            System.out.println("y = " + ys[i]);
        }
        */
        

    } // main
    
} // class