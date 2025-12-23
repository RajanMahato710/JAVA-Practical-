/*
Write a program called Swap2Integers that prompts user for two integers. 
The program shall read the inputs as int, save in two variables called 
number1 and number2. Swap the contents of the two variables and print 
the results. 
 */
import java.util.Scanner;
public class problem7 {
    public static void main(String args[]){
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter two number: ");
        a=obj.nextInt();
        b=obj.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("a = "+a+"b = "+b);
    }
}
