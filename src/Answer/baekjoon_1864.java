package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String input = br.readLine();
            if(input.equals("#")){
                break;
            }
            char[] inputS = input.toCharArray();
            // for(var i : inputS){
            //     System.out.println("i: "+ i);
            // }
            char[] inputSrev = new char[inputS.length];
            for(int i=inputS.length-1, j = 0; i>=0; j++, i--){
                // 입력 받은 순서의 반대로 넣음.
                // ( @ & 입력 시 실제 inputs 에는 & @ ( 순서대로 저장.
                // pow(8, 인덱스번호) 형태로 제곱할 것이기 때문
                inputSrev[j] = inputS[i];
                //System.out.println("흠: " + j +inputSrev[j]);
            } // for
            int result = 0;
            for(int i=0; i<inputSrev.length; i++){
                char word = inputSrev[i];
                //System.out.println("word: "+ i + word);
                int val = 0;
                switch (word) {
                    case '-': val=0; break;
                    case '\\': val=1; break;
                    case '(': val=2; break;
                    case '@': val=3; break;
                    case '?': val=4; break;
                    case '>': val=5; break;
                    case '&': val=6; break;
                    case '%': val=7; break;
                    case '/': val=-1; break;
                }
                //System.out.println("val: " + val);
                result += val*(Math.pow(8, i));
                //System.out.println("result: " + result);
            } // for
            System.out.println(result);
        }// while
        br.close();
    }// main
}// class
