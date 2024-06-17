package Answer;
import java.util.Scanner;

public class baekjoon_1145 { // 백준 제출 시에는 Main 클래스로 변경.
    public static void main(String[] args) { // 240331
        // int randomValue = (int) (Math.random()*100)+1; // 1~100 사이의 랜덤수;
        Scanner sc = new Scanner(System.in);
        int[] values = new int[5];
        for(int i=0; i<5; i++){
            values[i] = sc.nextInt();
        }
        int num = 1; // 배열의 최솟값부터 시작하면 더 효율적
        while(true){
            int count = 0;
            num ++;
            for(int value : values){
                if(num % value == 0){
                    count++;
                }
            }
            if(count>=3){
                break;
            }
            }
        System.out.println(num);
        sc.close();
    }
}
