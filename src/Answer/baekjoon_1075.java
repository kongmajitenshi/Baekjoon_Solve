import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());
        int F = Integer.parseInt(in.readLine());

        in.close();

        int answer = N - (N%100);
        
        while(true){
            if(answer%F == 0){
                break;
            }
            answer++;
        }

        if(answer%100<10){
            System.out.println("0"+answer%100);
        }else{
            System.out.println(answer%100);
        }

        // while(answer%100*100 <= answer && answer <= (answer%100+1)*100){
        //     small = answer % 100; // 10의 자리만 추출
            
        //     if(answer > small){
        //         answer = small;
        //     }

        //     if(answer > answer%100*100){
        //         answer -= F;
        //     }else if(answer < answer%100*100){
        //         answer += F;
        //     }
            
        // }

        // for(int i=0; i<100/F; i++){
        //     small = answer % 100;
        //     answer += F;
        //     if(answer > small){
        //         answer = small;
        //     }
        // }

        // answer = N - (N%F);

        // for(int i=0; i<100/F; i++){
        //     small = answer % 100;
        //     answer -= F;
        //     if(answer > small){
        //         answer = small;
        //     }
        // }

        
    }
}
