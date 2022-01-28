import java.util.*;
public class q2
{
    public static void main(String[] args)
    {
        int cat, quiz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Quiz Marks: ");
        quiz = sc.nextInt();
        try
        {
            if(quiz < 0 || quiz > 10)
            {
                throw new IndexOutOfBoundsException("Quiz Marks should be in range 0-10");
            }
            else
            {
                System.out.println("Enter CAT Marks: ");
                cat = sc.nextInt();
                try
                {
                    if(cat < 0 || cat > 100)
                    {
                        throw new IndexOutOfBoundsException("CAT Marks should be in range 0-100");
                    }
                    else
                    {
                        System.out.println("Quiz Marks: " + quiz);
                        System.out.println("CAT Marks: " + cat);
                    }
                }
                catch(IndexOutOfBoundsException e)
                {
                    System.out.println(e);
                }
            }
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}


