/* Write a Java Program to print full pyramid using *
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/
import java.util.*;
class FullPyramid{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        for(int i=0; i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.printf(" ");
            }
            for(int k=0;k<(2*i +1);k++){
                System.out.printf("*");
            }
            System.out.println();

        }
    }
}