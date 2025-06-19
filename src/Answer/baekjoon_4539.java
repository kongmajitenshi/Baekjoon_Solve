package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_4539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String input = br.readLine();
            int num = Integer.parseInt(input);
            // double inLen = Math.pow(10, input.length()-1);
            double dNum = (double) num;
            double result = dNum;
            for(int j=1; j<input.length(); j++){
                result = result / Math.pow(10, j);
                // System.out.println("before result: " + result);
                result = Math.round(result);
                result = result * Math.pow(10, j);
                // System.out.println("after result: " + result);
                // dNum = Math.round(num*Math.pow(10, j-1));
                // System.out.println((int)(dNum*inLen));
            }
            System.out.println((int) result);
            // System.out.println(inLen);
        }
        br.close();
    }
}
