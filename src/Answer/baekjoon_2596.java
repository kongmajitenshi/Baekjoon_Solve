package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2596 {
    public static int ota(String a, String b){
        int difference = 0;
        for(int i=0; i<6; i++){
            if(a.charAt(i) != b.charAt(i)) difference++;
        }
        return difference;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
        String[] words2 = {"A", "B", "C", "D", "E", "F", "G", "H"};
        // String A = "000000", B = "001111",  C = "010011",  D = "011100",  E = "100110",  F = "101001",  G = "110101",  H = "111010";
        String word = br.readLine();
        /* 반복문을 만들어야함
         * 0번~5번, 6~11번, 12~17번, ... 6개씩 검사하는 반복문.
         * 최대 반복 횟수는 n번인데, 중간에 모르는게 뜨면 반복문을 탈출함.
         */
        StringBuilder sb = new StringBuilder();
        // int idk = 0;
        Boolean check = false;
        for(int i=0; i<n; i++){
            // if(check == true){
            //     break;
            // }
            // 한글자 오타까지는 봐줌. 000001 이 입력된다면 얘까진 A라고 인정해줌.
            // 그러면 오타 체크하는 파트를 만들어야함. switch case 문을 쓰면 안될듯.  
            String checking = word.substring(i*6, i*6+6);
            for(int j=0; j<8; j++){
                int count = ota(words[j], checking);  // A와 checking간 오타 개수 측정. count가 2 이상이면 모르는 글자임.
                if(count < 2){
                    sb.append(words2[j]);
                    check = true;
                    break;
                }
                // else if(count >= 2){
                    //     check = true;
                    //     idk = j;
                    //     break;
                    // }
                    
                }
            if(check == false){
                System.out.println(i+1);
                break;
            }
            // 문제는 ABCDEFGH 하나하나 반복을 다 해봐야 한다는 것. 이것도 스위치 케이스로 하면 되려나?
            // 일단 만들고 수정은 나중에 하자. 처음부터 완벽할 순 없음.
            
            // switch (checking) {
            //     case "000000": sb.append("A"); break;
            //     case "001111": sb.append("B"); break;
            //     case "010011": sb.append("C"); break;
            //     case "011100": sb.append("D"); break;
            //     case "100110": sb.append("E"); break;
            //     case "101001": sb.append("F"); break;
            //     case "110101": sb.append("G"); break;
            //     case "111010": sb.append("H"); break;
            //     default: check = true; idk = i+1; break;
            // }
        }
        System.out.println(sb);
        br.close();
        // if(check == true){
        //     System.out.println(idk);
        // }else{
        //     System.out.print(sb);
        // }
    }
}
