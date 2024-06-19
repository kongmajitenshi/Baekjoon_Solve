package Answer;
import java.util.Scanner;

public class baekjoon_2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] plugs = new int[N];
        int result = 0;
        for(int i=0; i<N; i++){
            plugs[i] = sc.nextInt();
        }
        for(int i=0; i<plugs.length; i++){
            result += plugs[i];
        }
        result = result - (N-1);

        System.out.println(result);
        sc.close();
    }
}
