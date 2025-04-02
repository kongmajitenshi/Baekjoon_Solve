import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2930 {
    public static void main(String[] args) throws IOException {
        /* 가위바위보 게임. 입력은 S(가위) R(바위) P(보자기) 총 3가지.
         * 상성은 S > P > R > S 임. 
         * 승리시 +2, 무승부 +1, 패배 0점
         * <<입력>>
         * 라운드 수 
         * 상근이 S R P (라운드 수 만큼)
         * 친구 수
         * 친구 S R P(라운드 수 만큼) * 친구 수 (줄 바꿔서 입력)
         * <<출력>>
         * 상근이의 점수
         * 상근이가 얻을 수 있는 최대 점수(상근이랑 친구들 SRP는 정해져있고, 그 안에서 최다승리 하면 됨)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int round = Integer.parseInt(br.readLine());  // 라운드 수. 
        String rsp = br.readLine();  // 상근이 가위바위보 
        int friends = Integer.parseInt(br.readLine());  // 친구 수
        String[] friRsp = new String[friends];  // 친구 가위바위보
        for(int i=0; i<friends; i++){
            friRsp[i] = br.readLine();
        }
        br.close();

        int score = 0;  // 상근이 현재 점수 저장
        int maxScore = 0;  // 상근이 최대 점수 저장

        for(int j=0; j<friends; j++){
            for(int i=0; i<round; i++){
                if(rsp.charAt(i) == 'R'){
                    if(friRsp[j].charAt(i) == 'R'){
                        score ++;
                    }else if(friRsp[j].charAt(i) == 'S'){
                        score += 2;
                    }else if(friRsp[j].charAt(i) == 'P'){
                        score += 0;
                    }
                }else if(rsp.charAt(i) == 'S'){
                    if(friRsp[j].charAt(i) == 'R'){
                        score += 0;
                    }else if(friRsp[j].charAt(i) == 'S'){
                        score ++;
                    }else if(friRsp[j].charAt(i) == 'P'){
                        score += 2;
                    }
                }else if(rsp.charAt(i) == 'P'){
                    if(friRsp[j].charAt(i) == 'R'){
                        score += 2;
                    }else if(friRsp[j].charAt(i) == 'S'){
                        score += 0;
                    }else if(friRsp[j].charAt(i) == 'P'){
                        score ++;
                    }
                }
                
            }
        }
        System.out.println(score);
        System.out.println(maxScore);
        
    }
}
 