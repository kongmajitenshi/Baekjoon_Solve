package Answer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baekjoon_8958 {
    public static void main(String[] args) {
        /* O와 X를 구분하여 점수를 쌓는 형태
         * O가 연속으로 나오면 가산점이 붙음
         * 한 번 나오면 1점, 두 번 나오면 2점, ... 의 형태로
         * O가 n번 나오면 n점
         * 문자열을 순회하면서 O가 아닐 때 까지 검사하여 O가 나온 횟수 저장
         * 그 후, O가 나온 횟수부터 그 수가 0이 될 때 까지 1씩 빼며 합함
         * 그 과정을 반복
         * 
         * 입력되는 길이가 일정하지 않으니, 그 부분을 신경써야함.
         * 길이가 고정되어있는 배열보단, 리스트 형태가 좋아보임.
         * 혹은, 입력된 값의 길이를 측정하고, 그 길이만큼의 배열을 만드는 것도 좋아보임.
         */
        Scanner sc = new Scanner(System.in);
        
        List<String> answers = new ArrayList<String>();

        int testCase = sc.nextInt();

        for(int i=0; i<testCase; i++){
            answers.add(sc.next());
        }

        int result, count;  // 최종 결과

        for(var answer : answers){
            result = 0;
            count = 0;
            for(int j=0; j<answer.length(); j++){
                if(answer.charAt(j) == 'O'){
                    count ++;
                    result += count;
                }else{
                    count = 0;
                }
            }
            System.out.println(result);
        }
        
        // 제대로 들어갔나 확인용 출력
        // System.out.println(answers.get(0).length());
        // for(var a : answers){
        //     System.out.println("a: " + a);
        // }
        // System.out.println(answers.size());
        

        sc.close();
    }
}
