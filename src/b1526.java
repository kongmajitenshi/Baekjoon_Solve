import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        while(true){
            boolean check = true;
            for(int i=0; i<num.length(); i++){
                if(num.charAt(i) != '4' && num.charAt(i) != '7'){
                    check = false;
                    // System.out.println("오: " + num.charAt(i));
                    break;
                }
            }
            if(check == true){
                break;
            }else{
                num = String.valueOf(Integer.parseInt(num) - 1);
                // System.out.println("num: " + num);
            }
        }
        System.out.println(num);

        br.close();


    }
}
