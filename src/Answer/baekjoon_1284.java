package Answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon_1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> results = new ArrayList<Integer>();
        while(true){
            int result = 0;
            int N = sc.nextInt();
            if(N == 0){
                break;
            }else if(N<1 || N>9999){
                break;
            }
            String strN = String.valueOf(N);
            int[] numbers = new int[strN.length()];
            for(int i=0; i<strN.length(); i++){
                numbers[i] = Character.getNumericValue(strN.charAt(i));
            }
            
            
            result += 1; // 맨 앞 공백
            for(var num : numbers){
                if(num == 1){
                    result += 2;
                    result += 1;
                }else if(num == 0){
                    result += 4;
                    result += 1;
                }else{
                    result += 3;
                    result += 1;
                }
                // for문이 끝날 때 맨 뒤 공백까지 채워짐
            }

            results.add(result);  // 길이 결과 저장
        }
        
        for(var result : results){
            System.out.println(result);  // 결과 출력
        }
        
        sc.close();
    }
}
