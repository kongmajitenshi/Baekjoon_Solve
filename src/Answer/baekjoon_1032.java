package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] files = new String[N];

        for(int i=0; i<N; i++){
            files[i] = br.readLine();
        }

        // if(files.length == 1){
        //     System.out.println(files[0]);
        // }

        br.close();

        Boolean[] same = new Boolean[files[0].length()];
        Arrays.fill(same, true); // same 배열 true로 초기화

        for(int i=1; i<N; i++){
            int i2 = i-1;
            for(int j=0; j<same.length; j++){
                if(files[i].charAt(j) != files[i2].charAt(j)){
                    same[j] = false;
                }
            }
        }

        char[] file = new char[files[0].length()];

        for(int i=0; i<files[0].length(); i++){
            file[i] = files[0].charAt(i);
        }

        for(int i=0; i<same.length; i++){
            if(same[i] == false){
                file[i] = '?';
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<file.length; i++){
            sb.append(file[i]);
        }
        
        System.out.println(sb);
    } // main
} // 1032