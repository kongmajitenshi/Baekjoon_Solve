package Answer;
import java.util.Scanner;

public class baekjoon_2490 {
    public static void main(String[] args) {
        // 배:0 등:1
        // 1111 = 윷, 0000 = 모, 0111 = 도, 0011 = 개, 0001 = 걸
        Scanner sc = new Scanner(System.in);
        char[] results = new char[3];
        for(int j=0; j<3; j++){
            int count = 0;
    
            for(int i=0; i<4; i++){
                if(sc.nextInt() == 0){
                    count ++;
                }
            }

            switch (count) {
                case 1: results[j] = 'A'; break;
                case 2: results[j] = 'B'; break;
                case 3: results[j] = 'C'; break;
                case 4: results[j] = 'D'; break;
                case 0: results[j] = 'E'; break;
                default:
                    break;
            }
        }
        sc.close();
        for(int j=0; j<3; j++){
            System.out.println(results[j]);
        }


        
        

    } // main
}
