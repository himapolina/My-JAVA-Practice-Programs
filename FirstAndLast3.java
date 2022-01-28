/*Write a Java program to create a new array of length 2 from two arrays of
integers with three elements and the new array will contain the first and last
elements from the two arrays
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:
Array1: [50, -20, 0]
Array2: [5, -50, 10]
New Array: [50, 10]*/
import java.util.Scanner;
class FirstAndLast3{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        System.out.println("Enter elements of Array1");
        for(int i=0;i<3;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of Array2");
        for(int i=0;i<3;i++){
            array2[i]=sc.nextInt();
        }
        int[] newArray = {array1[0],array2[2]};
        System.out.println("New Array: ["+newArray[0]+", "+newArray[1]+"]");
    }
}