package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baekjoon_1159_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] names = new char[N];
        String firstName;
        for(int i=0; i<N; i++){
            firstName = br.readLine();
            names[i] = firstName.charAt(0);  // 첫 글자만 저장
        }
        
        boolean[] checked = new boolean[26];  // 알파벳 체크
        boolean found = false;  // count가 5이상인게 하나라도 있나 체크
        List<Character> result = new ArrayList<>();

        for(int i=0; i<N; i++){
            if(!checked[names[i] - 'a']){ 
                int count = 0;
                for(int j=0; j<N; j++){
                    if(names[i] == names[j]){
                        count++;
                    }
                }
                if(count >= 5){
                    result.add(names[i]);
                    found = true;
                }
                checked[names[i] - 'a'] = true;
            }
        }
        Collections.sort(result);
        
        if(found == true){
            for(char r : result){
                System.out.print(r);
            }
            System.out.println();
        }else{
            System.out.println("PREDAJA");
        }

        br.close();
    }  // main
}  // 1159