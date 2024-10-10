import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_28702 {
    // i%3 == 0 && i%5 == 0 이라면 FizzBuzz
    // i%3 == 0 이라면 Fizz
    // i%5 == 0 이라면 Buzz
    // 연속된 숫자 3개를 입력할 것. 단, FizzBuzz에 해당된다면 해당 문자로 입력.
    // 3개의 입력 중, 숫자 하나를 기점으로 판단. 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;  
        int point = -1;
        // 우리가 구한 답을 저장할 변수. 
        // 값을 저장하고, %3, %5, %3 && %5를 통해 출력할 결과를 정하면 됨.
        
        String[] arrFb = new String[3];

        for(int i=0; i<3; i++){
            arrFb[i] = br.readLine();
            // System.out.println(arrFb[i]);
        }

        br.close();
        
        for(int i=0; i<arrFb.length; i++){
            try{
                answer = Integer.parseInt(arrFb[i]);
                point = i+1;
            }catch(NumberFormatException e){
                continue;
            }
        }

        if(point == 1){
            answer += 3;
            Fizzbuzz(answer);
        }else if(point == 2){
            answer += 2;
            Fizzbuzz(answer);
        }else if (point == 3){
            answer += 1;
            Fizzbuzz(answer);
        }
    }

    private static void Fizzbuzz(int num){
        if(num%3 == 0 && num%5 == 0){
            System.out.println("FizzBuzz");
        }else if(num%3 == 0){
            System.out.println("Fizz");
        }else if(num%5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(num);
        }
    }
    
}
