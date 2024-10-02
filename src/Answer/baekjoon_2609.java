import java.util.Scanner;

public class baekjoon_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gongyaksu = 0;
        int gongbaesu = num1 * num2;

        //if(num1 > num2){
            for(int i=1; i<=num2; i++){
                if(num1%i==0 && num2%i==0){
                    gongyaksu = i;
                    //System.out.println("공약수:"+gongyaksu);
                }
            }
            
            for(int i=gongbaesu; i>2; i-=gongyaksu){
                if(i%num1==0 && i%num2==0){
                    gongbaesu = i;
                    //System.out.println("공배수:" + i);
                }
            }
       //}
       System.out.println(gongyaksu);
       System.out.println(gongbaesu);

        sc.close();
    }
}
