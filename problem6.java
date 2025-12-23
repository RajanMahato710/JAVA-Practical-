//Write a program to display area and volume of sphere.  Area=4𝜋𝑟2      
import java.util.Scanner;  
public class problem6 {
        public static void main(String args[]){

            int r;
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the radius: ");
            r=obj.nextInt();
            System.out.println("Area of sphere: "+(4*3.14*r*r));
            System.out.println("Volumn of sphere: "+(4.0/3*3.14*r*r*r));
        }

}
