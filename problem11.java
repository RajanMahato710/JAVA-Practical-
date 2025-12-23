/*Create a class named ‘Student ‘ with String variable ‘name’ and integer 
variable ‘rollno’. Assign the value of rollno as ‘2 and that of name as 
“John” by creating an object of the class Student.  

class Student{
    String name;
    int rollno;
}
public class problem11{
    public static void main(String args[]){

        Student s=new Student();
        s.name="John";
        s.rollno=2;
        System.out.println("Name is "+s.name+"\n"+"Rollno is "+s.rollno);
    }
}
*/
/*Create a class named ‘Student ‘ with String variable ‘name’ and integer 
variable ‘rollno’. Assign the value of rollno as ‘2 and that of name as 
“John” by creating an object of the class Student.  
*/
class Student{
    String name="john";
    int rollno=2;
}
public class problem11{
    public static void main(String args[]){
        Student s=new Student();
        System.out.println("Your name is : "+s.name);
        System.out.println("Your rollno is : "+s.rollno);
    }
}