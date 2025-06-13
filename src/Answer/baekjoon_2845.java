package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int l = Integer.parseInt(input.split(" ")[0]), p = Integer.parseInt(input.split(" ")[1]);
        int[] people = new int[5];    
        input = br.readLine();
        
        for(int i=0; i<5; i++){
            people[i] = Integer.parseInt(input.split(" ")[i]);
        }

        for(int person : people){
            System.out.printf("%d ", person - l*p);
        }

        // System.out.println();
        br.close();

        ;
    }
}
