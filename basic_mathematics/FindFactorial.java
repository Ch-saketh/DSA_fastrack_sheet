import java.util.Scanner;
import java.math.BigInteger;

public class FindFactorial {
    public void Factorial(int number) {
        int sum = 1;
        for (int i = number; i >= 1; i--) {
            sum *= i;
        }
        System.out.println("the factorial is sum" + " " + sum);
    }

    public void optimalapproach(int number) {

        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= 25; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        FindFactorial find = new FindFactorial();
        find.Factorial(number);
        find.optimalapproach(number);
    }

}
// optimal solution
