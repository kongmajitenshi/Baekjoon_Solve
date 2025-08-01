package Answer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class baekjoon_2164 {
    public static void main(String[] args) {
        /* 카드 N개, 1부터 N까지. 맨 위에 1, 맨 아래 N 순서대로
         * 1) 제일 위 카드를 버리기(제거)
         * 2) 제일 위 카드를 맨 아래로
         * ... 카드가 한 장 남을 때 까지 반복
         * 예시) N=4 라고 하면 카드는 1234 순서
         * 1) 234
         * 2) 342
         * 다시 반복
         * 1) 43
         * 2) 34
         * 다시 반복
         * 1) 4
         * --- 종료 ---
         * 알고리즘 자체가 복잡하거나 어렵지는 않은데, 데이터 관리를 어떻게 하느냐가 중요할듯.
         * 배열을 만들어서 빈 배열을 0이나 -1로 처리해도 괜찮은데, ArrayList를 사용해도 나쁘진 않을듯.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> nums = new ArrayDeque<Integer>(N);
        for(int i=0; i<N; i++){
            nums.add(i+1);
        }

        for(int i=0; i<N-1; i++){
            nums.pollFirst();
            nums.addLast(nums.pollFirst());
        }
        
        System.out.println(nums.getFirst());

        sc.close();
    }
}