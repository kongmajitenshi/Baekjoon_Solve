import java.util.Scanner;

public class baekjoon_1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] callTime = new int[N];
        if(N<=20){
            for(int i=0; i<N; i++){
                callTime[i] = sc.nextInt();
                System.out.println(callTime[i]);
            }
        }

        sc.close();
    }
}
