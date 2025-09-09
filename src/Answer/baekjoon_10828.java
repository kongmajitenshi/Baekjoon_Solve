package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class baekjoon_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> stackList = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String input = br.readLine();
            String[] tokens = input.split(" ");
            String command = tokens[0];
            if(command.equals("push")){
                int value = Integer.parseInt(tokens[1]);
                stackList.add(value);
                // System.out.println("push" + value);
            }else if(command.equals("pop")){
                if (stackList.isEmpty() == true) {
                    System.out.println(-1);
                }else{
                    int re = stackList.removeLast(); 
                    System.out.println(re);
                }
            }else if(command.equals("size")){
                System.out.println(stackList.size());  
            }else if(command.equals("empty")){
                if (stackList.isEmpty() == true) {
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(command.equals("top")){
                if (stackList.isEmpty() == true) {
                    System.out.println(-1);
                }else{
                    System.out.println(stackList.getLast());
                }
            }
        }

        
    }
}