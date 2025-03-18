package Answer;
import java.util.Scanner;

public class baekjoon_2897_re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();

        char[][] jucha = new char[r][c];

        for(int i=0; i<r; i++){
            String input = sc.nextLine();
            for(int j=0; j<c; j++){
                jucha[i][j] = input.charAt(j);
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
                    if(jucha[i][j] == 'X'){
                        count ++;
                    }
                    if(jucha[i][j+1] == 'X'){
                        count ++;
                    }
                    if(jucha[i+1][j] == 'X'){
                        count ++;
                    }
                    if(jucha[i+1][j+1] == 'X'){
                        count ++;
                    }
                    result[count] ++;
                }
            }
        }
        for(int re : result){
            System.out.println(re);
        }

        sc.close();
    }
}