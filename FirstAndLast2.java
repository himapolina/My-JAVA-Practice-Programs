/*Write a Java program to test if the first and the last element of two array of
integers are same. The length of the array must be greater than or equal to
Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
array2 = 45, 20, 10, 20, 30, 50, 11
Sample Output:
false
*/
class FirstAndLast2{
    public static void main(String[] arg){
        int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2= {45, 20, 10, 20, 30, 50, 11};
        if(array1[0]==array2[0] || array1[array1.length-1]==array2[array2.length-1]) System.out.println("true");
        else System.out.println("false");
    }
}