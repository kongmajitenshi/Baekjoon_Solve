package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String word = br.readLine();
        /* 반복문을 만들어야함
         * 0번~5번, 6~11번, 12~17번, ... 6개씩 검사하는 반복문.
         * 최대 반복 횟수는 n번인데, 중간에 모르는게 뜨면 반복문을 탈출함.
         */
        StringBuilder sb = new StringBuilder();
        int idk = 0;
        Boolean check = false;
        for(int i=0; i<n; i++){
            if(check == true){
                break;
            }
            String checking = word.substring(i*6, i*6+6);
            switch (checking) {
                case "000000": sb.append("A"); break;
                case "001111": sb.append("B"); break;
                case "010011": sb.append("C"); break;
                case "011100": sb.append("D"); break;
                case "100110": sb.append("E"); break;
                case "101001": sb.append("F"); break;
                case "110101": sb.append("G"); break;
                case "111010": sb.append("H"); break;
                default: check = true; idk = i+1; break;
            }
        }
        if(check == true){
            System.out.println(idk);
        }else{
            System.out.print(sb);
        }
        br.close();
    }
}
