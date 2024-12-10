package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2684 {
    public static void main(String[] args) throws IOException {
        // H:앞 T:뒤
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        // char[] dongjun3 = new char[3];
        String c1 = "TTT", c2 = "TTH", c3 = "THT", c4="THH", c5="HTT", c6="HTH", c7="HHT", c8="HHH";
        
        for(int i=0; i<test; i++){
            int[] counts = new int[8];
            String input = br.readLine();
            // for(int j=0; j<dongjun3.length; j++){
            //     dongjun3[j] = input.charAt(j);
            // }
            for(int j=0; j<38; j++){
                String cut = input.substring(j, j+3);
                if(cut.equals(c1)){
                    counts[0] ++;
                }else if(cut.equals(c2)){
                    counts[1] ++;
                }else if(cut.equals(c3)){
                    counts[2] ++;
                }else if(cut.equals(c4)){
                    counts[3] ++;
                }else if(cut.equals(c5)){
                    counts[4] ++;
                }else if(cut.equals(c6)){
                    counts[5] ++;
                }else if(cut.equals(c7)){
                    counts[6] ++;
                }else if(cut.equals(c8)){
                    counts[7] ++;
                }
            }
            for(int count : counts){
                System.out.printf("%d ", count);
            }
            System.out.println();
            // for(char don : dongjun3){
            //     System.out.printf("%d: %c\n", i, don);
            // }
        }
        br.close();

    }// main
}
