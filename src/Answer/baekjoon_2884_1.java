package Answer;
import java.util.Scanner;

public class baekjoon_2884_1 { // 240330
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scannedHour = 0;
        int scannedMinute = 0;
        int subtractMinute = 0;

        scannedHour = scan.nextInt();
        if(scannedHour >= 0 && scannedHour <= 23){
            scannedMinute = scan.nextInt();
            if((scannedMinute >= 0 && scannedMinute <= 59)){
                subtractMinute = scannedMinute - 45;
                if(subtractMinute < 0){
                    subtractMinute = scannedMinute + 60 - 45;
                    scannedHour -= 1;
                    if(scannedHour<0){
                        scannedHour += 24;
                    }
                }
                System.out.printf("%d %d", scannedHour, subtractMinute);
            }
        }
        
        scan.close();
 
    }
}
