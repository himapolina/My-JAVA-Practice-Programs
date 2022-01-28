/* Write a Java Program to Invert full pyramid using *

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/
import java.util.*;
class InvertedFullPyramid{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        for(int i=n; i>=1;i--){
            for(int j=0;j<(n-i);j++){
                System.out.printf(" ");
            }
            for(int k=0;k<(2*i -1);k++){
                System.out.printf("*");
            }
            System.out.println();

        }
    }
}