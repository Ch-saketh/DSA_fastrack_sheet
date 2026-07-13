import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt(); 
        int OriginalNumber = n;
        int p = String.valueOf(n).length();
        int pal =0;
        while(n!=0){
            double digit =n % 10;
             pal = pal + (int)Math.pow(digit,p);
            n = n/10;
        }
        if(pal == OriginalNumber){
            System.out.println("The given number is an Armstrong number");
        }else{
            System.out.println("The given number is not an Armstrong number");
        }
    }
    
}
