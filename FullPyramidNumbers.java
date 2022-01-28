/* Write a Java Program to print pyramid using numbers

        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/
import java.util.*;
class FullPyramidNumbers{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        for(int i=0; i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.printf("  ");
            }
            for(int j=i;j<(2*i);j++){
                System.out.printf(j+" ");
            }
            for(int j=(2*i)-2 ;j>=i; j--){
                System.out.printf(j+" ");
            }
            System.out.println();
        }
    }
}
