import java.util.Scanner;

public class baekjoon_1236 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // int count = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        //System.out.println("knight: " + knight);
        System.out.println("---");
        if(1<=N && N<=50 && 1<=M && M<=50){
            int MN = M*N;
            // int[] arrN = new int[N]; // 세로
            // int[] arrM = new int[M]; // 가로
            sc.nextLine(); // 개행문자 제거
            String str;
            String[] arrStr = new String[MN];
            System.out.println("길이1: " + arrStr.length);
            for(int i=0; i<N; i++){
                str = sc.nextLine();
                arrStr = str.split(""); // 공백 기준으로 자르기
            }
            System.out.println("길이2: " + arrStr.length);
            // System.out.print(arrStr[i] + arrStr[i+1]);
            // for(int i=0; i<N*M; i++){
            //     System.out.println(arrStr[i]);
            // }
        }
        sc.close();
    }
}