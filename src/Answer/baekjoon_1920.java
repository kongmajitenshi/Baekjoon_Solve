package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int originSize = Integer.parseInt(br.readLine());  // n
        int[] originNums = new int[originSize];  
        String input = br.readLine();
        for(int i=0; i<originSize; i++){
            originNums[i] = Integer.parseInt(input.split(" ")[i]);  // n개의 정수
        }
        int checkSize = Integer.parseInt(br.readLine());  // m
        int[] checkNums = new int[checkSize];
        input = br.readLine();
        for(int i=0; i<checkSize; i++){
            checkNums[i] = Integer.parseInt(input.split(" ")[i]);  // m개의 정수
        }

        for(int i=0; i<originSize; i++){
            boolean check = false;
            for(int j=0; j<checkSize; j++){
                if(originNums[j] == checkNums[i]){
                    check = true;
                    break;
                }
            }
            if(check == true){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
        // n개의 정수 안에 m개의 정수가 있나 없나 판별하는거임. 출력 m은 m개의 정수 순서대로 체크한 결과 출력,
        // 예시) n정수가 1 3 5 7 9 이고 m정수가 1 2 3 임. 1, 3은 있고 2는 없으니 출력할 땐 1 0 1 이 출력되는 것. 이런 느낌임.
    }
}