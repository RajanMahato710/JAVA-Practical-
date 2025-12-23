/*
Create a class named ‘Shape’ with a method to print “This is shape”. Then 
create two other classes named ‘Rectangle’, ‘Circle’ inheriting the Shape 
class, both having a method to print “This is rectangular shape” and “This 
is circular shape” respectively. Create a subclass ‘Square’ of ‘Rectangle’ 
having a method to print “Square is a rectangle”. Now call the method of 
‘Shape’ and ‘Rectangle’ class by the object of ‘Square’ class.  
*/
class Shape{
    void displayShape(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{
    void displayRectangle(){
        System.out.println("This is rectangular shape");
    }
}
class Circle extends Shape{
    void displayCircle(){
        System.out.println("This circular shape");
    }
}
class Square extends Rectangle{
    void displaySquare(){
        System.out.println("This is square in rectangle shape");
    }
}
public class Problem23{

    public static void main(String args[]) {
         Square obj1=new Square();
         obj1.displayShape();
         obj1.displayRectangle();
    }
}

