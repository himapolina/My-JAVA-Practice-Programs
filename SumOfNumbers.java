/*Write a Java Program to print the sum of first n numbers. 
If n is 3 then print the sum of 1+2+3 to the user. Get n from the user */
import java.util.*;
public class SumOfNumbers{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            count+=i;
        }
        System.out.println("Sum of first n numbers is = "+count);
    }
}