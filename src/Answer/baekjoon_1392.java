import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1392 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2 1 3 이면 1번 2초, 2번 1초, 3번 3초 쓴다는 뜻. 즉, 0~1:1, 2:2, 3~5:3 번 악보 사용.
        // 반복문을 통해서 
        String NQ = br.readLine();
        int N = Integer.parseInt(NQ.split(" ")[0]);
        int Q = Integer.parseInt(NQ.split(" ")[1]);
        int sum = 0;

        int[] Ns = new int[N];
        for(int i=0; i<N; i++){
            Ns[i] = Integer.parseInt(br.readLine());
            //System.out.println("Ns[i]: " + Ns[i]);
            sum += Ns[i];
        }
        int[] result = new int[sum];

        int current = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<Ns[i]; j++){
                result[current] = i + 1;
                current++;
            }
        }

        int[] Qs = new int[Q];
        for(int i=0; i<Q; i++){
            Qs[i] = Integer.parseInt(br.readLine());
            //System.out.println("Qs[i]: " + Qs[i]);
        }

        for(int i=0; i<Q; i++){
            System.out.println(result[Qs[i]]);
        }
        
        br.close();

    }  // main
}  // class
