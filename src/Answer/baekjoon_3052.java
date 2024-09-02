package Answer;
import java.util.Scanner;

public class baekjoon_3052 {
    public static void main(String[] args) {
        /*
         * 자연수 10개를 입력받고, 그 10개의 수를 42로 나눈 나머지를 구한다.
         * 그 후, 그 나머지들이 서로 다른 값이 몇개가 있는지 구한다.
         * 수 10개를 입력받는다. (배열에 굳이 저장할 필요가 없다)
         * 입력받은 수의 나머지를 배열에 저장한다.
         * 배열을 순회하면서, 같은 수가 있다면 count를 증가, 없다면 놔둔다.
         * 배열을 모두 순회한 후 count값을 출력한다.
         */
        Scanner sc = new Scanner(System.in);

        //int[] numbers = new int[10];
        int[] trashs = new int[10];

        for(int i=0; i<trashs.length; i++){
            // numbers[i] = sc.nextInt();
            trashs[i] = sc.nextInt() % 42;
        }

        int num;  
        int count = 0;
        boolean check = false;  // check = true 라면 중복 있음.

        for(int i=0; i<trashs.length; i++){
            num = trashs[i];
            for(int j=i+1; j<trashs.length; j++){
                if(num != trashs[j]){
                    check = false;
                }else if(num == trashs[j]){
                    check = true;
                    break;
                }
            }
            if(check == false){
                count ++;
            }
        }
        if(count == 0){
            count ++;
        }

        System.out.println(count);
            /* 
            for(int j=i; j<trashs.length; j++){
                if(num != trashs[j]){
                    count ++;
                    break;
                    // 문제점: 중복이 아닌 경우에 count가 계속 늘어남. 한 번만 늘어나야함.
                    // 또, 중복값이 나오기 전에 중복이 아닌 값이 나온다면, 중복으로 체크하고
                    // count가 늘어남. 순차적으로 순회하고 찾으면 break 해버리기 때문에 생기는 문제.
                    // boolean 타입의 check 변수를 만들어서 중복값이 있다면 true, 없다면 false로 함.
                    // check가 true라면 아무 일도 없고, check가 false라면 1을 증가.
                    // boolean 타입 check가 true가 된 적이 있다면, checked를 true로 ??
                }else{
                    count --;
                    
                }
            }
            */


        // 체크용 출력
        // for(var a : trashs){
        //     System.out.println("a: " + a);
        // }

        sc.close();
    }
}
