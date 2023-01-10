//performing addition from the user input
import java.util.Scanner;
public class addition {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //create a scanner object
        System.out.println("Enter a number");
        //print the input
        int num1 = myScanner.nextInt();
        System.out.println("Enter another number");
        int num2 = myScanner.nextInt();
        System.out.println(num1 + num2);
    }
}