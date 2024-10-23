package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2460 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String people;
        int out, in, result = 0, big = 0;
        for(int i=0; i<10; i++){
            people = input.readLine();
            out = Integer.parseInt(people.split(" ")[0]);
            in = Integer.parseInt(people.split(" ")[1]);

            result -= out;
            result += in;
            if(result > big){
                big = result;
            }
        }
        input.close();

        System.out.println(big);
        
    }
}
