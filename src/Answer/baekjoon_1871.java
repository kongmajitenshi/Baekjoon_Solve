package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String carNum = st.nextToken();
            String munja = carNum.split("-")[0];
            String sutja = carNum.split("-")[1];
            int munVal = 0;
            int k = munja.length() -1;
            for(int j=0; j<munja.length(); j++){
                char munCh = munja.charAt(j);
                // System.out.println("a" + (munCh-65));
                munVal += (int)(munCh - 65) * (int)Math.pow(26, k);
                // System.out.println("b" + munVal);
                k --;
            }
            int suVal = Integer.parseInt(sutja);
            // System.out.println(suVal);
            if(Math.abs(suVal-munVal) > 100){
                System.out.println("not nice");
            }else if(Math.abs(suVal-munVal) <= 100){
                System.out.println("nice");
            }
        }
        br.close();
    }
}
