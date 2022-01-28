import java.util.*;
class NegativeValueException extends Exception
{
    NegativeValueException(String s)
    {
        super(s);
    }
}

class ZeroValueException extends Exception
{
    ZeroValueException(String s)
    {
        super(s);
    }
}
public class MyCalculator
{
    static long power(int n, int p) throws NegativeValueException, ZeroValueException
    {   
        if(n<0 || p<0){
        throw new NegativeValueException("n or p should not be negative");
        }
        else if(n==0 && p==0){
        throw new ZeroValueException("n and p should not be zero");   
        }
        else{
            long t=(long)n;
            for(int i=1;i<p;i++)
            t*=n;
            return t;
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n and p:");
        int n=sc.nextInt();
        int p=sc.nextInt();
        try{
            long result= power(n,p);
            System.out.println("Result: "+result);
        }
        catch(Exception e)
        {
            System.out.println("Exception: "+e);
        }  
    }   
}
