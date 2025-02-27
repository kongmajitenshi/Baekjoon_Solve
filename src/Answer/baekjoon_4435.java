package Answer;
import java.util.Scanner;

public class baekjoon_4435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();

        int[] gan = new int[6];
        int[] sau = new int[7];

        // int scoreGan = 0;
        // int scoreSau = 0;

        for(int i=0; i<test; i++){
            int scoreGan = 0;
            int scoreSau = 0;
            for(int j=0; j<gan.length; j++){
                gan[j] = sc.nextInt();
            }
            for(int j=0; j<gan.length; j++){
                if(j == 0){
                    scoreGan += gan[j]*1;
                }else if(j == 1){
                    scoreGan += gan[j]*2;
                }else if(j == 2 || j == 3){
                    scoreGan += gan[j]*3;
                }else if(j == 4){
                    scoreGan += gan[j]*4;
                }else  if(j == 5){
                    scoreGan += gan[j]*10;
                }
            }
            // System.out.println(scoreGan);

            for(int j=0; j<sau.length; j++){
                sau[j] = sc.nextInt();
            }
            for(int j=0; j<sau.length; j++){
                if(j == 0){
                    scoreSau += sau[j]*1;
                }else if(j == 1 || j ==2 || j == 3){
                    scoreSau += sau[j]*2;
                }else if(j == 4){
                    scoreSau += sau[j]*3;
                }else if(j == 5){
                    scoreSau += sau[j]*5;
                }else if(j == 6){
                    scoreSau += sau[j]*10;
                }
            }
            // System.out.println(scoreSau);
            if(scoreGan > scoreSau){
                System.out.println("Battle " + (i+1) + ": Good triumphs over Evil");
            }else if(scoreGan < scoreSau){
                System.out.println("Battle " + (i+1) + ": Evil eradicates all trace of Good");
            }else if(scoreGan == scoreSau){
                System.out.println("Battle " + (i+1) + ": No victor on this battle field");
            }
        }
        sc.close();
    }
}
