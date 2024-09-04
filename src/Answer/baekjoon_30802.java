import java.util.Scanner;

public class baekjoon_30802 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int[] clothes = new int[6];
    for(int i=0; i<clothes.length; i++){
        // 0~5는 S~XXXL
        clothes[i] = sc.nextInt();
    }
    
    int T = sc.nextInt();
    int P = sc.nextInt();

    int result = 0;

    for(int i=0; i<clothes.length; i++){
        if(T == 0){
            break;
        }
        if(clothes[i] % T == 0){
            result += clothes[i] / T;
           // System.out.println(clothes[i] / T );
        }else{
            result += clothes[i] / T + 1;
            //System.out.println(clothes[i] / T + 1);
        }
    }
    int pens =  N % P;

    System.out.println(result);
    System.out.printf("%d %d", N/P, pens);



    sc.close();
    }   
}
