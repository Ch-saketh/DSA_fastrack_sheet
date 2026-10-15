import java.util.Scanner;

public class SumOfDigits{
    public void calucalte(int number){
        int length = String.valueOf(number).length();
        int sum =0;
        for(int i = 0; i < length; i++){
        int digit = number % 10;
        sum += digit; 
        number = number/10;
       }
       System.out.println(sum);
        }
    
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt(); 
        SumOfDigits num = new SumOfDigits();
        num.calucalte(number);
    }
}
