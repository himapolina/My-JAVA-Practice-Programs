/*Write a Java program to perform operation 
(Addition, Subtraction, Multiplication, Division) without using third variable. */

import java.util.*;
class Arithmetic2{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number a: ");
        int a =sc.nextInt();
        System.out.println("Enter second number b: ");
        int b =sc.nextInt();
        System.out.println("Sum of a and b is "+ add(a,b));
        System.out.println("Difference of a and b is "+ subtract(a,b));
        System.out.println("Product of a and b is "+ multiply(a,b));
        System.out.println("Division of a and b is "+ div(a,b));
    }
        static int add(int a, int b)
        {
            return a+=b;
        }
        static int subtract(int a, int b)
        {
            return a-=b;
        }
        static int multiply(int a, int b){
            return a*=b;
        }
        static float div(int a, int b)
        {
            return a/=b;
        }
    
}