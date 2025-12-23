//Write a program called Fibonacci to print the first 20 fibonacci numbers. Also compute their average. 
import java.util.Scanner;
public class problem5 {
    public static void main(String args[]){
        int i,a=0,b=1,c;
        double s=0,avg;
        for(i=0;i<20;i++){
            System.out.print(a+"\t");
            s=s+a;
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
        avg=s/10;
        System.out.println("Average of 20 fibonacci sereis is: "+avg);
    }
}
