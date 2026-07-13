import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt(); 
                boolean isPrime = true;

        if (n <= 1){
            isPrime = false;        }
        for(int i =2 ; i*i <= n ;i++){
            if(n %i ==0){
                isPrime =false;
                break;
            }
        }
        if(isPrime){
            System.out.println("given number is a prime number");
        }else{
            System.out.println("given number is not a prime number");
        }
    }
}