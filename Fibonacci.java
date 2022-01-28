//Write a Java program to print Fibonacci Series upto n terms.
import java.util.*;
class Fibonacci{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();
        int x=0,y=1;
        System.out.printf(""+x);
        for(int i=0;i<n-1;i++){
            if(i%2==1){
                x+=y;
                System.out.printf(" "+x);
            }
            else{
                y+=x;
                System.out.printf(" "+y);
            }
        }
    }
}