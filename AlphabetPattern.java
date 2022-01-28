/* Write a Java Program to print half pyramid using alphabets
A
B B
C C C
D D D D
E E E E E 
*/
import java.util.*;
import java.lang.*;
class AlphabetPattern{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        String alpha="ABCDEFGHIJKLMNOPQRSTUVXYZ";
        for(int i=1;i<=n;i++){
            char x= alpha.charAt(i-1);
            for(int j=1;j<=i;j++){
                System.out.printf(x+"");
            }
            System.out.println();
        }
        
    }
}