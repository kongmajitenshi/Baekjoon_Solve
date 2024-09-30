package Answer;
import java.util.Scanner;

public class baekjoon_1259 {
    public static void main(String[] args) {
        // 수를 입력 받아서 로꾸꺼 해도 똑같다면 yes, 그 외에는 no 출력
        // 수를 입력받고, 그 수를 뒤집는다. 원본과 뒤집수가 같은지 검사.
        Scanner sc = new Scanner(System.in);

        while(true){
            //boolean check = false; // 시작은 no
            // String num = sc.nextLine();
            // 문자열로 받으니 "0" 일 때 break 가 동작을 안함.
            // 일단 정수형태로 받고, 문자열로 변환해서 뒤집어서 확인하면 될듯.
            int num = sc.nextInt();

            if(num == 0){
                break;
            }
            String strNum = Integer.toString(num);
            String reverseNum = ""; // 뒤집어서 저장해둘 객체 미리 생성

            for(int i=strNum.length()-1; i>=0; i--){
                reverseNum += strNum.charAt(i); // 거꾸로 순회하면서 저장
            }

            if(reverseNum.equals(strNum)){
                //check = true;
                System.out.println("yes");
            }else{
                //check = false;
                System.out.println("no");
            }
            // check를 넣지 않고 그냥 바로 출력해도 상관 없을듯.
            // if(check == false){
            //     System.out.println("no");
            // }else{
            //     System.out.println("yes");
            // }
        }

        sc.close();
    }
}
