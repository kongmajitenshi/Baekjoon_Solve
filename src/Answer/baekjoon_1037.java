import java.util.Scanner;

public class baekjoon_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //List<Integer> nums = new ArrayList<Integer>();
        int num;
        int N = sc.nextInt();  // 약수의 개수
        int[] nums = new int[N];
        for(int i=0; i<N; i++){
            num = sc.nextInt();  // 실제 약수 입력
            // nums.add(num);  // nums 리스트에 약수 저장
            nums[i] = num;
        }
        int max = 0 , min = 0;
        for(var n : nums){
            if(max < n){
                max = n;
            }
        }
        min = max;
        for(var n : nums){
            if(min > n){
                min = n;
            }
        }
        System.out.println(max*min);

        sc.close();
    }
}
