package Answer;
import java.util.Scanner;

public class baekjoon_1233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt(), s2 = sc.nextInt(), s3 = sc.nextInt();
        sc.close();
        int[] sums = new int[s1+s2+s3 + 1];  // 크기가 s1 s2 s3의 합인 int 배열 생성. 모든 경우의수 합 체크할거임.
        // 해당 인덱스+1이 가장 빈도가 높은 것. 배열에는 몇 번 등장했는지 저장하는거임.
        for(int i=0; i<s1; i++){
            int dice1 = i+1;
            for(int j=0; j<s2; j++){
                int dice2 = j+1;
                for(int k=0; k<s3; k++){
                    int dice3 = k+1;
                    sums[dice1 + dice2 + dice3] ++;
                }
            }
        }  // 모든 경우의수 체크

        int max = 0, output = 0;  // 최대빈도 값 찾기 위한 변수, output은 출력할 변수
        for(int i=0; i<sums.length; i++){
            if(sums[i] > max){
                max = sums[i];
                output = i;
            }else if(sums[i] == max){
                if(output > i){
                    output = i;
                }
            }
        }
        System.out.println(output);
        
    }// main
}
