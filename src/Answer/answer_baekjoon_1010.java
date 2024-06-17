package Answer;


import java.util.Scanner;

public class answer_baekjoon_1010 { //240406 정답
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int test, N, M;
        
        test = sc.nextInt();

        long[] factResult = new long[test];

        for(int i=0; i<test; i++){
            factResult[i] = (long) 1;
            N = sc.nextInt();
            M = sc.nextInt();
            int MN = M - N;
            if(0<N && N<=M && M<30){
                long[] factN = new long[N];
                long[] factM = new long[M];
                long[] factMN = new long[MN];
                for(int j=0; j<factN.length; j++){
                    factN[j] = j+1;
                }
                for(int j=0; j<factM.length; j++){
                    factM[j] = j+1;
                }
                for(int j=0; j<factMN.length; j++){
                    factMN[j] = j+1;
                }
                
                for(int j=0; j<N; j++){
                    for(int k=0; k<M; k++){
                        if(factM[k] % factN[j] == 0){
                            factM[k] /= factN[j];
                            factN[j] = 1;
                        }
                    }
                }

                for(int j=0; j<MN; j++){
                    for(int k=0; k<M; k++){
                        if(factM[k] % factMN[j] == 0){
                            factM[k] /= factMN[j];
                            factMN[j] = 1;
                        }
                    }
                }
                
                for(int j=0; j<M; j++){
                    //System.out.println("1:"+factM[j]);
                    factResult[i] *= factM[j];
                }
                for(int j=0; j<N; j++){
                    //System.out.println("2:"+factN[j]);
                    factResult[i] /= factN[j];
                }
                for(int j=0; j<MN; j++){
                    //System.out.println("3:"+factMN[j]);
                    factResult[i] /= factMN[j];
                }
                
                // System.out.println(factResult[i]);
                
                // for(int j=0; j<M; j++){
                    //     for(int k=0; k<N; k++){
                        //         if(factN[j] % factM[k] == 0){
                            //             factN[j] = factN[j] / factM[k];
                //             factM[k] = 1;
                //         }    
                //     }
                //     for(int k=0; k<MN; k++){
                //         if(factN[j] % factMN[k] == 0){
                //             factN[j] = factN[j] / factMN[k];
                //             factMN[k] = 1;
                //         }    
                //     } 
                // }
                // for(long m: factM){
                //     factResult *= m;
                // }
                // for(long n: factN){
                //     factResult /= n;
                // }
                // for(long mn: factMN){
                //     factResult /= mn;
                // }

                // for(int j=M; j>N; j--){
                //     factResult[i] *= j;
                // }
                
                // for(int k=MN; k>1; k--){
                //     factResult[i] /= k;
                // }



                // System.out.println(factResult);

          
                
                //System.out.println("m: " + m);
                
                // for(long m : factM){
                //     factResult /= m; 
                // }
                // for(long mn : factMN){
                //     factResult /= mn; 
                // }
            }
            
        }
        for(int l=0; l<test; l++){
            System.out.println(factResult[l]);
        }

        sc.close();
    }
}
