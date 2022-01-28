/*Write a Java program to test if the first and the last element of an array of
integers are same. The length of the array must be greater than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:
False*/
class FirstAndLast{
    public static void main(String[] arg){
        int[] arr1 = {50,-20,0,30,40,60,12};
        if(arr1[0]==arr1[arr1.length-1]) System.out.println("true");
        else System.out.println("false");
    }
    
}