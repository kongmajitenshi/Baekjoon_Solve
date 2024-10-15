import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1181 {
    // private static int compare(String w1, String w2){
    //     // 길이가 같은 두 단어를 매개변수로 받아옴
    //     // 그 후, 해당 알파벳의 아스키코드 값의 차이를 반환해줌.
    //     // 항상 w1 - w2를 반환함. 즉, 값이 음수라면 w2가 더 크고, 양수라면 w1가 더 큰 것.
    //     int result = 0;

    //     for(int i=0; i<w1.length(); i++){
    //         if(w1.charAt(i) != w2.charAt(i)){
    //             result = w1.charAt(i) - w2.charAt(i);
                
    //         }
    //     }
        
    //     // 두 단어의 길이가 같지 않다면 0반환
    // }

    // private static void swap(int[] wordsLen, String[] words, int j, int k){
    //     // 바꿔주는거. 여러번 나와서 메소드로 구현.
    //     // int temp = wordsLen[k];
    //     // wordsLen[k] = wordsLen[j];
    //     // wordsLen[j] = temp;
        
    //     String wordTemp = words[k];
    //     words[k] = words[j];
    //     words[j] = wordTemp;
    // }

    private static void swap(String[] words, int j, int k){
        // 바꿔주는거. 여러번 나와서 메소드로 구현.
        // int temp = wordsLen[k];
        // wordsLen[k] = wordsLen[j];
        // wordsLen[j] = temp;
        // j > k 이면, j를 뒤로 밀고 k를 앞으로 당겨오는 메소드
        String wordTemp = words[k];
        words[k] = words[j];
        words[j] = wordTemp;
        
        
    }

    // private static void del(String[] words, int k){
    //     // 중복 문자는 빈 문자열로 대체.
    //     words[k] = " ";
    // }

    public static void main(String[] args) throws IOException {
        // 문자열을 char로 분해하고, 아스키코드값의 합 순으로 정렬
        // 이렇게 하면 단순 길이 비교는 가능하지만, 알파벳 순서대로 정렬이 안됨.
        // 첫 글자의 아스키 코드 값도 따로 저장해서 비교하거나
        // 아님 그냥 length()이용하거나
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        // int[] wordsLen = new int[N];
        // int[] firstWord = new int[N];
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            words[i] = br.readLine();
            // firstWord[i] = (int) words[i].charAt(0);
            // for(int j=0; j<words[i].length(); j++){
            //     // wordsLen[i] += (int) words[i].charAt(j);
            //     wordsLen[i] = words[i].length();
            // }
        }
        
        br.close();

        for(int i=0; i<N; i++){
            boolean swapped = false;
            for(int j=i+1; j<N; j++){
                if(words[i].length() > words[j].length()){
                    swap(words, i, j);
                    swapped = true;
                }else if(words[i].length() == words[j].length() && !words[i].equals(words[j])){
                    for(int k=0; k<words[i].length(); k++){
                        if(words[i].charAt(k) > words[j].charAt(k)){
                            swap(words, i, j);
                            swapped = true;
                        }
                    }
                }
            }
            if(!swapped){
                break;
            }
        }
        sb.append(words[0]).append('\n');
        
        for(int i=1; i<N; i++){
            if(!words[i].equals(words[i-1])){
                sb.append(words[i]).append('\n');
            }
        }
            
        for(int i=0; i<N; i++){
            System.out.println(sb);
            // if(!words[i].equals("")){
            //     System.out.println(words[i]);
            // }
        }

        // for(int j=0; j<N; j++){
        //     for (int k=j; k<N; k++){
        //         // if(wordsLen[j] > wordsLen[k]){
        //         //     swap(wordsLen, words, j, k);
        //         // }else if(wordsLen[j] == wordsLen[k]){
        //         //     for(int z=0; z<words[j].length(); z++)
        //         //         if(words[j].charAt(z) > words[k].charAt(z)){
        //         //             swap(wordsLen, words, j, k);
        //         //             break;
        //         //         }
        //         //     // else if(words[j].charAt(0) > words[k].charAt(0)){
        //         //     //     swap(wordsLen, words, j, k);
        //         //     // }
        //         // }
        //     }
        // }


        // for(int j=0; j<N; j++){
        //     for(int k=j; k<N; k++){
        //         if(wordsLen[j] == wordsLen[k]){
        //             for(int x=0; x<words[j].length(); x++){
        //                 if((int)words[j].charAt(0) != (int)words[k].charAt(0)){
        //                     System.out.println("x: " + x);
        //                     if((int)words[j].charAt(0) > (int)words[k].charAt(0)){
        //                     String wordTemp = words[k];
        //                     words[k] = words[j];
        //                     words[j] = wordTemp;
        //                     }
        //                 }
        //             }
        //         }
        //     }
        // }
        // else if(wordsLen[j] < wordsLen[k]){
        //     int temp = wordsLen[j];
        //     wordsLen[j] = wordsLen[k];
        //     wordsLen[k] = temp;

        //     String wordTemp = words[j];
        //     words[j] = words[k];
        //     words[k] = wordTemp;                            
        // }
            // System.out.println(wordsLen[i]);
            // System.out.println(firstWord[i]);
    } // main 끝

} // 클래스 끝