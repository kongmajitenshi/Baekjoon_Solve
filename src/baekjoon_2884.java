import java.util.Scanner;

public class baekjoon_2884 { // 240330
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int scannedHour = 0;
        int scannedMinute = 0;
        int subtractMinuteValue = -45;
        int subtractMinute = 0;
        int subtractMinuteResult = 0;


        while(true){

            System.out.print("시간 입력(24시간제): ");
            scannedHour = scan.nextInt();
            if(scannedHour < 0 || scannedHour > 23){
                System.out.println("잘못된 시간 값 입력");
                continue;
            }

            System.out.print("분 입력: ");
            scannedMinute = scan.nextInt();
            if(scannedMinute < 0 || scannedMinute > 59){
                System.out.println("잘못된 분 값 입력");
                continue;
            }

            break;

        }
        System.out.printf("입력된 시간: %d시 %d분\n", scannedHour, scannedMinute);
        
        subtractMinute = scannedMinute + subtractMinuteValue;
        if(subtractMinute < 0){
            subtractMinuteResult = 60 + subtractMinuteValue + scannedMinute;
            scannedHour -= 1;
        }
        System.out.printf("알람 울릴 시각: %d시 %d분", scannedHour, subtractMinuteResult);

        scan.close();
 
    
    }
}
