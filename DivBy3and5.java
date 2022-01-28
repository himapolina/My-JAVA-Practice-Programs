//Write a Java Program to read the number and check whether it is divisible by 3 and 5.
import java.util.*;
public class DivBy3and5{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check divisibility by 3 and 5: ");
        int n=sc.nextInt();
        if(n%15==0)System.out.println("The number "+n+" is divisible by 3 and 5.");
        else if(n%15!=0) System.out.println("The number "+n+" is not divisible by 3 and 5.");
    }
}