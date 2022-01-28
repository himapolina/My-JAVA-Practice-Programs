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

public class Calculator
{
    static long power(int n, int p) throws NegativeValueException,ZeroValueException
    {
        if(n<0 || p<0)
        throw new NegativeValueException("n and p should not be negative!");
        else if(n==0 && p==0)
        throw new ZeroValueException("n and p should not be zero!");
        else
        {
            long t=(long)n;
            for(int i=1;i<p;i++)
        t*=n;
        return t;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of n and p:");
        int n=sc.nextInt();
        int p=sc.nextInt();
        try{
            long result= power(n,p);
            System.out.println("The result is: "+result);
        }
        catch(NegativeValueException exp)
        {
            System.out.println("Exception occured: "+exp);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }  
    }   
}