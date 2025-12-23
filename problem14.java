/*
Write a program to print the area of a rectangle by creating a class named 
‘Area’ taking the value of its length and breadth as parameters of its 
constructor and having a method named ‘returnArea’ which returns the 
area of the rectangle. Length and breadth of rectangle are entered through 
keyboard
*/
import java.util.Scanner;
class Area{
    int l,b;
 Area(int length, int bredth){
    l = length;
    b = bredth;
}

    int returnArea(){
        return l*b;
    }
}
public class problem14{
    public static void main(String args[]){
        int length,bredth;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the length and bredth of rectangle: ");
        length=obj.nextInt();
        bredth=obj.nextInt();
        Area a=new Area(length,bredth);
        System.out.println("Area of rectangle is "+a.returnArea());
    }
}