import java.util.Scanner; 

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter integer:"); 
        int n = sc.nextInt();
        int count = 0;
        
        if (n == 0) {
            System.out.println("The number of digits in the given integer is: 1");
        } else {
            // This else block ensures this logic only runs if n is NOT 0
            n = Math.abs(n); // Handles negative numbers perfectly!
            while (n > 0) {
                count++; 
                n = n / 10;
            }
            System.out.println("The number of digits in the given integer is: " + count);
        }
        
        sc.close();
    }
}