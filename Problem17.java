// Write a program to find factorial of given number by using recursion.
import java.util.Scanner;

public class Problem17 {

    int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = obj.nextInt();
        Problem17 p = new Problem17(); // create object

        System.out.print("Factorial of " + n + " is: " + p.fact(n));
    }
}
