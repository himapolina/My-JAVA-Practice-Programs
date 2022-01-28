//Write a Java program to Calculate and Display the sum of 4 digits number.
import java.util.*;

public class SumOfDigits{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a four digit number n: ");
        int N=sc.nextInt();
        int n=N; 
        int flag=0;
        for(int i=0;i<4;i++){
            flag+= n%10;
            n/=10;
        }
        System.out.println("Sum of Digits of the number "+N+" is "+flag);
    }
}