import java.util.*;
class InvalidValueException extends Exception
{
    InvalidValueException(String s)
    {
        super(s);
    }
}

public class q_4
{
    static void validate(int age, String gender) throws InvalidValueException
    {
        if(age>65 && gender.equals("male"))
        System.out.println("25% concession on rate is applicable!");
        else if(age>60 && gender.equals("female"))
        System.out.println("10% concession on rate is applicable!");
        else
        throw new InvalidValueException("Values not matching with norms of the concessions!");
    }
    static void validate(int age1, int age2, String gender1, String gender2) throws InvalidValueException
    {
        if((age1>18 && gender1.equals("female")) && (age2>21 && gender2.equals("male")))
        System.out.println("5% concession on rate is applicable!");
        else
        throw new InvalidValueException("Values not matching with norms of the concessions!");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Are you solo?");
        String ans=sc.next();
        if(ans.equals("yes")){
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println("Enter gender of passenger:");
        String gender=sc.next();
        try{
            validate(age,gender);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
    }
    if(ans.equals("no")){
        System.out.println("Enter age:");
        int age1=sc.nextInt();
        System.out.println("Enter gender of passenger:");
        String gender1=sc.next();
        System.out.println("Enter age:");
        int age2=sc.nextInt();
        System.out.println("Enter gender of passenger:");
        String gender2=sc.next();
        try{
            validate(age1,age2,gender1,gender2);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured: "+e);
        }
    }
}
}