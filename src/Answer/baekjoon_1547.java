import java.util.Scanner;

public class baekjoon_1547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        // int[] cups = new int[]{1,2,3};
        int[] cupChange;
        int answer = 1;
        if(0<=M && M<=50){
            for(int i=0; i<M; i++){
                cupChange = new int[2];
                for(int j=0; j<2; j++){
                    cupChange[j] = sc.nextInt();
                }
                
                if(answer == cupChange[1]){
                    answer = cupChange[0];
                }else if(answer == cupChange[0]){
                    answer = cupChange[1];
                }
            
                // if(answer == cupChange){
                //    answer = cups[cupChange-1];
                // }
                
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
