// Write a Java program to Calculate sum of diagonal element.
class SumOfDiagonal{
    public static void main(String[] arg){
        int[][] mat = {{39,72,59}, {24,76,12},{83,02,40}};
        int result=0;
        for(int i=0;i<3;i++){
            result+= mat[i][i];
        }
        System.out.println("Sum of diagonal elements: "+result);
    }
}