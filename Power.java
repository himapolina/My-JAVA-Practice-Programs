//Write a Java program to calculate the power of Number.
import java.util.*;
public class Power{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base number: ");
        int base=sc.nextInt();
        System.out.println("Enter exponent number: ");
        int exponent=sc.nextInt();
        int B=base;
        for(int i=0;i<exponent;i++){
            base*=B;
        }
        System.out.println(B+" to the power of "+exponent+" is = "+base);
    }
}