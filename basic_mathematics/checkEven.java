

//++++++++ basic implementation with Scanner +++++++++++

import java.util.Scanner;
public class checkEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
            if(n%2==0){
                System.out.println("even"); 
            }else{
                System.out.println("odd");
            }
        sc.close();
    }
}

// ++++++++ basic implementation with BufferReader +++++++++++

// import java.io.BufferedReader;
// import java.io.InputStreamReader; 
// import java.io.IOException; 

// public class checkEven{
//     public static void main(String args[])throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//          if(n%2==0){
//             System.out.println("even");
//         }else{
//             System.out.println("Odd");
//         }
//     }
// }