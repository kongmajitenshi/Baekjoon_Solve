import java.util.Scanner;

public class baekjoon_1855 {
    public static void main(String[] args) {
        /* 3과 abcdefghijkl 을 입력하면 
         * aei
         * bfj
         * cgk
         * dhl
         * 이렇게 채워짐.
         * 암호화 할 땐 좌>우, 우>좌 순으로 읽는걸 반복함.
         * aeijfbcgklhd 이렇게 암호화가 됨.
         * 출력은 기존의 문자열을 출력해야함. 즉, 역순으로 따라 올라가면 됨.
         * aei bfj cgk dhl 으로 먼저 정리를 함.
         * 그 뒤에, 0번 인덱스부터 열이 3개니까 +3씩 늘어나면서 체크를 하면 됨.
         * i=0; i<(글자 수 / 3(열의 수)); i++ 만큼 반복하고
         * 한 번 반복 할 때 인덱스 번호를 3(열의 수)씩 늘리면서 셈.
         * 그러면 abcd efgh ijkl 이렇게 정렬이 될 것.
         */
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String eng = sc.nextLine();
        sc.close();

        String[] text = new String[eng.length()/k];
        // StringBuilder sb = new StringBuilder();

        for(int i=0; i<text.length; i++){
            int start = i*k;
            int end = start + k;
            text[i] = eng.substring(start, end);
        }
        
        for(int i=1; i<text.length; i+=2){
            text[i] = new StringBuilder(text[i]).reverse().toString();
        }
        
        
        // for(String t : text){
        //     //sb.append(t);
        //     System.out.println(t);
        // }
        //System.out.println(sb);

        for(int i=0; i<eng.length()/text.length; i++){
            for(int j=0; j<text.length; j++){
                System.out.print(text[j].charAt(i));
            }
        }
    }
}
