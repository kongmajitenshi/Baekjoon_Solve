import java.util.Scanner;

public class baekjoon_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* N장의 카드 중 3장을 골라야함. N은 3 이상.
         * 딜러가 숫자 M을 외치면, 숫자 3장을 골라 M의 근사치를 만들면 됨.
         * 이 때, 카드 3장 숫자의 합이 M 이하여야함.
         */

        int N = sc.nextInt(); // 제시되는 카드 개수. 내가 고를건 어차피 3개임
        int M = sc.nextInt(); // 이 값의 근사치 구하기

        sc.close();
    }
}
