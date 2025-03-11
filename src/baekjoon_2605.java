import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon_2605 {
    public static void main(String[] args) {
        /* 첫 번째는 무조건 0 -> 그냥 줄 섬
         * 두 번 째 부터는 숫자 뽑음. 인원이 n명이라면 최대 n-1 번 까지 뽑을 수 있음.
         * 뽑은 숫자 만큼 앞으로 이동. 0번 뽑을 시 맨 뒷자리.
         * <입력>
         * -----
         * 학생 수
         * 학생들이 뽑은 번호
         * -----
         * <출력>
         * -----
         * 학생들 최종 줄
         * 줄 선 순서대로 1번부터 시작. 4번째로 줄 선 학생이 4번.
         */
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        List<Integer> stu = new ArrayList<>();

        for(int i=1; i<=people; i++){
            int line = sc.nextInt();
            stu.add(stu.size() - line, i);
        }

        for(int s : stu){
            System.out.print(s + " ");
        }
        
        sc.close();
    }
}
