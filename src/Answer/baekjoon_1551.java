package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        int[] suyeol = new int[n];
        st = new StringTokenizer(br.readLine(), ",");
        for(int j=0; j<n; j++){
            suyeol[j] = Integer.parseInt(st.nextToken());
        }
        // int[] su2 = new int[n];
        // for(int i=0; i<n; i++){
        //     su2[i] = suyeol[i];
        // }
        for(int i=0; i<k; i++){
            // System.out.println("-----" + i + "-----");
            for(int j=0; j<n-i-1; j++){
                // int[] su2 = new int[n-j];
                // if(j == 0){
                //     int n1 = suyeol[j], n2 = suyeol[j+1]; 
                //     su2[j] = n2 - n1;
                // }else{
                //     int n1 = su2[j], n2 = su2[j+1];
                //     su2[j] = n2 - n1;
                // }
                // int n1 = suyeol[j], n2 = suyeol[j+1]; 
                int n1 = suyeol[j], n2 = suyeol[j+1]; 
                suyeol[j] = n2 - n1;
                
            }
        }
        for(int i=0; i<n-k; i++){
            if(i == n-k-1){
                System.out.printf("%d", suyeol[i]);    
            }else{
                System.out.printf("%d,", suyeol[i]);
            }
        }
        System.out.println();
        br.close();
    }
}
