package Answer;
import java.util.Scanner;

public class baekjoon_1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        X = Rev(X);
        //System.out.println("Rev(X) = " + X);

        Y = Rev(Y);
        //System.out.println("Rev(Y) = " + Y);

        int sum = X + Y;
        sum = Rev(sum);

        System.out.println(sum);


        sc.close();
    }

    // static public int Rev(int x, int y){
    //     Rev(x);

    //     String strY = Integer.toString(y);

    //     char[] charsY = new char[strY.length()];

    //     for(int i=0, j=strY.length() - 1; i<strY.length(); i++, j--){
    //         charsY[i] = strY.charAt(j);
    //     }

    //     strY = new String(charsY);

    //     return Integer.parseInt(strY);
    // }
    
    static public int Rev(int x){
        String strX = Integer.toString(x);

        char[] charsX = new char[strX.length()];

        for(int i=0, j=strX.length() - 1; i<strX.length(); i++, j--){
            charsX[i] = strX.charAt(j);
        }

        strX = new String(charsX);

        return Integer.parseInt(strX);
    }
}
