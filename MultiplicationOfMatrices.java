//Write a Java program to multiply two matrix.
class MultiplicationOfMatrices{
    public static void main(String[] arg){
        int[][] mat1 = {{39,72,59}, {24,76,12},{83,02,40}};
        int[][] mat2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = new int[3][3];
        System.out.println("Resultant matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j]=0;      
                for(int k=0;k<3;k++){      
                    result[i][j]+=mat1[i][k]*mat2[k][j];      
                }
                System.out.print(result[i][j]+" "); 
            }  
            System.out.println();
        }
    }
}