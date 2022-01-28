//Write a Java program to perform Multiplication of two numbers without using  * operator.
import java.util.*;
class Multiply2{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number a ");
        int a = sc.nextInt();
        System.out.println("Enter second number b ");
        int b =sc.nextInt();
        int prod=0;
        for (int i=0;i<b;i++){
            prod+=a;
        }
        System.out.println("Product of a and b is " +prod);
    }
}