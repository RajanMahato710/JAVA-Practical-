/*
Create a class with a method that prints “This is parent class” and its 
subclass with another method that prints “This is child class”. Now create 
an object for each of the class and call  
a. Method of parent class by object of parent class.  
b. Method of child class by object of child class.  
c. Method of parent class by object of child class.  
*/
class A{
    void display1(){
        System.out.println("This is parent class");
    }
}
class B extends A{
    void display2(){
        System.out.println("This is child class ");
    }
}
public class Problem21 {
    public static void main(String args[]){
        A obj1=new A();
        B obj2=new B();
        obj1.display1();
        obj2.display2();
        obj2.display1();

    }
}
