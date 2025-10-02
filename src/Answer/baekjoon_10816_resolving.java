package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class baekjoon_10816_resolving {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> nums = new HashMap<>();
        String[] input = br.readLine().split(" ");
        
        for(int i=0; i<n; i++){
            nums.put(input[i], nums.getOrDefault(input[i], 0)+1);
            // 맵 nums의 키 값으로는 input[i]를 넣음. 내가 1 2 2 입력했으면 키값으로 1과 2가 들어감.
            // nums의 키 1의 값으로는 처음엔 1이 들어감. 처음 넣을 땐 키 1이 없으니 디폴트밸류 0이 들어가고, 거기에 +1을 해줌.
            // 키 2일땐 첫번째 순회는 윗줄과 같음. 두번째 2를 만나면 키 2의 밸류 1이 있으니 디폴트밸류 0은 무시하고 키 2의 밸류 1이 추출됨.
            // 거기에 +1을 해주게 되니 최종적으로 키1 밸류1, 키2 밸류2가 되는 것.
            // 여기까지 세팅은 오케이. 이제 출력만 잘 해주면 됨.
        }

        int m = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            sb.append(nums.getOrDefault(input2[i], 0) + " ");
        }

        System.out.println(sb.toString().trim());
    }
}
