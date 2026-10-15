import java.util.Scanner;

public class FindArmstrongNumber {
    public void CheckArmstrong(int Originalnumber) {
         int length = String.valueOf(Originalnumber).length();
         int sum =0;
         int original = Originalnumber;
         int result = 0;
         int digit=0;
         for(int i = 0; i < length ; i++){     // i = 0 , i <3 , i =1 , i =2 
            digit =Originalnumber % 10;          // temp = 3 , 5
            Originalnumber /= 10;  // original number 15 , 1 ,0
            sum += (int) Math.pow(digit, 3); // sum = 0 + 3 ^3 , 27+5^3,  + 152+1
             
         }
         if(original == sum){
            System.out.println("this number is a Armstrong Number ");
         }else{
             System.out.println("this number is not Armstrong Number ");
         }
         
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Originalnumber = sc.nextInt();
        FindArmstrongNumber ams = new FindArmstrongNumber();
        ams.CheckArmstrong(Originalnumber);
    }
}