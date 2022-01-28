//Write a Java program to Obtain the sum of first and last digit of four digit number.
import java.util.*;
public class SumOfDigits2{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a four digit number n: ");
        int N=sc.nextInt();
        int flag= N%10 + (N/1000)%10;
        System.out.println("The Sum of First and Last digits of the number "+N+" is "+flag);
    }
}