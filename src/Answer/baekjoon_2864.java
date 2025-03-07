package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2864 {
    public static void main(String[] args) throws IOException {
        /* 5를 5 or 6으로, 6을 6 or 5로 헷갈려함.1
         * 입력: 정수 2개, "A B" 형태로 입력(수 공백 수)
         * 출력: 가능한 합 중 최솟값 최댓값
         * 결국, 입력된 값을 그대로 계산, 5>6으로, 바꿔 계산, 6>5로 바꿔 계산 해보면 되는 문제. 
         * 수 두 개를 String 형태로 입력 받고, 각각의 수 마다 몇 번 자리에 5or6이 있는지 검사.
         * 최솟값: 모든 6을 5로 바꿨을 때가 최솟값(5는 그냥 놔둠)
         * 최댓값: 모든 5를 6으로 바꿨을 때가 최댓값(6은 그냥 놔둠)
         * 즉, 모든 경우를 다 더해볼 필요가 없음.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        
        int minRe = 0, maxRe = 0;

        for(int i=0; i<nums.length; i++){
            char[] numsArr1 = nums[i].toCharArray();
            for(int j=0; j<nums[i].length(); j++){  // 6 -> 5으로 변환(최솟값)
                if(nums[i].charAt(j) == '6'){
                    numsArr1[j] = '5';
                }             
            }
            minRe += Integer.parseInt(new String(numsArr1));
        }

        for(int i=0; i<nums.length; i++){
            char[] numsArr2 = nums[i].toCharArray();
            for(int j=0; j<nums[i].length(); j++){
                if(nums[i].charAt(j) == '5'){
                    numsArr2[j] = '6';
                }
            }
            maxRe += Integer.parseInt(new String(numsArr2));

        }    

        System.out.println(minRe + " " + maxRe);
        br.close();
    }
}