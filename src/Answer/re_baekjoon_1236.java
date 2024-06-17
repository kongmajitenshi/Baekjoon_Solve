package Answer;
import java.util.Scanner;

public class re_baekjoon_1236 { //240407 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        if(1<=N && N<=50 && 1<=M && M<=50){
            char[][] arrNM = new char[N][M];
            for(int i=0; i<N; i++){
                String str = sc.nextLine();
                char[] arrChar = str.toCharArray();
                for(int j=0; j<M; j++){
                    arrNM[i][j] = arrChar[j];
                }
            }
            
            int countN = 0; // N(가로) 찾기
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    if(arrNM[i][j] == 'X'){
                        countN++;
                        break;
                    }
                }
            }

            int countM = 0; // M(세로) 찾기
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(arrNM[j][i] == 'X'){
                        countM++;
                        break;
                    }
                }
            }
            
            System.out.println(Math.max(N-countN, M-countM));

        }

        sc.close();
    }
}
