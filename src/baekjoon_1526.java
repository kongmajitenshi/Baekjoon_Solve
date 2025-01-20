import java.util.Scanner;

public class baekjoon_1526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] nums = sc.nextLine().toCharArray();
        sc.close();

        // nums 배열 체크하면서 4 또는 7이 아닌 경우에 1씩 감소(무한반복)
        while(true){
            boolean gumminsu = true;  // 7 or 4 => true
            for(int i=0; i<nums.length; i++){
                if(nums[i] != '4' && nums[i] != '7'){
                    gumminsu = false;
                    break;
                }
                
                if(gumminsu == false){
                    
                }
            }
            
        }

    }
}
