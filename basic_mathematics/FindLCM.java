import java.util.*; 


public class FindLCM {
    public  int product (int a , int b){
        a = Math.abs(a);
    b = Math.abs(b);
        int product = 0;
        product = a*b;

        return product;
    }
    public int GCD(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(b!=0){
          int  r = a % b;
            a = b; 
            b = r; 
        }
        return a;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        FindLCM gcd = new FindLCM();
        int gcd_value = gcd.GCD(a,b);
        int product_value = gcd.product(a,b);
        int LCM = product_value/gcd_value;
        System.out.println(LCM);
         
    }
}
