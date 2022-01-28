import java.util.*;
public class Batches{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int batch[][]=new int[4][];
       for(int i=0;i<4;i++)
       {
           System.out.println("Enter number of slow learners who have scored less than 25 in batch "+(i+1)+":");
           int slow=sc.nextInt();
           int tutor=(int)Math.ceil((slow*1.0)/4);
           batch[i]=new int[tutor];
           for(int j=0;j<tutor;j++)
           {
               if(slow>=4)
               batch[i][j]=4;
               else
               batch[i][j]=slow;
               slow-=4;
            }
        }
        for(int[] i: batch)
        {
            for(int j: i)
            System.out.print(j+" ");
            System.out.println();
        }
    }
}