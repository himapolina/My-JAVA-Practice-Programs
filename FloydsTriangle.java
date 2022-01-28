/* Write a Java Program to Print Floyd's Triangle.
1
2 3
4 5 6
7 8 9 10
*/
import java.util.*;
class FloydsTriangle{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1;j<n;j){
                for(int k=0;k<i;k++){
                    System.out.printf((k+j)+" ");
                }
            }
            System.out.println();
        }
    }
}