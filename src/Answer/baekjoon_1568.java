import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();
        int song = 1;
        int count = 0;
        while(N > 0){
            if(song > N){
                song = 1;
            }
            N = N - song;
            song ++;
            count ++;
            // System.out.println("N: " + N + "\nsong: " + song + "\ncount: " + count);
        }

        System.out.println(count);

    }
}
