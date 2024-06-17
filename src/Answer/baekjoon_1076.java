package Answer;

import java.util.Scanner;

public class baekjoon_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] colors = new String[3];
        long result = 0;

        if(colors.length == 3){
            for(int i=0; i<colors.length; i++){
                colors[i] = sc.nextLine();
            }
            
            switch(colors[0]){
                case "black":   result+=0; break; 
                case "brown":   result+=10; break;
                case "red":     result+=20; break;
                case "orange":  result+=30; break;
                case "yellow":  result+=40; break;
                case "green":   result+=50; break;
                case "blue":    result+=60; break;
                case "violet":  result+=70; break;
                case "grey":    result+=80; break;
                case "white":   result+=90; break;
            }
            
            switch(colors[1]){
                case "black":   result+=0; break;
                case "brown":   result+=1; break;
                case "red":     result+=2; break;
                case "orange":  result+=3; break;
                case "yellow":  result+=4; break;
                case "green":   result+=5; break;
                case "blue":    result+=6; break;
                case "violet":  result+=7; break;
                case "grey":    result+=8; break;
                case "white":   result+=9; break;
            }
            switch(colors[2]){
                case "black":   result*=1; break;
                case "brown":   result*=10; break;
                case "red":     result*=100; break;
                case "orange":  result*=1_000; break;
                case "yellow":  result*=10_000; break;
                case "green":   result*=100_000; break;
                case "blue":    result*=1_000_000; break;
                case "violet":  result*=10_000_000; break;
                case "grey":    result*=100_000_000; break;
                case "white":   result*=1_000_000_000; break;
            }
            // for(int i=0; i<colors.length; i++){
            //     if(colors[i].equals(colors[i])){
            //         if(colors[i].equals(colors[i])){
            //             continue;
            //         }
            //         if(colors[i].equals("black")){
            //             result += 0;
            //         }else if(colors[i].equals("brown")){
            //             result += 1;
            //         }else if(colors[i].equals("red")){
            //             result += 2;
            //         }else if(colors[i].equals("orange")){
            //             result += 3;
            //         }else if(colors[i].equals("yellow")){
            //             result += 4;
            //         }else if(colors[i].equals("green")){
            //             result += 5;
            //         }else if(colors[i].equals("blue")){
            //             result += 6;
            //         }else if(colors[i].equals("violet")){
            //             result += 7;
            //         }else if(colors[i].equals("grey")){
            //             result += 8;
            //         }else if(colors[i].equals("white")){
            //             result += 9;
            //         }
            //     }else if(colors[1].equals(colors[i])){

                    
            //         if(colors[i].equals("black")){
            //             result += 0;
            //         }else if(colors[i].equals("brown")){
            //             result += 10;
            //         }else if(colors[i].equals("red")){
            //             result += 20;
            //         }else if(colors[i].equals("orange")){
            //             result += 30;
            //         }else if(colors[i].equals("yellow")){
            //             result += 40;
            //         }else if(colors[i].equals("green")){
            //             result += 50;
            //         }else if(colors[i].equals("blue")){
            //             result += 60;
            //         }else if(colors[i].equals("violet")){
            //             result += 70;
            //         }else if(colors[i].equals("grey")){
            //             result += 80;
            //         }else if(colors[i].equals("white")){
            //             result += 90;
            //         }
            //     }else if(colors[2].equals(colors[i])){
            //         if(colors[i].equals("black")){
            //             result *= 1;
            //         }else if(colors[i].equals("brown")){
            //             result *= 10;
            //         }else if(colors[i].equals("red")){
            //             result *= 100;
            //         }else if(colors[i].equals("orange")){
            //             result *= 1_000;
            //         }else if(colors[i].equals("yellow")){
            //             result *= 10_000;
            //         }else if(colors[i].equals("green")){
            //             result *= 100_000;
            //         }else if(colors[i].equals("blue")){
            //             result *= 1_000_000;
            //         }else if(colors[i].equals("violet")){
            //             result *= 10_000_000;
            //         }else if(colors[i].equals("grey")){
            //             result *= 100_000_000;
            //         }else if(colors[i].equals("white")){
            //             result *= 1_000_000_000;
            //         }
            //     }
                // if(colors[i.equals("black")){
                //     if(colors[0].equals(colors[i))
                //         result += 0;
                //     else if(colors[1].equals(colors[i))
                //         result += 0;
                //     else if(colors[2].equals(colors[i))
                //         result *= 1;
                // }else if(colors[i.equals("brown")){
                //     if(colors[0].equals(colors[i))
                //         result += 10;
                //     else if(colors[1].equals(colors[i))
                //         result += 1;
                //     else if(colors[2].equals(colors[i))
                //         result *= 10;
                // }else if(colors[i.equals("red")){
                //     if(colors[0].equals(colors[i))
                //         result += 20;
                //     else if(colors[1].equals(colors[i))
                //         result += 2;
                //     else if(colors[2].equals(colors[i))
                //         result *= 100;
                // }else if(colors[i.equals("orange")){
                //     if(colors[0].equals(colors[i))
                //         result += 30;
                //     else if(colors[1].equals(colors[i))
                //         result += 3;
                //     else if(colors[2].equals(colors[i))
                //         result *= 1_000;
                // }else if(colors[i.equals("yellow")){
                //     if(colors[0].equals(colors[i))
                //         result += 40;
                //     else if(colors[1].equals(colors[i))
                //         result += 4;
                //     else if(colors[2].equals(colors[i))
                //         result *= 10_000;
                // }else if(colors[i.equals("green")){
                //     if(colors[0].equals(colors[i))
                //         result += 50;
                //     else if(colors[1].equals(colors[i))
                //         result += 5;
                //     else if(colors[2].equals(colors[i))
                //         result *= 100_000;
                // }else if(colors[i.equals("blue")){
                //     if(colors[0].equals(colors[i))
                //         result += 60;
                //     else if(colors[1].equals(colors[i))
                //         result += 6;
                //     else if(colors[2].equals(colors[i))
                //         result *= 1_000_000;
                // }else if(colors[i.equals("violet")){
                //     if(colors[0].equals(colors[i))
                //         result += 70;
                //     else if(colors[1].equals(colors[i))
                //         result += 7;
                //     else if(colors[2].equals(colors[i))
                //         result *= 10_000_000;
                // }else if(colors[i.equals("grey")){
                //     if(colors[0].equals(colors[i))
                //         result += 80;
                //     else if(colors[1].equals(colors[i))
                //         result += 8;
                //     else if(colors[2].equals(colors[i))
                //         result *= 100_000_000;
                // }else if(colors[i.equals("white")){
                //     if(colors[0].equals(colors[i))
                //         result += 90;
                //     else if(colors[1].equals(colors[i))
                //         result += 9;
                //     else if(colors[2].equals(colors[i))
                //         result *= 1_000_000_000;
                // System.out.println("색:"+colors[i]);
                // System.out.println("값:"+result);
        }   
        System.out.println(result);
        sc.close();
    }
            //System.out.println(result);
}
    
