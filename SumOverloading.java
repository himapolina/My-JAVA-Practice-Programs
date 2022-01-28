/* Write a Java program to find the sum of the elements of a two dimensional array of integers
and floating point numbers with method overloading. */
class SumOverloading{
    public static void main(String[] arg){
        int[][] array1 = {{1,43,56},{92, 8,10}};
        float[][] array2 = {{0.128f, 182.9f, 091.23f},{12f,28f,328.32f}};
        System.out.println(sum(array1));
        System.out.println(sum(array2));
    }
    static int sum(int[][] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
            count+=array[i][j];}
        }
        return count;
    }
    static float sum(float[][] array){
        float count=0f;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
            count+= array[i][j];}
        }
        return count;
    }
}