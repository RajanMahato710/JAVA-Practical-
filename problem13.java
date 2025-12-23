/*
Write a program to print the area and perimeter of a triangle having sides 
of 3,4 and 5 units by creating a class named ‘Triangle’ without any 
parameter in its constructor. 
*/
class Triangle{
    int a,b,c;
    Triangle(){
        a=3;
        b=4;
        c=5;
    }
    void area(){
        //System.out.println("Area of triangle: "+(1.0/2*l*b));
        double s = (a + b + c) / 2.0; // semi-perimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle: " + area);
    }
    void perimeter(){
        System.out.println("Perimeter of triangle: "+(a+b+c));
    }
}
public class problem13 {
    public static void main(String args[]){
        Triangle t=new Triangle();
        
        t.area();
        t.perimeter();
    }
}
