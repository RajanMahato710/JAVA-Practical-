/*
Write a program to print the area and perimeter of a triangle having sides 
of 3, 4 and 5 units by creating a class named ‘Triangle’ with constructor 
having the three sides as its parameters. 
*/
class Triangle{
    int a,b,c;
    Triangle(int x,int y,int z){
        a=x;
        b=y;
        c=z;
    }
    void area(){
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle: "+area);
    }
    void perimeter(){
        System.out.println("Perimeter of triangle :"+ (a+b+c));
    }
}
public class problem15{
    public static void main(String args[]  ){
        Triangle t=new Triangle(3,4,5);
        t.area();
        t.perimeter();
    }
}