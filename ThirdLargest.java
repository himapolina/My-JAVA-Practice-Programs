//Write a Java program to print the third largest number in an array
import java.util.*;
class ThirdLargest{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in array (n): ");
        int n=sc.nextInt();
        System.out.println("Enter elements of the array: ");
        int[] arr = new int[n]; 
        int temp;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The third largest number in the array is: "+ arr[n-3]);
    }
}