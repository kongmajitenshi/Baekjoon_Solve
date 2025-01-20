import java.util.Scanner;

public class baekjoon_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 자연수
        int k = sc.nextInt();  // 자연수의 k번째 약수를 구하기 위한 수
        int result = 0;  // n의 약수 중 k번째로 작은 약수 저장할 수
        int count = 0;

        sc.close();

        for(int i=1; i<=n; i++){
            if(n % i == 0){
                count ++;
                if(count == k){
                    result = i;
                }else if(k > count){
                    result = 0;
                }
            }
        }

        System.out.println(result);
        
    }
}
