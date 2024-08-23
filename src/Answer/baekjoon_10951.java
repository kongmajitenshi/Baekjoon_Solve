package Answer;

import java.util.Scanner;

public class baekjoon_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Scanner - hasNext Method
        // hasNext() 메소드는 boolean 타입을 반환한다. 반환할 값이 있다면 True, 없다면 False를 반환한다.
        // IDE마다 다르니 참고해야함.
        while(sc.hasNext()){
            int A = sc.nextInt();
            int B = sc.nextInt();
    
            System.out.println(A+B);
        }

        sc.close();
    }
}
