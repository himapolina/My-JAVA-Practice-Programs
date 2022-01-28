/* Write a Java program to rotate an array (length 3) of integers in left direction.
Sample Output:
Original Array: [20, 30, 40]
Rotated Array: [30, 40, 20]*/
class RotateLeft{
    public static void main(String[] arg){
        int[] arr = {20,30,40};
        int[] newArray = new int[3];
        for(int i=0;i<3;i++){
            newArray[(i-1+3)%3]= arr[i];
        }
        System.out.println("Rotated Array: ["+newArray[0]+", "+newArray[1]+", "+newArray[2]+"]");
    }
}