import java.util.Scanner; 
public class FindPrimeNumber {
    int reminder;
    int count;
    
    public void IsPrime(int number){
        if(number <= 1){
             System.out.println("this is not a prime number");
           return;
             
        }
        for(int i = 2 ; i<=number-1 ; i++){
            
            if( number % i ==0){
                count++;

        }
        
        
    }
    if(count >= 1){
            System.out.println("this is not  a prime number");
        }else{
            System.out.println("this is a prime number");
        }
    
        
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt(); 
       
FindPrimeNumber prime = new FindPrimeNumber();
        prime.IsPrime(number);

        
        
    
}

    }


