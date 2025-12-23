//Write a program to accept two numbers and display their sum using command-line arguments. 
import java.util.Scanner;
public class problem4 {
  public static void main(String args[]){
        int a,b,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        a=obj.nextInt();
        b=obj.nextInt();
        sum=a+b;
        System.out.println("Sum of two number is: "+sum);
  }  
}
