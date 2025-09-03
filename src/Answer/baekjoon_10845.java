package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String input = br.readLine();
            String command = input.split(" ")[0];
            if(command.equals("push")){
                int value = Integer.parseInt(input.split(" ")[1]);
            }else if(command.equals("pop")){
                
            }else if(command.equals("size")){

            }else if(command.equals("empty")){

            }else if(command.equals("front")){

            }else if(command.equals("back")){

            }
            
        }
    }
}