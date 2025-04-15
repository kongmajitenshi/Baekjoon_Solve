package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(br.readLine());

        for(int i=0; i<times; i++){
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            String input = br.readLine();
            String binary;
            String format;
            for(int j=0; j<3; j++){
                binary = Integer.toBinaryString(Integer.parseInt(input.split(":")[j]));
                format = String.format("%6s", binary).replace(' ', '0');
                sb.append(format);
            }
            for(int j=0; j<6; j++){
                sb2.append(sb.charAt(j));
                sb2.append(sb.charAt(j+6));
                sb2.append(sb.charAt(j+12));
                // System.out.printf("%c%c%c", sb.charAt(j), sb.charAt(j+6), sb.charAt(j+12));
            }
            //System.out.print(" ");
            System.out.printf("%s %s\n", sb2, sb);
        }
        br.close();

    }
}
