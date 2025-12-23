//Write a program in java to display the multiplication table of a given integer.
import java.util.Scanner; 
public class problem2 {
    public static void maint(String args[]){
            int n,i;
            Scanner obj= new Scanner(System.in);
            System.out.println("Enter a number: ");
            n=obj.nextInt();
            for(i=1;i<=10;i++){
                System.out.println(n+"*"+i+"="+n*i);
            }  
    }
}
