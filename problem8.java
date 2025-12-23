/*Write a java program to print first n prime number
import java.util.Scanner;
public class problem8{
    public static void main(String args[]){
        int n,i,f=0,c=0,j;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=obj.nextInt();
        for(i=1;c!=n;i++){
            for(j=1;j<=i;j++){
                if(i%j==0){
                    f++;
                }
            }
            if(f==2){
                c++;
                System.out.print(i+"\t");
            }
            f=0;
        }
    }
}
    */
/*
 using for loop:
import java.util.Scanner;
public class problem8{
    public static void main(String args[]){
        int i,j,n,f=0,c=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=obj.nextInt();
        for(i=1;c!=n;i++){
            for(j=1;j<=i;j++){
                if(i%j==0){
                    f++;
                }
            }
            if(f==2){
                c++;
                System.out.print(i+"\t");
            }
            f=0;
        }
    }
}
    */
   //using while loop:
   import java.util.Scanner;

public class problem8 {
    public static void main(String args[]) {
        int n, i = 1, c = 0, f = 0, j;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = obj.nextInt();

        while (c != n) {
            j = 1;     // RESET j for each new i
            f = 0;     // RESET factor count for each i

            while (j <= i) {
                if (i % j == 0) {
                    f++;
                }
                j++;    // IMPORTANT — increment j
            }

            if (f == 2) {  // prime condition
                System.out.print(i + "\t");
                c++;
            }

            i++;  // go to next number
        }
    }
}
