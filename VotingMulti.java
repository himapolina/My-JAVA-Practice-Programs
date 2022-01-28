import java.util.Random;
class Vote
{
    public static int count1,count2,count3;
    public static int arr[]=new int[240];
    public void random()
    {
        Random r=new Random();
	
	for (int i=0;i<240;i++)
	{
	    

	int  a=r.nextInt(3);
	arr[i]=a+1;

	}
    }
    
    
}
public class VotingMulti
{
	public static void main(String[] arg) throws InterruptedException{
	    
	    Vote num=new Vote();
	    num.random();
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        thread3 t3=new thread3();
        thread4 t4 =new thread4();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
    System.out.println("OPS vote count = "+Vote.count1);
    System.out.println("EPS vote count = "+ Vote.count2);
    System.out.println("Stalin vote count = " +Vote.count3);
    if(Vote.count1>= Vote.count2 && Vote.count1>=Vote.count3)
    {
        if (Vote.count1==Vote.count2 )
    {
        System .out.println("OPS and EPS have same number of Votes!");
    }
        else if(Vote.count1==Vote.count3)
                {
                    System .out.println("OPS and Stalin have same number of Votes!");
                }
        else 
        {
            
        
        System.out.println("OPS won the elections!");
        }
    }
    else if(Vote.count2>=Vote.count1 && Vote.count2>=Vote.count3)
    {
        if(Vote.count2==Vote.count1  )
        {
            System.out.println("EPS and Stalin have same number of Votes!");
        }
        else if(Vote.count2==Vote.count3)
        {
            System.out.println("OPS and EPS have same number of Votes!");
        }
        else
            
            System.out.println("EPS won the elections");
    }
    else if(Vote.count3>=Vote.count1 && Vote.count3>=Vote.count2)
    {
        if(Vote.count3==Vote.count2)
        {
            System.out.println("OPS and EPS have same number of Votes!");
    }
        else if (Vote.count3==Vote.count1)
        {
            System.out.println("OPS and Stalin have same number of Votes!");
        }
        else
            
        System.out.println("Stalin won the elections!");
    }

    }
}

class thread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<60;i++)
        {
            if(Vote.arr[i]==1)
            {
                Vote.count1=Vote.count1+1;
                
            }
            else if(Vote.arr[i]==2)
            {
                Vote.count2=Vote.count2+1;
            }
            else{
                Vote.count3=Vote.count3+1;
            }
        }
        
    }
}
class thread2 extends Thread
{
    public void run()
    {
        for(int i=60;i<120;i++)
        {
            if(Vote.arr[i]==1)
            {
                Vote.count1=Vote.count1+1;
                
            }
            else if(Vote.arr[i]==2)
            {
                Vote.count2=Vote.count2+1;
            }
            else{
                Vote.count3=Vote.count3+1;
            }
        }
    }
}

class thread3 extends Thread
{
    public void run()
    {
        
        for(int i=120;i<180;i++)
        {
            if(Vote.arr[i]==1)
            {
                Vote.count1=Vote.count1+1;
                
            }
            else if(Vote.arr[i]==2)
            {
                Vote.count2=Vote.count2+1;
            }
            else{
                Vote.count3=Vote.count3+1;
            }
        }
    }
}

class thread4 extends Thread
{
    public void run()
    {
        
        for(int i=180;i<240;i++)
        {
            if(Vote.arr[i]==1)
            {
                Vote.count1=Vote.count1+1;
                
            }
            else if(Vote.arr[i]==2)
            {
                Vote.count2=Vote.count2+1;
            }
            else{
                Vote.count3=Vote.count3+1;
            }
        }
    }

}