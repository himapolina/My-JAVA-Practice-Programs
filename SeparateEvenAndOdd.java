/* Write a Java program to separate even and odd numbers of an given array of integers. 
Put all even numbers first, and then odd numbers. */
import java.util.*;
class SeparateEvenAndOdd{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        System.out.println("Enter the numbers: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();}
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) System.out.printf(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0) System.out.printf(arr[i]+" ");
        }
        }   
}