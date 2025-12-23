//Write a java program to initialize and display jagged array element with sum of each row.
 import java.util.Scanner;
public class problem10 {
    public static void main(String[] args) {
        int r,c,i,s=0,j;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no of rows and column: ");
        r=obj.nextInt();
        c=obj.nextInt();
        int[][] arr=new int[r][c];
        for(i=0;i<r;i++){
                for(j=0;j<c;j++){
            System.out.print("Enter element of arr["+(i+1)+"]["+(j+1)+"]: ");
                    arr[i][j]=obj.nextInt();
        }
    }
    for(i=0;i<r;i++){
        s=0;
        for(j=0;j<c;j++){
            s=s+arr[i][j];
        }
        System.out.println("Sum of ["+(i+1)+"] row:  "+s);
    }
    }
}
