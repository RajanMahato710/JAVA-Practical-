/*
Create a class named ‘Rectangle’ with two data members ‘length’ and 
‘breadth’ and two methods to print the area and perimeter of the rectangle 
respectively. Its constructor having parameters for length and breadth is 
used to initialize length and breadth of the rectangle.  
Let call ‘square’ inherit the ‘Rectangle’ class with its constructor having 
a parameter for its side (suppose s) calling the constructor of its parent 
class as ‘super(s,s)’. print the area and perimeter of a rectangle and a 
square.  
*/
import java.util.Scanner;
class Rectangle{
    int length,breadth;
        Rectangle(int l,int b){
            length=l;
            breadth=b;
        }
    void area(){
        System.out.println("Area of rectangle: "+(length*breadth));
    }
    void perimeter(){
    System.out.println("Perimeter of rectangle: "+(2*(length+breadth)));
    }
}
class square extends Rectangle{
    square(int s){
        super(s,s);
    }
}
public class Problem22{
    public static void main(String args[]){
        int l,b;
        Scanner obj1=new Scanner(System.in);
        System.out.print("Enter the length and breadth of rectangle: ");
        l=obj1.nextInt();
        b=obj1.nextInt();
        Rectangle obj2=new Rectangle(l,b);
        obj2.area();
        obj2.perimeter();
        square obj3=new square(l);
        obj3.area();
        obj3.perimeter();

    }
}