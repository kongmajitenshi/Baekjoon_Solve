import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_1081 {
    public static void main(String[] args) throws IOException {
        // 나이, 이름 순으로 정보 저장. 나이 부분은 Int로 형변환 하여 크기 비교 하면 됨.
        // 나이순 정렬 하고, 나이가 같다면 들어온 순으로. 인덱스 번호 비교하면 될듯.
        // 한 번에 저장해서 띄어쓰기로 나누거나, 따로따로 입력받아도 됨.
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());
        String[][] info = new String[N][2];

        for(int i=0; i<N; i++){
            info[i][0] = Integer.toString(i) ; // 인덱스 번호 저장
            info[i][1] = in.readLine();  // 이름과 나이 저장
        }
        in.close();
        
        Arrays.sort(info, (i1, i2) -> {
            // i1 은 info[0]을 가리킴. 0번 인덱스에 인덱스 정보를 저장해 두었으니, 
            // 1번 인덱스에 저장된 정보를 추출하면 됨.
            int age1 = Integer.parseInt(i1[1].split(" ")[0]);
            int age2 = Integer.parseInt(i2[1].split(" ")[0]);
            // 나이만 따로 빼옴
            if(age1 != age2){  // 나이가 다르면 나이순
                return age1 - age2;
            }else{  // 나이가 같다면 인덱스 순
                return Integer.parseInt(i1[0]) - Integer.parseInt(i2[0]);
            }
            // return 값이 음수일 경우엔 자리 변경 없음.
            // 그리고 비교한 두 수 중 작은 수와 다음 값 비교.
            // return 값이 양수일 경우엔 서로 위치 바꿈.
            // 그리고 이번에 뒤로 밀려난 큰 값과 다음 값 비교
        });

        for(String[] person : info){
            // person이 info의 큰 배열을 순회함.
            // info는 데이터가 {{"인덱스", "나이 이름"}, {}, ...} 형태로 저장되어 있음.
            // 속 배열의 1번 인덱스에 정보가 저장되어 있기 때문에 1번 배열만 출력.
            // person은 info의 겉 배열에 접근한 값임.
            System.out.println(person[1]);
        }

        

        // int[] age = new int[N];
        // String[] name = new String[N];
    }
}
