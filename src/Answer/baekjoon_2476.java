import java.util.Scanner;

public class baekjoon_2476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int[][] dices = new int[people][3];
        int[] money = new int[people];
        if(2<=people && people<=1_000){

            for(int i=0; i<people; i++){
                for(int j=0; j<3; j++){
                    dices[i][j] = sc.nextInt();
                    // if(0>dices[i][j] && dices[i][j]>6){
                    //     break;
                    // }
                }
            }
           
            int e3=0, e2=0, e1=0;
            // int bmoney3=0, bmoney2=0, bmoney1=0;
            int times = 0;
            for(var dice : dices){
                int val = 0;
                if(dice[0] == dice[1] && dice[0] == dice[2]){
                    e3 = dice[0];
                    // if( money[times] >= bmoney3){
                    // }
                    money[times] = 10_000 + e3 * 1_000;
                    //bmoney3 = money[times];
                }else if(dice[0] == dice[1] || dice[1] == dice[2] || dice[0] == dice[2]){
                    if(dice[0] == dice[1]){
                        val = dice[0];
                    }else if(dice[1] == dice[2]){
                        val = dice[1];
                    }else{
                        val = dice[2];
                    }
                    e2 = val;
                    
                    // if(bmoney2 > money[times]){
                    //     continue;
                    // }
                    // bmoney2 = money[times];
                    money[times] = 1_000 + e2 * 100;
                }else{
                    for(int i=0; i<dice.length; i++){
                        if(val < dice[i]){
                            val = dice[i];
                            e1 = val;
                        }
                    }
                    // if(bmoney1 > money[times]){
                    //     continue;
                    // }
                    // bmoney1 = money[times];
                    money[times] = e1 * 100;
                }         
                times ++;
            }  
        }


        int max = 0;
        for(int i=0; i<money.length; i++){
            if(max < money[i]){
                max = money[i];
            }
            // if(money[i] > money[i+1]){
            //     max = money[i];
            // }
            // System.out.println("money: " + money[i]);
        }
        System.out.println(max);

        sc.close();

        
    }
}
