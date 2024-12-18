package Answer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1362 {
    public static void main(String[] args) throws IOException {
        /* 코드 내용
         * E: 운동, 입력만큼 체중 감소
         * F: 먹이, 입력만큼 체중 증가
         * 적정 체중의 1/2배 초과, 2배 미만이라면 행복 :-)
         * 체중이 0 이하라면 사망 RIP
         * 그 외 모두 슬픔 :-(
         * 첫 줄에 적정체중과 실제체중 입력됨
         * # 0 입력시 해당 시나리오 종료, 그 후 적정체중과 현재체중 출력
         * 모든 시나리오 종료 시 0 0 입력
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ArrayList<String> results = new ArrayList<String>();
        
        // String[] results = new String[10];
        int num = 1;

        while(true){
            String input = br.readLine();
            int nice = Integer.parseInt(input.split(" ")[0]), now = Integer.parseInt(input.split(" ")[1]);
            if(input.equals("0 0")) break;
            // boolean dead = false;

            while(true){
                String workAndValue = br.readLine();
                String work = workAndValue.split(" ")[0];
                //char work = workAndValue.charAt(0);
                int value = Integer.parseInt(workAndValue.split(" ")[1]);
                
                if(workAndValue.equals("# 0")) break;

                if(work.equals("F")){
                    now += value;
                }else if(work.equals("E")){
                    now -= value;
                }

                // if(now <= 0){
                //     dead = true;
                // }

            }
            
            if(now <= 0){
                System.out.println((num) + " RIP");
                // results[num] = now + ":-)";
                // results.add(":-)");
                // :-)
            }else if(nice/2<now && now<nice*2){
                System.out.println((num) + " :-)");
                // results[num] = now + "RIP";
                // results.add("RIP");
                // RIP
            }else{
                System.out.println((num) + " :-(");
                // results[num] = now + ":-(";
                // results.add(":-(");
                // :-(
            }
            num ++;
        
        }
        br.close();
        
        // for(int i=0; i<results.size(); i++){
        //     System.out.printf("%d %s\n", i+1, results.get(i));
        // }

    }  // main
}
