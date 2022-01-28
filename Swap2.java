//Write a Java program to swap two numbers without using third variable.
import java.util.*;
public class Swap2{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a=sc.nextInt();
        System.out.println("Enter number b: ");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a= (a-b);
        System.out.println("After Swapping, the number a is: "+a+" and number b is: "+b);
        
    }
}