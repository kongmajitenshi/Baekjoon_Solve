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
            // System.out.println("naems확인: " + names[i]);
        }
        

        // StringBuilder sb = new StringBuilder();
        
        int count; 
        char check = names[0]; 
        // char[] pre = new char[N];
        char[] result = new char[N];
        for(int i=0; i<N; i++){
            count = 0;
            // pre[i] = check;
            check = names[i];
            
            for(int j=0; j<N; j++){
                if(check == names[j] && check != result[j]){
                    count++;
                    if(count > 4){
                        result[i] = check;
                        break;
                    }
                }
            }
        }

        // for(int i=0; i<result.length; i++){
        //     System.out.println("확인용: " + result[i]);
        // }
        // System.out.println("길이: " + result.length);
        if(result[0] != ' '){
            for(int i=0; i<N; i++){
                System.out.printf("%c", result[i]);    
            }
        }else{
            System.out.println("PREDAJA");
        }
        
        // System.out.println(result[0]);
        


        br.close();
    }  // main
}  // 1159