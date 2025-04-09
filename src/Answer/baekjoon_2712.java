package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        double kgToLb = 2.2046, lbToKg = 0.4536;
        double lToG = 0.2642, gToL = 3.7854;
        for(int i=0; i<test; i++){
            String input = br.readLine();
            double value = Double.parseDouble(input.split(" ")[0]);
            String danwi = input.split(" ")[1];
            switch (danwi) {
                case "kg": value = value * kgToLb; danwi="lb"; break;
                case "lb": value = value * lbToKg; danwi="kg"; break;
                case "l": value = value * lToG; danwi="g"; break;
                case "g": value = value * gToL; danwi="l"; break;
                default: break;
            }
            System.out.printf("%.4f %s\n", value, danwi);
        }
        br.close();
    }
}
