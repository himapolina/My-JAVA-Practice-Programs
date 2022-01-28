//Write a Java program to perform basic arithmetic operations of two numbers. 
import java.util.*;
class Arithmetic{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number a: ");
        int a = sc.nextInt();
        System.out.println("Enter second number b: ");
        int b = sc.nextInt();
        int sum= a+b;
        int diff= a-b;
        int prod= a*b;
        float div= a/b;
        System.out.println("Addition of the two numbers yields: "+a+" + "+b+" = "+sum);
        System.out.println("Subtraction of the two numbers yields: "+a+" - "+b+" = "+diff);
        System.out.println("Multiplication of the two numbers yeilds: "+a+" * "+b+" = "+prod);
        System.out.println("Division of the two numbers yields: "+a+" / "+b+" = "+div);

    }
}