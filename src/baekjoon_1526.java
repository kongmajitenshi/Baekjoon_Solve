import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1526 {
    public static void main(String[] args) throws IOException {
        /* 금민수: 4 and 7 으로만 이루어진 수
         * 입력: 4이상, 1_000_000 이하의 자연수
         * 출력: 입력된 수 이하의 가장 큰 금민수
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        boolean change = false;
        for(int i=0; i<input.length; i++){
            int current = input[i] - '0';
            if(i == 0){
                if(current >=7){
                    current = 7;
                    change = true;
                }else if(current >=4){
                    current = 4;
                    change = true;
                }else{
                    current = 0;
                    change = true;
                }
                input[i] = Character.forDigit(current, 10);
                continue;
            }
            if(change == true){
                current = 10;
                if(current >=7){
                    current = 7;
                }else if(current >=4){
                    current = 4;
                }else{
                    current = 0;
                }
            }
            if(current >=7){
                current = 7;
            }else if(current >=4){
                current = 4;
            }else{
                current = 0;
            }
            input[i] = Character.forDigit(current, 10);
        }
        
        for(var i : input){
            if(i != '0'){
                System.out.print(i);
            }
        }
        // for(int i=0; i<input.length; i++){
        //     System.out.println(input[i]);
        // }
            br.close();
    }
}
