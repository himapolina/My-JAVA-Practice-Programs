/*Write a Java Program to display Subject Name based on room number. 
If the user enters 604 then display Java Programming, 
If the user enters 605 then display Python programming for any other input display Invalid input to the user*/
import java.util.*;
public class Room{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter room number: ");
        int room= sc.nextInt();
        if(room==604) System.out.println("Java Programming");
        else if(room==605) System.out.println("Python programming");
        else System.out.println("Invalid input");
        
    }
}