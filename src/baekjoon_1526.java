import java.util.Scanner;

public class baekjoon_1526 {
    public static void main(String[] args) {
        /* 금민수: 4와 7로만 이루어진 수
         * input: 입력받는 수
         * input 이하의 수 중에서 금민수 찾기
         * 문자열을 String 형태로 입력받고,
         * 입력 받은 수를 거꾸로 저장.
         * 그 후 (수 * 10^'인덱스 번호') 형태로 값을 찾아내면 될듯?
         * String 형태로 저장하는 이유는 4와 7로만 이루어졌나 검사하기 위함.
         * 근데 그냥 int 배열로 저장해도 될듯?
         * 중요한건 금민수를 찾아내는 알고리즘.
         * 입력 받은 수가 금민수인지 판별하고, 아니라면 가장 큰 금민수 찾아내야함.
         * 만약 430이 입력됨. 그럼 430 이하의 수 중에서 100의 자리가 4 또는 7인 수 중에서
         * 십의자리 숫자가 4 또는 7인지 검사. 불가능 하다면 두자리 금민수 중 가장 큰 77.
         * 440 입력. 440 이하의 수 중 가장 큰 금민수는 77임. 
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        int[] number = new int[input.length()];
        int j=0;
        
        // boolean change = false;  // 값이 변했나 체크할 변수
        int gummansu = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (number[i] > 7) {
                number[i] = 7;
                for (int k = i - 1; k >= 0; k--) {
                    number[k] = 7;
                }
                break;
            } else if (number[i] == 7) {
                if(number[i-1] >= 4){
                    continue;
                }else{
                    number[i] = 4;
                }
            } else if (number[i] > 4) {
                number[i] = 4;
                for (int k = i - 1; k >= 0; k--) {
                    number[k] = 7;
                }
                break;
            } else if (number[i] == 4) {
                if(number[i-1] >= 4){
                    continue;
                }else{
                    number[i] = 0;
                }
            } else { // number[i] < 4, including 0
                number[i] = 0; // 현재 자리는 0으로 설정
                for (int k = i - 1; k >= 0; k--) {
                    number[k] = 7; // 이전 자리는 모두 7로 설정
                }
                break;
            }
        }
        
        // for(int i=input.length()-1; i>=0; i--){
        //     number[i] = Character.getNumericValue(input.charAt(j));
        //     j++;
        // }   

        // for(int i=input.length()-1; i>=0; i--){
        //     if(number[i] > 7){
        //         number[i] = 7;
        //         for(int k=i-1; k>=0; k--){
        //             number[k] = 7;
        //         }
        //         break;
        //     }else if(number[i] == 7){
        //         continue;
        //     }else if(number[i] > 4){
        //         number[i] = 4;
        //         for(int k=i-1; k>=0; k--){
        //             number[k] = 7;
        //         }
        //         break;
        //     }else if(number[i] == 4){
        //         continue;
        //     }else{
        //         for(int z=input.length()-1; z>i; z--){
        //             number[z] = 0;
        //         }
        //         for(int k=i-1; k>=0; k--){
        //             number[k] = 7;
        //         }
        //         break;
        //     }
        // }   

        for(int i=input.length()-1; i>=0; i--){
            gummansu += number[i] * (int)(Math.pow(10, i));
        }

        System.out.println(gummansu);



        // for(int n : number){
        //     System.out.println(n);
        // }

    }
}
