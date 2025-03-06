import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1526_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        while(true){
            boolean flag = true;
            for(int i=0; i<n.length(); i++){
                if(n.charAt(i) != '4' && n.charAt(i) != '7'){
                    flag = false;  // 4와 7이 아니라면 false
                    break;
                }
            }
            if(flag == true){
                break;
            }else{
                n = String.valueOf(Integer.parseInt(n) - 1);
            }
        }

        System.out.println(n);
        br.close();
    }
}