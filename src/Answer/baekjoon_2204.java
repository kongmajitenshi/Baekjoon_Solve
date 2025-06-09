package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                break;
            }
            String[] oriWords = new String[n];  // 원본 단어 저장. 출력용.
            String[] words = new String[n];  // LowerCase로 저장. 실제 값 비교는 이걸로.

            for(int i=0; i<n; i++){
                oriWords[i] = br.readLine();
                words[i] = oriWords[i].toLowerCase();
            }
            String lowest = words[0];
            
            while(true){
                if(br.readLine().equals("0")){
                    break;
                }
                int cur = 0;
                String lowestWord = "";
                String currentWord = words[cur];
                // if(lowestWord.length() == currentWord.length()){  // 두 단어 길이가 같다면
                //     if(currentWord.compareTo(lowestWord) < 0){  // currentWord가 더 크면
    
                //     }else if(currentWord.compareTo(lowestWord) == 0){  // 같으면
    
                //     }else if(currentWord.compareTo(lowestWord) > 0){  // 더 작으면
    
                //     }
                // }else{  // 길이가 다르다면
                //     if(currentWord.compareTo(lowestWord) < 0){  
    
                //     }else if(currentWord.compareTo(lowestWord) == 0){  // 같으면
    
                //     }else if(currentWord.compareTo(lowestWord) > 0){  // 더 작으면
    
                //     }
                // }




                cur ++;
            }
            // 0이 나오면 break
            // 숫자 입력
            // for문을 통해 입력된 숫자만큼 반복
            // 단어 입력받음
            // 단어 크기 비교
            // 1. 첫글자 끼리 비교함. 
            // 1-1. 작으면 그거 출력
            // 1-2. 같다면 2로 넘어감
            // 2. 다음 글자 크기 비교함
            // 2-1. 다음 글자 크기 작은거 출력
            // 2-2. 다음 글자 크기 같으면 1로 넘어가 반복
            // 글자 크기 비교할 땐 모두 소문자(또는 대문자)로 바꿔서 비교함.
            // 아스키코드 값으로 비교하면 편할듯.
            // toUpperCase or toLowerCase 사용해서 통일시킨 다음 아스키코드값 비교.
            // 첫글자 값이 같다면 다음 글자로 넘어가서 비교.
            // 다음 글자 값도 같다면 그 다음으로 넘어가서 비교.
            // 아니면 글자의 아스키코드 값을 다 더해서 크기가 가장 작은거? 이런 느낌으로 가도 될듯


        }
            
        


    }
}
