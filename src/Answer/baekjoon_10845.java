package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class baekjoon_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queList = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String input = br.readLine();
            String command = input.split(" ")[0];
            if(command.equals("push")){
                int value = Integer.parseInt(input.split(" ")[1]);
                queList.add(value);
                // System.out.println("push" + value);
            }else if(command.equals("pop")){
                if (queList.isEmpty() == true) {
                    System.out.println(-1);
                }else{
                    int re = queList.removeFirst(); 
                    System.out.println(re);
                }
            }else if(command.equals("size")){
                System.out.println(queList.size());  
            }else if(command.equals("empty")){
                if (queList.isEmpty() == true) {
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(command.equals("front")){
                if (queList.isEmpty() == true) {
                    System.out.println(-1);
                }else{
                    System.out.println(queList.getFirst());
                }
            }else if(command.equals("back")){
                if (queList.isEmpty() == true) {
                    System.out.println(-1);
                }else{
                    System.out.println(queList.getLast());
                }
            }
            
        }
    }
}