import java.util.Scanner;

public class baekjoon10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] results = new int[T];

        for(int i=0; i<T; i++){
            int value = 0;
            value = sc.nextInt();
            value += sc.nextInt();
            results[i] = value;
        }

        for(var result : results){
            System.out.println(result);
        }



        sc.close();
    }
}
