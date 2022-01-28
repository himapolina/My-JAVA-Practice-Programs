/* Write a Java program to get the larger value between first and last element of
an array (length 3) of integers .
Sample Output:
Original Array: [20, 30, 40]
Larger value between first and last element: 40*/ 
class LargerValue{
    public static void main(String[] arg){
        int[] array = {20,30,40};
        System.out.printf("Larger Value between first and last element is: ");
        if(array[0]>array[2]) System.out.printf(""+array[0]);
        else System.out.printf(""+array[2]);
    }
}