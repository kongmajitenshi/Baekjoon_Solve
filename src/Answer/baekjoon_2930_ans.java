package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2930_ans {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int round = Integer.parseInt(br.readLine());
        String sa = br.readLine();
        int friends = Integer.parseInt(br.readLine());
        String[] friRsp = new String[friends];
        int score = 0, maxScore = 0;

        for(int i=0; i<friends; i++){
            friRsp[i] = br.readLine();
        }

        for(int i=0; i<round; i++){
            int r = 0, s = 0, p = 0;
            for(int j=0; j<friends; j++){
                score += getScore(sa.charAt(i), friRsp[j].charAt(i));
                r += getScore('R', friRsp[j].charAt(i));
                s += getScore('S', friRsp[j].charAt(i));
                p += getScore('P', friRsp[j].charAt(i));
            }
            maxScore += Math.max(Math.max(r, p), s);
        }
        System.out.println(score);
        System.out.println(maxScore);
        
        br.close();
    }

    public static int getScore(char sa, char fr){
        if(sa == fr){
            return 1;
        }
        switch (sa) {
            case 'S': return fr == 'P' ? 2 : 0;
            case 'R': return fr == 'S' ? 2 : 0;
            case 'P': return fr == 'R' ? 2 : 0;
            default: return 0;
        }
    }

}
