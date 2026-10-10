import java.util.Scanner;
public class CheckPalindrome {
    public void CheckStringPalindrome(String data){
        int n = data.length();
        
        int a = data.charAt(0);
int b = data.charAt(n - 1);
           
       
       if(a == b){
            System.out.println("this is a plaindorme string ");
           }else{
            System.out.println("this is not palindrome string");
           }
    }

    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        CheckPalindrome cp = new CheckPalindrome();
        cp.CheckStringPalindrome(data);

    }
}


