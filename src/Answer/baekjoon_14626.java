import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_14626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] nums = new char[13];
        for(int i=0; i<13; i++){
            nums[i] = input.charAt(i);  // 개별 보관
        }

        int isbn = 0;
        int check = 0;
        for(int i=0; i<13; i++){
            // 가중치는 2 4 6 8 10 12 데 index로 보면 1 3 5 7 9 11 임. 즉 가중치를 곱해줄 부분은 mod 2 = 1인 애들.
            if(nums[i] != '*'){
                int num = Character.getNumericValue(nums[i]);
                
                if(i%2 == 0){
                    isbn += num;
                }else if(i%2 != 0){
                    isbn += 3*num;
                }
            }else{
                check = i;
                continue;
            }
        }
        int result = 0;
        if(check%2 == 0){
            result = 10 - (isbn % 10);
        }else if(check%2 != 0){
            // 가중치 때문에 3이 곱해진 부분. 그 수를 x 이라고 하면 (isbn+3*x)%10 == 0 이 true 여야 함. 반복문을 돌리면 편한데 비효율 적이긴 함.
            for(int i=0; i<10; i++){
                if((isbn + (3*i))%10 == 0){
                    result = i;
                }
            }
        }
        System.out.println(result);

    }    
}
