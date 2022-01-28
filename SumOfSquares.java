// Write a Java Program to print the sum of the series 1^2+2^2+3^2 up to n terms.
import java.util.*;
public class SumOfSquares{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            count+= i*i;
        }
        System.out.println("Sum of squares of first n numbers is = "+count);
    }
}