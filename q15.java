import java.util.*;
public class q15{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    float sum=0;
    Queue<Float> q= new LinkedList<>();
    Queue<Float> q1= new LinkedList<>();
    System.out.println("Enter the amount of rainfall(in cms) recorded at a paritular place for 12 months:");

    for(int i=0;i<12;i++)
    {
    System.out.println("Amount of Rainfall for Month "+(i+1)+": ");
    float a=sc.nextFloat();
    q.add(a);
    sum+=a;
    }
    System.out.println("Queue:"+q);
    float avg=sum/12;
    System.out.println("The average rainfall is="+avg);
    int count=0;
    for(int i=0;i<12;i++)
    {
    float b=q.remove();
    if(b>avg)
    {
    count+=1;
    }
    }
    System.out.println("Count of months in which rainfall is more than avg:"+count);
}
}
