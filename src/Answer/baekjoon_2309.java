package Answer;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nanajang = new int[9];
        int height = 0;
        for(int i=0; i<9; i++){
            nanajang[i] = sc.nextInt();
            height += nanajang[i];
        }
        int namuji = height - 100;
        int f1 = 0, f2 = 0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(nanajang[i] + nanajang[j] == namuji){
                    f1 = i;
                    f2 = j;
                }
            }
        }
        
        int[] result = new int[7];
        int index = 0;
        for(int i=0; i<9; i++){
            if(i != f1 && i != f2){
                result[index] = nanajang[i];
                index++;
            }
        }
        Arrays.sort(result);
        for(int r : result){
            System.out.println(r);
        }


        sc.close();
    }
}