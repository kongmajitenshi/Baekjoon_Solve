package Answer;
import java.util.Date;
import java.text.SimpleDateFormat;


public class baekjoon_10699 {
    public static void main(String[] args) {
        Date date = new Date(); // 현재 로컬 시간
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));

        
        //System.out.println(sdf.format(date));
    }
}
