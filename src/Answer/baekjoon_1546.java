package Answer;
import java.util.Scanner;

public class baekjoon_1546 { // 240401
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        double mostValue = 0;

        double result = 0;

        if(count<=1000){

            int[] subjects = new int[count];
            for(int i=0; i<count; i++){
                subjects[i] = scan.nextInt();
                // System.out.println(subjects[i]);
            }

            // double[] Results = new double[count];
            for(int subject: subjects){
                if(0<=subject && subject<=100){
                    if(mostValue < subject){ // mostValue가 크거나 같다면 그대로, 작다면 mostValue에 subject 대입
                        mostValue = subject;
                    }
                }
            }

            // System.out.println("가장큰값: " + mostValue);
            for(double subject: subjects){
                // System.out.println("점수: " + subject);
                result += (subject / mostValue * 100);
                // System.out.println("계산 결과: " + result);
            }
            System.out.printf("%.2f", result/count);

        }

        scan.close();
    }
}
