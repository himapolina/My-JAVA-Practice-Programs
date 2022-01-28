/* Write a Java program to swap the first and last elements of an array (length
must be at least 1) and create a new array.
Sample Output:
Original Array: [20, 30, 40]
New array after swaping the first and last elements: [40, 30,
20] */
class SwapFirstAndLast{
    public static void main(String[] arg){
        int[] arr = {20,30,40};
        int flag = arr[0];
        arr[0]= arr[2];
        arr[2]=flag;
        System.out.println("New Array: ["+arr[0]+", "+arr[1]+", "+arr[2]+"]");
    }
}