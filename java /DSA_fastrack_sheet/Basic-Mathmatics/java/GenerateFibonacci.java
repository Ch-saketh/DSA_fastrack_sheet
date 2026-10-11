import java.util.Scanner; 

public class GenerateFibonacci{
    public  void UptoGiveNumber(int number){
        int first = 0; 
        int second = 1; 
        while(first <= number ){
            System.out.print( first + " ");
            int next = first + second;
            first = second; 
             second = next;

        }

        }
        public void printByValue(int max) {
    int a = 0;
    int b = 1;

    for (int i = 0; i < max; i++) {
        System.out.print(a + " ");

        int next = a + b;
        a = b;
        b = next;
    }
}

        

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int max = sc.nextInt();
        GenerateFibonacci fib = new GenerateFibonacci();

        fib.printByValue(max);
        System.out.println();

        fib.UptoGiveNumber(number);

        
        
    }
}