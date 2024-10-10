package Answer;
import java.util.Scanner;

public class baekjoon_15829 { // 50점짜리
    public static void main(String[] args) {
        // 입력받은 문자를 아스키코드값으로 변환하여 계산
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        sc.nextLine();  // nextInt() 이후 줄바꿈 제거
        String munja = sc.nextLine();
        int value = 0;
        int M = 1234567891;
        
        for(int i=0; i<num; i++){
            int N = munja.charAt(i);
            value += (N-96) * (Math.pow(31, i));
            // N-96 = 1이며, 이는 a를 뜻함.
            //System.out.println(N-96);
            //System.out.println munja.charAt(i));
            // N-96값에 31의 i승만큼 곱해줌.
        }
        System.out.println(value % M);

        sc.close();
    }
}
