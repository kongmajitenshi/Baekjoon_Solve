package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String num = br.readLine();
            if(num.equals("0")){
                break;
            }  // 0 입력 시 종료
            int sum = 0;
            while(true){
                for(int i=0; i<num.toCharArray().length; i++){
                    sum += num.charAt(i) - '0';
                    // System.out.println("sum: "+sum);
                }
                //  System.out.println("---");
                if(sum < 10){
                    break;
                }
                num = Integer.toString(sum);
                sum = 0;
            }
            System.out.println(sum);
        }  // while
        br.close();

    }  // main
}  // class
