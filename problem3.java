//Write a java program to find simple interest. Use command line argument to take input.  
import java.util.Scanner;
public class problem3 {
    public static void main(String args[]){
        int p;
        double t,r,si;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the principle time and rate: ");
        p=obj.nextInt();
        t=obj.nextDouble();
        r=obj.nextDouble();
        si=(p*t*r)/100;
        System.out.println("The Simple interest is: "+si);
    }
}
