import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] names = new char[N];
        String firstName;
        for(int i=0; i<N; i++){
            firstName = br.readLine();
            names[i] = firstName.charAt(0);
        }
        
        boolean[] checked = new boolean[26];
        boolean found = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            if(!checked[names[i] - 'a']){
                int count = 0;
                for(int j=0; j<N; j++){
                    if(names[i] == names[j]){
                        count++;
                    }
                }
                if(count >= 5){
                    sb.append(names[i]);
                    found = true;
                }
                checked[names[i] - 'a'] = true;
            }
        }

        if(found == true){
            System.out.println(sb);
        }else{
            System.out.println("PREDAJA");
        }

        br.close();
    }  // main
}  // 1159