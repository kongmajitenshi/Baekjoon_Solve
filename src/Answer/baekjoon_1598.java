package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1598 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String nums = input.readLine();
        int n1 = Integer.parseInt(nums.split(" ")[0]) - 1;
        int n2 = Integer.parseInt(nums.split(" ")[1]) - 1;
        int count = 0;
        input.close();
        // 그냥 1을 기준으로 칸 수를 세면 될듯. 11 이면 9~12 라인이니까 2칸. 이런 식으로.
        int bigger = n1;
        int smaller = n2;
        if(n2 > n1){
            bigger = n2;
            smaller = n1;
        }
        
        // 가로 길이 판별
        for(int i=0; i<bigger/4; i++){
            count++;
        }
        for(int i=0; i<smaller/4; i++){
            count--;
        }

        // 세로 길이 판별
        if(bigger%4 > smaller%4){
            count += bigger%4 - smaller%4;
        }else if(bigger%4 < smaller%4){
            count += smaller%4 - bigger%4;
        }

        // if(bigger%4 == 0){
        //     count += 0;
        // }else if(bigger%4 == 1){
        //     count += 1;
        // }else if(bigger%4 == 2){
        //     count += 2;
        // }else if(bigger%4 == 3){
        //     count += 3;
        // }

        //count -= smaller%4;
        //sero(n1, n2, count);


        // if(val>=4){
        //     // 세로 거리
            
    
        //     // 가로 거리
        //     if(n1%4==0){
        //         n1 = n1/4 - 1;
        //     }else{
        //         n1 = n1/4;
        //     }
            
        //     if(n2%4==0){
        //         n2 = n2/4 - 1;
        //     }else{
        //         n2 = n2/4;
        //     }
    
        //     // count += n2-n1;
        // }else if(val<4){
        //     count += n2 - n1;
        // }
        // if(val<=4){
        //     count += val/4;
        // }else if(val>4){
        //     count += val/4 + 1;
        // }


        // if(n2%4 != 0){
        //     count += val/4 + val%4 + 1;
        // }else{
        //     count += val/4 + val%4;
        // }

        System.out.println(count);
    }
}
