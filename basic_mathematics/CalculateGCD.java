import java.util.Scanner;
 class CalculateGCD {
    public static int Calcualtegcd(int a , int b){
        a = Math.abs(a);
        b = Math.abs(b);
        int result =0;
        while(b !=0 ){   
            int reminder = a%b;
            a= b; 
            b = reminder; 
            result = a;      
        }
        return result;
       
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();

        int b = sc.nextInt();
        CalculateGCD find = new CalculateGCD();
        int result = find.Calcualtegcd(a,b);
        System.out.println("gcd of two numbers " + a +" "+" and "+" "+b+ " is "+ result);  
    }
}
