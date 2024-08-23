import java.util.Scanner;

public class baekjoon_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        int i = sc.nextInt();

        
        for(int j=0; j<i; j++){
            if(j == i-1){
                System.out.println(S.charAt(j));
            }
        }

        sc.close();
    }
}
