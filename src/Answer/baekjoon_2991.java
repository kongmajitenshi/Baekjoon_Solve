package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        int a = Integer.parseInt(input.split(" ")[0]), b = Integer.parseInt(input.split(" ")[1]),
        c = Integer.parseInt(input.split(" ")[2]), d = Integer.parseInt(input.split(" ")[3]);

        input = br.readLine();
        // int p = Integer.parseInt(input.split(" ")[0]), m = Integer.parseInt(input.split(" ")[1]),
        // n = Integer.parseInt(input.split(" ")[2]);
        br.close();
        // int check = 0, count = 0;

        for(int i=0; i<3; i++){
            int count = 0;
            int person = Integer.parseInt(input.split(" ")[i]);
            int d1 = person % (a+b);  // 나머지가 0이라면, 휴식 시간에 걸친 것.
            int d2 = person % (c+d);

            if(d1 <= a && d1 != 0) count++;
            if(d2 <= c && d2 != 0) count++;

            System.out.println(count);
        }       
        
        
    }
}
