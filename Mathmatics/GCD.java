import java.util.*; 

public class GCD{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements: ");
        int n = sc.nextInt(); 
        int [] arr = new int[n]; 
        
        System.out.println("enter the elements: ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        } 
        int r = 0; 
        int temp =0;
        for(int i =0    ; i < n ; i++){
          for(int j = i+1 ; j < n ; j++){
            if(arr[i] == arr[j]){
                temp = arr[i];
            }
            if(arr[i]==0 || arr[j]==0){
                temp = arr[i] + arr[j];
            }
              while(arr[i] % arr[j] != 0){
                  r = arr[i] % arr[j];
                  arr[i] = arr[j];
                  arr[j] = r;
                  temp =r;

              }
          }
        }
        System.out.println("GCD of given numbers is: " + temp);

    }
}