import java.util.Scanner;

public class baekjoon_1526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        
        while(true){
            boolean check = true;  // 7 or 4 가 아니라면 false
            for(int i=0; i<input.length(); i++){
                if(input.charAt(i) != '4' && input.charAt(i) != '7'){
                    check = false;
                    break;
                }
            }

            if(check == true){
                break;
            }else{
                input = String.valueOf(Integer.parseInt(input) - 1);
            }
        }
        
        System.out.println(input);

    }
}
