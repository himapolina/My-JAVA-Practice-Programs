import java.util.Scanner;
class Sales{
    public static void main(String[] arg)
    {
        int[][] arr= new int[10][4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            for(int j=0;j<4;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        functionOfIncomes(arr);
    }
    static void functionOfIncomes(int[][] x){
        int[] sum= new int[10];
        int high=0, flag;
        for(int i=0;i<10;i++){
            int count=0;
            for(int j=0;j<4;j++){
                count+= x[i][j];
            }
            sum[i]=count;
            System.out.println("The sum of incomes of product "+(i+1)+" = "+sum[i]);
        }
        for(int i=0;i<10;i++){
            if(sum[i]>high){
                high=sum[i];
                flag=i+1;
        }
        System.out.println("The highest income is "+high+" given by product number "+flag);
    }
}