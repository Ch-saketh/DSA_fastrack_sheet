import java.util.Scanner;
public class FIndLeapYear {

    public void leapyear(int year){
        int count;
        if( year % 4 == 0){
            if(year % 100 != 0){
                System.out.println(year + "this is a leap year");
            }else if (year % 400 == 0){
                System.out.println(year + "this is a leap year");

            }else{
                System.out.println(year + "this is not a leap year");

            } 
            
        }else {
                 System.out.println(year + " is not a leap year");
            }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        FIndLeapYear yr = new FIndLeapYear();
                    yr.leapyear(year);
    }
    
}
