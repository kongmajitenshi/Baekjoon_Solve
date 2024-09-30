import java.util.Scanner;

public class baekjoon_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* N장의 카드 중 3장을 골라야함. N은 3 이상.
         * 딜러가 숫자 M을 외치면, 숫자 3장을 골라 M의 근사치를 만들면 됨.
         * 이 때, 카드 3장 숫자의 합이 M 이하여야함.
         * M 에서 카드 3장의 합을 뺀 숫자가 작을수록 M과 가까운 수.
         */

        int N = sc.nextInt(); // 제시되는 카드 개수. 내가 고를건 어차피 3개임
        int M = sc.nextInt(); // 이 값의 근사치 구하기
        int[] nums = new int[N]; // 입력받은 숫자들을 저장할 배열
        int sum = 0; // 숫자의 합을 저장할 변수
        int near = 0; // 최종적으로 출력할 수 저장. sum값과 비교용.

        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
        }

        for(int i=0; i<N-2; i++){
            //int j = i + 1;
            // int k = i + 2;
            // sum = nums[i] + nums[j] + nums[k];
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    //System.out.println(sum);
                    if(sum <= M && near < sum){
                        near = sum;                
                    }
                }
            }
        }
        System.out.println(near);


        sc.close();
    }
}
