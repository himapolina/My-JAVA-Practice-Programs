//Write a Java program to check whether given number is Armstrong or not.
import java.util.*;
public class ArmstrongOrNot{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();
        int N=n;
        double flag=0;
        while(n>0){
            flag+= Math.pow((n%10),3);
            n/=10;
        }
        if(N==flag) System.out.println("The number "+N+" is an Armstrong number.");
        else System.out.println("The number "+N+" is not an Armstrong number");
    }
}