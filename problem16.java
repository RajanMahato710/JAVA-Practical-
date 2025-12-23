/*
Write a program to print the area of two rectangles having sides (4,5) and 
(5,8) respectively by creating a class named ‘Rectangle’ with a method 
name ‘Area’ which returns the area, length and breadth passed as 
parameters to its constructor.  

class Rectangle{
    int l,b;
    Rectangle(int length,int bredth){
        l=length;
        b=bredth;
    }
    int Area(){
        return l*b;
    }
}

public class problem16 {
    public static void main(String args[]){
        Rectangle a1=new Rectangle(4,5);
        Rectangle a2=new Rectangle(5,8);
        System.out.println("Area of first rectangle is "+a1.Area());
        System.out.println("Arae of second rectangle is "+a2.Area());
    }
}
*/
