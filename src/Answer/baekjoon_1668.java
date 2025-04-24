package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1668 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int lcount = 0, rcount = 0, lbig = 0, rbig = 0;
        int[] trophies = new int[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            trophies[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        
        for(int i=0; i<n; i++){
            int current = trophies[i];
            if(current > lbig){
                lbig = current;
                lcount++;
            }
        }
        
        for(int i=n-1; i>=0; i--){
            int current = trophies[i];
            if(current > rbig){
                rbig = current;
                rcount ++;
            }
        }

        System.out.println(lcount);
        System.out.println(rcount);
    }
}
