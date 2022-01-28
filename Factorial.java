//Write a Java program to print Factorial of Number
import java.util.*;
public class Factorial{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();
        int x= Fact(n);
        System.out.println("Factorial of number "+n+" is "+x);
        
    }
    static int Fact(int a){
        if(a==1) return 1;
        if(a==0) return 1;
        return (a*Fact(a-1));
    }
}