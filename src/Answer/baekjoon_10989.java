package Answer;
// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_10989 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());  // 숫자 개수
        int[] numCount = new int[10001];

        for(int i=0; i<N; i++){
            numCount[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        for(int i=0; i<numCount.length; i++){
            while(numCount[i] > 0){
                sb.append(i).append('\n');
                numCount[i]--;
            }
        }

        System.out.println(sb);
    }
}

        /* 
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 입력받을 숫자 개수
        int[] numbers = new int[N];

        for(int i=0; i<N; i++){
            numbers[i] = sc.nextInt();
        }

        sc.close();

        int[] bigyo = new int[2];                

        for(int i=1; i<numbers.length; i++){
            bigyo[0] = numbers[i-1];
            bigyo[1] = numbers[i];
        }
        */