package Answer;
import java.util.Scanner;

public class baekjoon_1453{ // 240408
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guest = sc.nextInt();
        //System.out.println("guest: " + guest);
        int count = 0;
        if(guest <= 100){
            int[] seats = new int[guest+1];
            for(int i=0; i<guest; i++){
                seats[i] = sc.nextInt();
                //System.out.printf("seats[%d]: %d\n",i , seats[i]);
            }
            for(int i=0; i<guest; i++){
                for(int j=i+1; j<guest; j++){
                    if(seats[i] == seats[j]){
                        count++;
                        seats[j] = 101+j;
                    }
                }
            }
            // int j = 0;
            // int k = j+1;
            // while(j < guest){
            //     if(seats[j] == seats[k]){
            //         count++;
            //     }
            //     j++;
            //     k++;
            // }
            System.out.println(count);
        }

        sc.close();
    }
}