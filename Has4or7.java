/*Write a Java program to test that a given array of integers of length 2
contains a 4 or a 7.
Sample Output:
Original Array: [5, 7]
true*/
import java.util.Scanner;
class Has4or7{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two array elements: ");
        int[] array = new int[2];
        array[0]= sc.nextInt();
        array[1]= sc.nextInt();
        if(array[0]==4 ||array[0]==7 || array[1]==4||array[1]==7) System.out.println("true");
        else System.out.println("false");
    }    
}