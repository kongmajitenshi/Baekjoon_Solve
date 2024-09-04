package Answer;
import java.util.Scanner;

public class baekjoon_4153 {
    public static void main(String[] args) {
        /* 숫자 a, b, c 를 입력받고, a*a + b*b = c*c 를 만족한다면
         * right, 만족하지 않는다면 wrong를 출력.
         * 입력으로 0 0 0 이 들어올 때 까지 반복한다.
         * 배열로는 풀 수
         */
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        // int count = 0;
        // boolean rw;
        
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            
            if(a == 0 && b == 0 && c == 0){
                break;
            }
            if((a*a) + (b*b) == (c*c) || (c*c) + (b*b) == (a*a) || (a*a) + (c*c) == (b*b)){
                // rw = true;
                System.out.println("right");
            }else{
                // rw = false;
                System.out.println("wrong");
            }
            
            //count ++;
            
        }
       //  boolean[] results = new boolean[count];
        
        sc.close();
    }
}
