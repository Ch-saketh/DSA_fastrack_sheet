import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in); 
        System.out.println("enter the number : ");
        int number = sc.nextInt(); 
        int OriginalNumber = number;    
        int rev =0; 
        while(number != 0){
            int digit =  number %10;
            rev = rev*10 + digit;
            number = number/10;
        }
        if(rev == OriginalNumber){
            System.out.println("The given number is a palindrome");
        }else{
            System.out.println("The given number is not a palindrome");
    }
}
}