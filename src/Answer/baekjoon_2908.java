package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String n1 = input.split(" ")[0];
        String n2 = input.split(" ")[1];

        br.close();
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        sb1.append(n1).reverse();
        sb2.append(n2).reverse();
        
        n1 = sb1.toString();
        n2 = sb2.toString();
        
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        
        if(num1 > num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
