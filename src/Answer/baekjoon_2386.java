package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   

        while(true){
            String input = br.readLine();
            char word = input.split(" ")[0].charAt(0);
            int count = 0;
            char[] sentence = new char[250]; 

            for(int i=1; i<input.split(" ").length; i++){
                sentence = input.split(" ")[i].toCharArray();
                for(char sen : sentence){
                    if(word == Character.toLowerCase(sen)){
                        count ++;
                    }
                }
                
            }
            if(input.equals("#")){
                break;
            }
            System.out.println(word + " " + count);
        }
        br.close();


    }
}