/* Write a Java Program to print half pyramid using *
*
* *
* * *
* * * *
* * * * *
*/
import java.util.*;
public class Pattern2{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}