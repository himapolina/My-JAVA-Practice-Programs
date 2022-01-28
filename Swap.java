//Write a Java program to swap two numbers using third variable.
import java.util.*;
public class Swap{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a=sc.nextInt();
        System.out.println("Enter number b: ");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("After Swapping, number a is: "+a+" and number b is: "+b);
    }
}