


/*Write a java program to implement method overloading concept.
class Student {
    String name;
    int rollno;
    String address;
}

public class problem12 {

    // Overloaded methods (same method name, different parameters)
    
    public static void display(String name) {
        System.out.println("Name is: " + name);
    }

    public static void display(int rollno) {
        System.out.println("Rollno is: " + rollno);
    }

    public static void display(String address, boolean check) {
        System.out.println("Address is: " + address);
    }

    public static void main(String args[]) {

        Student s = new Student();
        s.name = "Rajan";
        s.rollno = 17;
        s.address = "Padmpur";

        // Calling overloaded methods
        display(s.name);             // Calls display(String)
        display(s.rollno);           // Calls display(int)
        display(s.address, true);    // Calls display(String, boolean)
    }
}
 */


/* 
overriding method area of rectangle and circle:
import java.util.Scanner;
class Area{
    int length;
    int bredth;
    int radius;

   void Area(int length, int bredth){
        System.out.println("Area of rectangle : "+(length*bredth));
    }
    void Area(int radius){
        System.out.println("Area of circle :"+(3.14*radius*radius));
    }
}
public class problem12{

public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        Area s=new Area();
        System.out.println("Enter the length bredth of rectangle: ");
        
        s.length=obj.nextInt();
        s.bredth=obj.nextInt();
        System.out.println("Enter the radius of circle: ");
        s.radius=obj.nextInt();
        s.Area(s.length,s.bredth);
        s.Area(s.radius);
}
}
*/
//
//Write a java program to implement method overloading concept:
import java.util.Scanner;
class area{
    int l,b,r;
    void area(int l,int b){
        System.out.println("Area of rectangle is "+(l*b));
    }
    void area(int r){
        System.out.println("Area of circle is "+(3.14*r*r));
    }
}
public class problem12{
    public static void main(String args[]){
        int length,bredth,radius;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the length and bredth of rectangle: ");
        length=obj.nextInt();
        bredth=obj.nextInt();
        System.out.print("Enter the radius of circle: ");
        radius=obj.nextInt();
        area a=new area();
        a.area(length,bredth);
        a.area(radius);
    }
}






















