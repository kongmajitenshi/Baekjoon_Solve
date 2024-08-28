import java.util.Scanner;

public class baekjoon_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        // a ~ z 개수 26개
        /* S를 순회하면서 각 단어의 인덱스 번호를 기억.
        S에 없다면 -1을 출력
        아스키 코드 값 'a' ~ 'z' 돌면서 해당하는 알파벳이 S의 몇번째 인덱스에 있는지 확인
        없다면 -1
        */
        int[] check = new int[26];
        for(int i=0; i<check.length; i++){
            check[i] = -1;
        }
        int ascii = 97;  // 'a'

        for(int i=0; i<26; i++){
            char ch = (char)ascii;
            for(int j=0; j<S.length(); j++){
                if(ch == S.charAt(j)){
                    check[i] = S.indexOf(ch);
                }
                /* 
                else문으로 -1로 초기화 했었으나, 이중배열이라 n 제외 나머지 모두가 -1로
                초기화 되는 문제가 발생함. 처음부터 -1로 초기화 한 다음, 단어가 있는 부분만
                인덱스 정보를 저장하는 형태로 변경,
                */
            }
            ascii++;
        }

        for(var num : check){
            System.out.print(num + " ");
        }

        sc.close();
    }
}
