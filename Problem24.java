/*
Write a java program to create base class Fruit which has name, taste and 
size as its attributes and method called eat() which describe name and its 
taste. Inherit the same in two other class Apple and Orange and override 
the eat() method to represent each fruit taste. 
*/
import java.util.Scanner;
class Fruit{
    String name;
    String test;
    String size;
    void eat(){
        System.out.println("Fruit name is "+name+" "+"Test was "+test+"size is "+size);
    }
}
class Apple extends Fruit{
    void eat(){
        System.out.println("Fruit name is "+name+" "+"Test was "+test+"size is "+size);
    }
}
class Orange extends Fruit{
    void eat(){
        System.out.println("Fruit name is "+name+" "+"Test was "+test+"size is "+size);
    }
}
public class Problem24 {
    public static void main(String[] args) {
        String f_name,f_test, f_size;
        Scanner obj1=new Scanner(System.in);
        System.out.print("Enter the fruit name: ");
        f_name=obj1.next();
        System.out.print("Enter the Fruit test: ");
        f_test=obj1.next();
        System.out.print("Enter the fruit size: ");
        f_size=obj1.next();
        Orange obj2=new Orange();
        obj2.name=f_name;
        obj2.test=f_test;
        obj2.size=f_size;
        Apple obj3=new Apple();
        obj3.name=f_name;
        obj3.test=f_test;
        obj3.size=f_size;
        obj2.eat();
        obj3.eat();
    }
}
