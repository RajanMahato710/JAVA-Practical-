/*Write a program that takes the user to provide a single character from the 
alphabet. Print vowel or consonant, depending on the user input. If the 
user input is not a letter between a and z or A and Z), or is a string of 
length>1, print an error message.  
*/
import java.util.Scanner;
public class problem1{
public static void main(String args[]){
        String st;
        int v=0,c=0,d=0;

        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a string: ");
        st=obj.nextLine();
        if(st.length()!=1){
            System.out.println("Error enter a character");
        }else{
            if(st.length()==1){
                char ch=st.charAt(0);
                if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'|| ch=='A'|| ch=='E' ||ch=='I' || ch=='O'||ch=='U'){
                    v++;
                }else if(ch>='0' && ch<='9'){
                    d++;
                }
                else{
                    c++;
                }
            }
            System.out.println("Total vowers are: "+v+"\n"+"Total consonent are: "+c+"\n"+"Total digits are: "+d);
        }
}
}