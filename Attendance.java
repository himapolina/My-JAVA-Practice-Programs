//attendance using multidimensional arrays
import java.util.Scanner;
class Attendance{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter attendance as 1's and 0's");
        System.out.println("Enter attendance for first 12 days: ");
        int[][] attend= new int[3][];
        attend[0]=new int[12];
        attend[1]=new int[10];
        attend[2]=new int[8];
        for(int i=0;i<12;i++){
            attend[0][i]=sc.nextInt();
        }
        System.out.println("Enter attendance for next 10 days: ");
        for(int i=0;i<10;i++){
            attend[1][i]=sc.nextInt();
        }
        System.out.println("Enter attendance for next 8 days: ");
        for(int i=0;i<8;i++){
            attend[2][i]=sc.nextInt();
        }
        int count=0;
        for(int[] i:attend){
            for(int j:i){
                if(i[j]==1) count+=1;
            }
        }
        System.out.println("Total Attendance % : "+(count/0.3));
    }
}