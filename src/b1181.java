import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1181 {

    private static void swap(String[] words, int j, int k) {
        String wordTemp = words[k];
        words[k] = words[j];
        words[j] = wordTemp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine();
        }

        br.close();

        // 단어 길이 및 사전순 정렬
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // 길이 비교
                if (words[i].length() > words[j].length()) {
                    swap(words, i, j);
                } 
                // 길이가 같을 때 사전순 비교
                else if (words[i].length() == words[j].length() && !words[i].equals(words[j])) {
                    for (int k = 0; k < words[i].length(); k++) {
                        if (words[i].charAt(k) > words[j].charAt(k)) {
                            swap(words, i, j);
                            break;
                        } else if (words[i].charAt(k) < words[j].charAt(k)) {
                            // 두 단어가 비교 중간에 사전순으로 올바르다면 더 이상 비교할 필요 없음
                            break;
                        }
                    }
                }
            }
        }

        // 중복 제거
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (words[i].equals(words[j])) {
                    words[j] = "";
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            if (!words[i].equals("")) {
                System.out.println(words[i]);
            }
        }
    }
}
