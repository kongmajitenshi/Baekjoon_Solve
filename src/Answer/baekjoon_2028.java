import java.util.Scanner;

public class baekjoon_2028 {
    public static void main(String[] args) {
        /*자기복제수: 자기를 제곱했을 때 마지막에 자기가 반복되는 수
         * 예시: 5 -> 5*5= 25 이므로 5는 자기복제수임
         * 시작: 몇 번 반복할지 입력
         * 반복: 숫자 입력하면 값 반환
         * 과정: 수를 입력 받고, 해당 수가 자복수라면 YES, 아니라면 NO 출력
         * 어떻게 자기복제수를 판별할까? 처음 입력받은 값과 연산 후 값을 비교
         * 처음 입력 받은 수, 연산 후 수 중 처음 수 길이만큼만 잘라서 비교
         * String 형태로 입력 받고, 연산만 int 형태로 진행하는게 깔끔할듯듯
         */
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        
        for(int i=0; i<test; i++){
            int jagi = sc.nextInt();
            int jegob = jagi * jagi;
            
            String strJagi = Integer.toString(jagi);
            String strJegob = Integer.toString(jegob);

            String sub = strJegob.substring(strJegob.length() - strJagi.length());

            // String reJa = "";
            // String reJe = "";
            
            // boolean check = false;

            // for(int j=strJagi.length()-1; j>=0; j--){
            //     reJa = reJa + strJagi.charAt(j);        
            // }

            // for(int j=strJegob.length()-1; j>=0; j--){
            //     reJe = reJe + strJegob.charAt(j);
            // }
            
            // for(int j=0; j<strJagi.length(); j++){
            //     if(reJa.charAt(j) == reJe.charAt(j)){
            //         check = true;
            //     }else{
            //         check = false;
            //     }
            // }

            if(sub.equals(strJagi)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

        sc.close();
        
    }
}
