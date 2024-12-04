package Answer;
import java.io.IOException;
import java.util.Scanner;

public class baekjoon_1434 {
    public static void main(String[] args) throws IOException {
        int n, m, boxNum=0, surplus=0;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();

        int[] boxes = new int[n];
        int[] books = new int[m];

        for(int i=0; i<n; i++){
            boxes[i] = sc.nextInt();
        }

        for(int i=0; i<m; i++){
            books[i] = sc.nextInt();
        }

        sc.close();
        
        for(int i=0; i<m; i++){
            while(true){
                if(boxes[boxNum] < books[i]){
                    boxNum ++;
                }else{
                    boxes[boxNum] -= books[i];
                    break;
                }
            }
        }
        for(int box : boxes){
            surplus += box;
        }
        System.out.println(surplus);
        
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // String boxesAndBooks = br.readLine();
        // String boxSize = br.readLine();
        // String bookSize = br.readLine();
        // br.close();

        // int boxes = Integer.parseInt(boxesAndBooks.split(" ")[0]);
        // int books = Integer.parseInt(boxesAndBooks.split(" ")[1]);
        // int[] boxSizes = new int[boxes];
        // int[] bookSizes = new int[books];

        // int weightBox = 0;
        // int weightBook = 0;

        // for(int i=0; i<boxes; i++){
        //     boxSizes[i] = Integer.parseInt(boxSize.split(" ")[i]);
        //     weightBox += boxSizes[i];
        // }

        // for(int i=0; i<books; i++){
        //     bookSizes[i] = Integer.parseInt(bookSize.split(" ")[i]);
        //     weightBook += bookSizes[i];
        // }
        // int num = 0;
        // int boxNum = 0;
        // boolean full = false;

        // while(true){
        //     full = false;
        //     if(boxSizes[boxNum] >= bookSizes[num]){
        //         boxSizes[boxNum] -= bookSizes[num];
        //         weightBox -= bookSizes[num];
        //     }else if(boxSizes[boxNum] < bookSizes[num]){
        //         if(boxSizes[boxNum+2] >= bookSizes[num]){
        //             boxSizes[boxNum+2] -= bookSizes[num];
        //             weightBox -= bookSizes[num];
        //         }else if(boxSizes[boxNum+1] >= bookSizes[num]){
        //             boxSizes[boxNum+1] -= bookSizes[num];
        //             weightBox -= bookSizes[num];
        //         }
        //     }
        //     if(full == true){
        //         boxNum ++;
        //     }
        //     num ++;
        //     if(weightBook <= 0){
        //         break;
        //     }
        // }

        // System.out.println(weightBox);
    }
}
