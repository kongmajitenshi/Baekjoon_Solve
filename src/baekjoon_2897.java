import java.util.Scanner;

public class baekjoon_2897 {
    public static void main(String[] args) {
        /* 8t 트럭은 2x2 공간을 차지함
         * 입력1: R C(모두 정수, 2 이상 50 이하, 띄어쓰기로 입력)
         * 입력2: #-빌딩, .-빈공간, X-차있음, 띄어쓰기 없이 입력
         * 출력: 5줄 출력. 첫줄~다섯줄 순서대로 n-1대의 차 부수고 주차 가능한 공간.
         * 즉, 첫 줄은 차 안부수고 주차. 둘 째는 차 한대 부수고 주차, ... 형태.
         * 8t트럭이 2x2 공간을 차지하니까 시작 줄부터 2x2 형태로 검사하면 될듯.
         */
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String input = br.readLine();
        // int r = Integer.parseInt(input.split(" ")[0]);
        // int c = Integer.parseInt(input.split(" ")[1]);
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();  // 개행 문자 제거

        char[][] jucha = new char[r][c];  // 주차장
        // int result = 0;  // 주차 가능한 공간 저장
        for(int i=0; i<r; i++){
            String input = sc.nextLine();
            for(int j=0; j<c; j++){
                jucha[i][j] = input.charAt(j);
                // System.out.println("주차: " + jucha[i][j]);
            }
        }
        int[] result = new int[5];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i < r-1 && j < c-1){
                    int count = 0;
                    if(jucha[i][j] == '#' || jucha[i][j+1] == '#' || jucha[i+1][j] == '#' || jucha[i+1][j+1] == '#'){
                        continue;
                    }
                    if(jucha[i][j] == 'X') count ++;
                    if(jucha[i][j+1] == 'X') count ++;
                    if(jucha[i+1][j] == 'X') count ++;
                    if(jucha[i+1][j+1] == 'X') count ++;
                    result[count]++;
                }
            }
        }
        for(int re : result){
            System.out.println(re);
        }
        /*
        // 저장까진 완료했음. 이제 저장한 데이터를 검사하면서 출력을 해야함.
        int[] result = new int[5];
        // if로 묶어서 검사한 4개의 칸에 *이 1개라면 result[1]++, 2개라면 result[2]++, ... 하는 형태로 구현.
        // #이 있다면 contiunue 하면 됨. 이 두 조건에 모두 걸리지 않았다면 result[0]++ 하면 됨.
        for(int i=0; i<r-1; i++){
            int count = 0;  // X의 개수 검사. X의 개수 = 부숴야 할 차의 개수
            // boolean building = false;  // # 여부 체크. # 있으면 카운트 안하고 넘김.
            for(int j=i; j<i+2; j++){
                for(int k=i; k<+2; k++){
                    if(jucha[j][k] == 'X'){
                        count ++;
                    }// }else if(jucha[j][k] == '#'){
                    //     building = true;
                    //     continue;
                    // }
                }
            }
            
            switch (count) {
                case 0: result[0] ++; break;
                case 1: result[1] ++; break;
                case 2: result[2] ++; break;
                case 3: result[3] ++; break;
                case 4: result[4] ++; break;
                default:
                    break;
            }
            
        }
        for(int re : result){
            System.out.println(re);
        }
        */
        sc.close();
    }
}