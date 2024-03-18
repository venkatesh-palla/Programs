package MyPrograms;
import java.util.*;

public class FibonaciNumbers2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number :");

        int num = scan.nextInt();
        
        // Initialize the first two Fibonacci numbers
        int a = 0, b = 1;

        // Print the initial Fibonacci numbers
        System.out.println(a);
        System.out.println(b);

        int sum;

        // Calculate and print Fibonacci numbers until reaching the limit
        while ((sum = a + b) <= num) {
            System.out.println(sum);
            a = b;
            b = sum;
        }
    }
}
