package Answer;
import java.util.Scanner;

public class baekjoon_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nums = new int[8];

        for(int i=0; i<8; i++){
            nums[i] = sc.nextInt();
            // System.out.print(nums[i] + " ");
            if(nums[i] > 8 || nums[i] < 1){
                break;
            }
        }
        
        sc.close();
        /* 1로 시작하는지 8로 시작하는지 검사?
        * 1이나 8로 시작하는 경우는 다른 변수에 그 값 저장한 후에
        * 배열을 순회하면서 일정하게 증감하는지 검사
        * 일정하게 증가하면 ascending, 일정하게 감소하면 descending
        * 일정하게 증감하지 않거나 시작이 1이나 8이 아닌 경우엔 mixed
        */

        int num; 
        
        if(nums[0] == 1){
            num = nums[0];  // 1 or 8을 저장
            for(int j=1; j<8; j++){
                    if(nums[j] == num + 1){
                        //System.out.println(num);
                        num++;
                    }else{
                        //System.out.println("mixed");
                        //break;
                    }
            }
            //System.out.println("for문 결과: " + num);
            if(num == 8){
                System.out.println("ascending");
            }else{
                System.out.println("mixed");
            }

        }else if(nums[0] == 8){
            num = nums[0];
            for(int j=1; j<8; j++){
                    if(nums[j] == num - 1){
                        num--;
                    }else{
                        //System.out.println("mixed");
                        //break;
                    }
                }
            if(num == 1){
                System.out.println("descending");
            }else{
                System.out.println("mixed");
            }
        }else{
            System.out.println("mixed");
        }
        

    }
}
