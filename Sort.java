/* Write a Java program to sort an array of positive integers of an given array, 
in the sorted array the value of the first element should be maximum, second value 
should be minimum value, third should be second maximum, fourth second be second minimum and so on. */
import java.util.*;
class Sort{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements (n): ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array of numbers is: ");
        for(int i=0;i<n;i++){
            System.out.printf(arr[i]+" ");
        }
    }
}