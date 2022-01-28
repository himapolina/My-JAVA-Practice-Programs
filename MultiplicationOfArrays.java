/* Write a Java program to multiply corresponding elements of two arrays of
integers.
Sample Output:
Array1: [1, 3, -5, 4]
Array2: [1, 4, -5, -2]
Result: 1 12 25 -8
*/
import java.util.Scanner;
class MultiplicationOfArrays{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements in arrays, 'n': ");
        int n= sc.nextInt();
        System.out.println("Enter elements of array 1: ");
        int[] array1= new int[n];
        for(int i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of array 2: ");
        int[] array2= new int[n];
        for(int i=0;i<n;i++){
            array2[i]=sc.nextInt();
        }
        int[] result =new int[n];
        System.out.printf("Result: ");
        for(int i=0;i<n;i++){
            result[i]= array1[i]*array2[i];
            System.out.printf(result[i]+" ");
        }
    }
}