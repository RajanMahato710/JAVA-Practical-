/*
Create a class Person with attributes name and age, and a method 
display(). Derive a class Employee from Person with additional attributes 
employeeId and salary. Use constructors and override the 
display() method to include all details. 

import java.util.Scanner;
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;

    }
    void display(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}
class Employee extends Person{
    int emp_id, salary;
    Employee(String name,int age,int id,int s){
        super(name, age);
        emp_id=id;
        salary=s;
    }
   void display(){
    super.display();
    System.out.println("Employee id is: "+emp_id);
    System.out.println("Employee salary is: "+salary);
    }
}
public class Problem25 {
    public static void main(String[] args) {
        String name;
        int age,emp_id, salary;
        Scanner obj1=new Scanner(System.in);
        System.out.print("Enter the Name Age EmployeeId and Salary:");
        name=obj1.next();
        age=obj1.nextInt();
        emp_id=obj1.nextInt();
        salary=obj1.nextInt();
        Employee obj2=new Employee(name,age,emp_id,salary);
        obj2.display();

    }
}
*/
/*
Create a class People with attributes name and age, and a method 
display(). Derive a class Employee from Person with additional attributes 
employeeId and salary. Use constructors and override the 
display() method to include all details. 
*/
import java.util.Scanner;
class People{
    String name;
    int age;
        void display(String name,int age){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}
class Employee extends People{
    int id;
    double s;
    Employee(String name,int age,int emp_id,double salary){
        super.display(name,age);
        id=emp_id;
        s=salary;
    }
    void display(){
        System.out.println("Employee id is: "+id);
        System.out.println("salary is: "+s);
    }
}
public class Problem25{
    public static void main(String[] args) {
        String name;
        int age,id;
        double s;
        Scanner obj1=new Scanner(System.in);
        System.out.print("Enter the employee name age empid and salary: ");
        name=obj1.next();
        age=obj1.nextInt();
        id=obj1.nextInt();
        s=obj1.nextDouble();
        Employee obj2=new Employee(name,age,id,s);
        obj2.display();

    }
}