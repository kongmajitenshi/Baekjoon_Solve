import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int test = Integer.parseInt(br.readLine());
        
        for(int i=0; i<test; i++){
            int result = 0;
            boolean[] check = new boolean[10];
            String num = br.readLine();
            for(int j=0; j<num.length(); j++){
                int n = Character.getNumericValue(num.charAt(j));
                check[n] = true;
            }
            for(boolean c : check){
                if(c == true){
                    result ++;
                }
            }

            System.out.println(result);
        }
        
        br.close();
        
    }
}
