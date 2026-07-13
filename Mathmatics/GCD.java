import java.util.Scanner; 


public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the size of elements: ");
        int n = sc.nextInt(); 
        int [] arr = new int[n]; 
        for(int i = 0; i<n ; i++){
            System.out.println("enter the element: ");
            arr[i] = sc.nextInt(); 
        }
        int size = arr.length;
        int temp =0;
        for(int i = 0; i<size;i++){
            for(int j = i+1; j <size ; j++){
                if(arr[i] % arr[j] ==0){
                    temp = arr[j];
                }
                while(arr[i] % arr[j] !=0){
                    int r = arr[i] % arr[j];
                    arr[i] = arr[j];
                    arr[j] = r;
                     temp =r;
                }
             
            }

        }
        System.out.println("The GCD of the given numbers is : " + temp);


    }
    
}
