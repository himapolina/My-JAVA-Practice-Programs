/* Write a Java Program to Invert half pyramid using *
* * * * *
* * * *
* * * 
* *
*
*/
import java.util.*;
public class InvertedPattern2{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}