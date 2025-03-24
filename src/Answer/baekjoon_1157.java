package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        int[] count = new int[26];

        input = input.toLowerCase();
        // System.out.println(input);
        for(int i=0; i<input.length(); i++){
            count[input.charAt(i) - 'a']++;
        }
        
        int max = 0;
        
        String output = "";
        for(int i=0; i<count.length; i++){
            if(count[i] != 0 && count[i] > max){
                max = count[i];
                output = String.valueOf((char) ('a' + i));
            }else if(count[i] != 0 && count[i] == max){
                output = "?";
            }
        }

        System.out.println(output.toUpperCase());

        br.close();
    }
}