package Answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class baekjoon_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<Integer> originSet = new HashSet<>();
        String[] nNums = br.readLine().split(" ");
        for(String s : nNums){
            originSet.add(Integer.parseInt(s));
        }

        int m = Integer.parseInt(br.readLine());
        String[] mNums = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for(String s : mNums){
            if(originSet.contains(Integer.parseInt(s))){
                sb.append("1\n");
            }else{
                sb.append("0\n");
            }
        }

        System.out.println(sb);

    }
}