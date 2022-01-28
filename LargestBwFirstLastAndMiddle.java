/* Write a Java program to find the largest element between first, last, and
middle values from an array of integers (odd length).*/
import java.util.Scanner;
class LargestBwFirstLastAndMiddle{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements in array, 'n'(must be odd): ");
        int n = sc.nextInt();
        int[] array= new int[n];
        System.out.println("Enter elements of array with space: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int a= array[0];
        int b=array[n-1];
        int c= array[((n-1)/2) +1];
        int largest;
        if(a>b) largest=a;
        else largest=b;
        if(c>largest) largest=c;
        System.out.println("Largest element between first, last, and middle values: "+largest);
    }
}