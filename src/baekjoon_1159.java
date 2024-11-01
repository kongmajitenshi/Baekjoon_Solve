import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] check = new int[26];
        for(int i=0; i<N; i++){
            check[br.readLine().charAt(0) - 97]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<check.length; i++){
            if(check[i] >= 5){
                sb.append((char)(i+97));
            }
        }

        if(sb.length() == 0){
            System.out.println("PREDAJA");
        }else{
            System.out.println(sb);
        }

        br.close();
    }  // main
}  // 1159