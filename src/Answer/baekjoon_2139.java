package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2139 {
    public static void main(String[] args) throws IOException {
        /* 입력: D M YYYY 순으로 입력. D와 M은 D or DD , M or MM 모두 가능
         * 출력: 해당 연도 1월 1일부터 입력된 날 까지의 일수 출력. 1 31 2001 이라 하면 1월 1일 ~ 1월 31일 총 31일임
         * 1 3 5 7 8 10 12 -> 31일
         * 4 6 9 11 -> 30일
         * 2 -> 28일(윤년 시 29일)
         * 윤년: 해당연도 % 4 == 0 && 해당연도 % 100 == 0 || 해당연도 % 400 != 0(400으로 나누어 떨어지는 경우는 윤년)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String day = br.readLine();
            String[] days = new String[3];
            int result = 0;
            for(int i=0; i<3; i++){
                days[i] = day.split(" ")[i];
            }
            int d = Integer.parseInt(days[0]);
            int m = Integer.parseInt(days[1]);
            int y = Integer.parseInt(days[2]);
            if(d == 0 && m == 0 && y == 0){
                break;
            }

            for(int i=1; i<=m; i++){
                if(i == m){
                    result += d;
                    break;
                }
                switch (i) {
                    case 1: result += 31; break;
                    case 3: result += 31; break;
                    case 5: result += 31; break;
                    case 7: result += 31; break;
                    case 8: result += 31; break;
                    case 10: result += 31; break;
                    case 12: result += 31; break;
                    case 4: result += 30; break;
                    case 6: result += 30; break;
                    case 9: result += 30; break;
                    case 11: result += 30; break;
                    case 2: 
                        if((y%4 == 0 && y%100 != 0) || y%400 == 0){
                            result += 29; break;
    
                        }else{
                            result += 28; break;
                        }
                    default:
                        break;
                }  // switch
            }  // for
            System.out.println(result);
        }  // while
        br.close();
    }  // main
}  // class
