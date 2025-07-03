package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int hour = Integer.parseInt(input.split(" ")[0]);
        int minute = Integer.parseInt(input.split(" ")[1]);
        int add = Integer.parseInt(br.readLine());
        
        // if(minute + add == 60){
        //     hour ++;
        //     minute = 0;
        // }
        if(minute + add >= 60){
            int hmm = 0;
            hmm = (minute+add)/60;
            hour += hmm;
            minute = (minute+add)%60;
        }else{
            minute += add;
        }

        if(hour >= 24){
            hour = hour%24;
        }
        System.out.println(hour + " " + minute);
    } 
}
