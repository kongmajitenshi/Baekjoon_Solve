package Answer;
import java.util.Scanner;

public class baekjoon_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String numbers = Integer.toString(A*B*C);

        int count = 0;

        for(int i=0; i<10; i++){
            count = 0;
            for(int j=0; j<numbers.length(); j++){
                if(i == Character.getNumericValue(numbers.charAt(j))){
                    count++;
                }
            }
            System.out.println(count);
        }

        sc.close();
    }
}
