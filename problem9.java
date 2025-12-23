//Write a program in java that displays the sum of odd integers of an array.
import java.util.Scanner;
public class problem9 {
    public static void main(String args[]){
        int i,n,s=0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no of element: ");
        n=obj.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++){
            System.out.print("Enter element of arr["+(i+1)+"]:");
            arr[i]=obj.nextInt();
            if(arr[i]%2!=0){
                s=s+arr[i];
            }
        }
        System.out.println("Sum of odd number is :"+s);
    }
}
