import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;



import java.util.Scanner;

public class LargestNumber {
    public static int getLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = getLargest(arr);
        System.out.println("Largest element = " + result);
        sc.close();
    }
}
