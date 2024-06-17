// import java.util.Scanner;

// public class baekjoon_1010 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int test, west, east;
//         test = sc.nextInt();

//         int[] result = new int[test];

//         for(int i=0; i<test; i++){
//             west = sc.nextInt();        
//             east = sc.nextInt();        
//             if(0<west && west <= east && east < 30){
//                 // int oriWest = west;
//                 // int oriEast = east;
                
//                 // for(int j=east-1; j>=1; j--){
//                     //     east *= j;
//                     //     System.out.println("east: " + east);
//                     // }
                    
//                     // for(int j=west-1; j>=1; j--){
//                         //     west = west*j;
//                         //     System.out.println("west: " + west);
//                         // }
                        
//                         // int eaMiWe = 1;
//                         // for(int j=oriEast-oriWest; j>=1; j--){
//                             //     eaMiWe *= j;
//                 //     System.out.println("3: " + eaMiWe);
//                 // }

//                 //int factResult = east;
//                 // for(int j=east-1; j>west; j--){
//                 //     factResult *= j;
//                 //     System.out.println("1: "+factResult);
//                 // }

//                 // int eastMiWe = east - west;
//                 // for (int j=eastMiWe-1; j>1; j--){
//                 //     eastMiWe *= j;
//                 //     System.out.println("2: " + eastMiWe);
//                 // }
//                 int[] factResultEast = new int[east];
//                 for(int j=0; j<east; j++){
//                     factResultEast[j] = j+1;
//                 }
                
//                 int[] factResultWest = new int[west];
//                 for(int j=0; j<west; j++){
//                     factResultWest[j] = j+1;
//                 }

//                 int eaMiWe = east - west;
//                 int[] factEaMiWe = new int[eaMiWe];
//                 for(int j=0; j<eaMiWe; j++){
//                     factEaMiWe[j] = j+1;
//                 }

//                 // for(int j=0; j<west; j++) {
//                 //     if(factResultEast[j] == factResultWest[j]){
//                 //         factResultEast[j] = 1;
//                 //         factResultWest[j] = 1;
//                 //     }
//                 // }

//                 // for(int j=0; j<eaMiWe; j++){
//                 //     if(factResultEast[j] == factEaMiWe[j]){
//                 //         factResultEast[j] = 1;
//                 //         factEaMiWe[j] = 1;
//                 //     }
//                 // }
//                 int factTop = 1;
//                 int factBot = 1;
//                 for(int eastNum : factResultEast){
//                     System.out.println("eastNum: " + eastNum);
//                     for(int westNum : factResultWest){
//                         if(eastNum % westNum == 0){
//                             eastNum = eastNum / westNum;
//                             westNum = westNum / eastNum;
//                             // for(int k=0; k<factResultWest.length; k++){
//                             //     factResultWest[k] = westNum;
//                             // }
//                             // for(int k=0; k<factResultEast.length; k++){
//                             //     factResultEast[k] = eastNum;
//                             // }
//                         }
//                         System.out.println("westNum: " + westNum);

//                     }
//                     for(int eaMiWeNum : factEaMiWe){
//                         if(eastNum % eaMiWeNum == 0){
//                             eastNum = eastNum / eaMiWeNum;
//                             eaMiWeNum = eaMiWeNum / eastNum;
//                             // for(int k=0; k<factEaMiWe.length; k++){
//                             //     factEaMiWe[k] = eaMiWeNum;
//                             // }
//                             // for(int k=0; k<factResultEast.length; k++){
//                             //     factResultEast[k] = eastNum;
//                             // }
//                         }
//                         System.out.println("eaMiWeNum: " + eaMiWeNum);
                        
//                     }
//                     // factTop = factTop * eastNum;
//                     System.out.println("----------");
//                 }

                

//                 // int factResutTop = 1; //
//                 // int factResutBot = 1;
//                 // for(int j=0; j<east; j++){
//                 //     factResutTop *= factResultEast[j];
//                 //     System.out.println("분자: " + factResutTop);
//                 // }
//                 // for(int j=0; j<west; j++){
//                 //     factResutBot *= factResultWest[j];
//                 //     System.out.println("분모: " + factResutBot);
//                 // }
//                 // for(int j=0; j<eaMiWe; j++){
//                 //     factResutBot *= factEaMiWe[j];
//                 //     System.out.println("분모: " + factResutBot);
//                 // }

//                 // result[i] = factResutTop / factResutBot; //

//                 // for(int j=0; j<west; j++) {
//                 //     if(factResultEast[j] == factEaMiWe[j]){
//                 //         factResultEast[j] = 1;
//                 //         factEaMiWe[j] = 1;
//                 //     }
//                 // }



//                 // for(int j=0; j<east; j++){
//                 //     System.out.println(factResult[j]);

//                 // }
//                 // for(int j=0; j<west; j++){
//                 //     System.out.println(eaMiWe[j]);

//                 // }

                
//                 // result[i] = factResult/eastMiWe;
        
//                 // result[i] = east / (west*eaMiWe);
//             }
//         }

//         for(int i=0; i<test; i++){
//             System.out.println("result: " + result[i]);
//         }

//         sc.close();

//     }
// }
