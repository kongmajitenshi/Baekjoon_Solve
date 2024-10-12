// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class baekjoon_2751 {
//     public static void main(String[] args) throws IOException {
//         // N의 개수는 1 이상 1,000,000 이하, 입력받을 수의 값은 1,000,000 이하
//         // 수 중복X 
//         // 중복이 없으니 퀵정렬 쓰면 될듯?
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int N = Integer.parseInt(br.readLine());
//         // int[] nums = new int[N+1];
//         int current = 0;
//         // int j = N-1;

//         for(int i=0; i<N; i++){
//             current = Integer.parseInt(br.readLine());
//             // for(int j=i; j<N; j++){
//             //     if(current > nums[j]){
//             //         nums[j] = current;
//             //     }else if(current < nums[i]){
//             //         nums[j] = nums[i];
//             //     }
//             // }
//             // if(current > nums[N]){
//             //     nums[N-1] = nums[N];
//             //     nums[N] = current;
//             // }else if(current > nums[i]){
//             //     nums[i+1] = current;
//             // }else if(current < nums[i]){
//             //     nums[i+1] = nums[i];
//             //     nums[i] = current;
//             // }else if(current < nums[N]){
//             //     nums[N-1] = current;
//             // }
//             // if(current > nums[j]){
//             //     nums[j - 1] = nums[j];
//             //     nums[j] = current;
//             //     j--;
//             // }else if(current < nums[j]){
//             //     nums[j-1] = current;
//             //     j--;
//             // }
//             //nums[i] = Integer.parseInt(br.readLine());
//         }
//         for(int i=1; i<N+1; i++){
//             System.out.println(nums[i]);
//         }

//         br.close();


//     }
// }