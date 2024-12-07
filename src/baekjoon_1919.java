import java.util.Scanner;

public class baekjoon_1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String in1 = sc.nextLine();
        String in2 = sc.nextLine();

        sc.close();
        // char[] line1 = in1.toCharArray();
        // char[] line2 = in2.toCharArray();

        int[] line1 = new int[26];
        int[] line2 = new int[26];

        for(int i=0; i<in1.length(); i++){
            line1[in1.charAt(i) - 97] ++;
            // System.out.printf("line1[%d]: %d\n", in1.charAt(i) - 97, line1[in1.charAt(i) - 97]);
        }

        for(int i=0; i<in2.length(); i++){
            line2[in2.charAt(i) - 97] ++;
            // System.out.printf("line2[%d]: %d\n", in2.charAt(i) - 97, line2[in2.charAt(i) - 97]);
        }

        int result = 0;

        // for(int i=0; i<25; i++){
        //     if(line1[i] != line2[i]){
        //         if(line1[i]>0 && line2[i]>0){
        //             if(line1[i] > line2[i]){
                        
        //             }else if(line1[i] < line2[i]){

        //             }
        //         }else{
        //             line1[i] = 0;
        //             line2[i] = 0;
        //         }
        //     }
        // }
        for(int i=0; i<26; i++){ 
            // result가 지워야할 알파벳 개수.
            // line1[i]와 line2[i]를 비교. 두 값의 차가 0이라면 상관없음.
            // 두 값의 차가 0이 아니라면, 두 값의 차이만큼 result에 더해주면 됨.
            // 음수가 나올 수 있으니, Math.abs함수를 통해 절대값을 더해주면 됨.
            int count = line1[i] - line2[i];
            if(count != 0){
                result += Math.abs(count);
            }
            
        }

        // for(int l : line1){
        //     result -= l;
        // }
        // for(int l : line2){
        //     result -= l;
        // }
        System.out.println(result);
        

    }
}
