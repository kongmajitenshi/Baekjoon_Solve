import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon_1703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> results = new ArrayList<Integer>();
        while(true){
            int result = 1;
            int a = sc.nextInt();
            if(a == 0){
                break;
            }else if(a > 20 || a < 1){
                break;
            }
            
            int[] trees = new int[2*a];

            for(int i=0; i<2*a; i++){
                trees[i] = sc.nextInt();
            }
            for(int i=0; i<trees.length; i++){
                if(i % 2 == 0){
                    result = result * trees[i];
                    // System.out.println("값:" + result);
                }else{
                    result = result - trees[i];
                    // System.out.println("값:" + result);
                }
                // System.out.println("값: " + result);
            }
            results.add(result);
        }
        for(var result : results){
            System.out.println(result);
        }
        
        // 2 3 0 2 0 -> 3 (((홀수-짝수) * 홀수 - 짝수) * 홀수 - 짝수) 형태 반복
        // => 계산한 값을 저장하면서 * 홀수 - 짝수 를 하면 됨.

        sc.close();
    }
}
