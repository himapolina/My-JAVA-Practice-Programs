/*
Write a Java Program to Invert half pyramid using numbers
1 2 3 4 5
1 2 3 4 
1 2 3
1 2
1
*/
import java.util.*;
public class InvertedPatternNumbers{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.printf(j+"");
            }
            System.out.println();
        }
    }
}