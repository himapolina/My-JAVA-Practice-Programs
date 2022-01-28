/*Write a Java Program to print this pattern for n lines 
1
12
123
1234
1234
123
12
1 */
import java.util.*;
public class Pattern1{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();
        for(int i=1;i<= n/2;i++){
            for(int j=1; j<=i;j++){
                System.out.printf(j+"");
            }
            System.out.println();
        }
        if(n%2 !=0){
            for(int k=1;k<= (n/2) +1; k++){
                System.out.printf(k+"");
            }
            System.out.println();
        }
        for(int i=(n/2);i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.printf(j+"");
            }
            System.out.println();
        }
    }
}
