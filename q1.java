import java.util.*;

public class q1
{
    public static void main(String[] args)
    {
        int a, b, len, i;
        String st=new String("");
        a = Integer.parseInt(args[args.length -2]); 
        b = Integer.parseInt(args[args.length -1]); 
        String[] str_array = Arrays.copyOfRange(args, 0, args.length -2);
        len = str_array.length;
        for(i=0; i<len; i++){
            st=st+str_array[i]+" ";
        }
        StringBuilder reverseSt= new StringBuilder();
        reverseSt.append(st);
        reverseSt.reverse();
        len = st.length();
        try
        {
            if(a > b)
            {
                throw new IndexOutOfBoundsException("Start index Cannot be greater than End index!");
            }
            if(a < 0)
            {
                throw new IndexOutOfBoundsException("Start index cannot be negative!");
            }
            if(b < 0)
            {
                throw new IndexOutOfBoundsException("End index cannot be negative!");
            }
            if(a > len)
            {
                throw new IndexOutOfBoundsException("Start index out of bounds!");
            }
            if(b > len)
            {
                throw new IndexOutOfBoundsException("End index out of bounds!");
            }
            int start, end, limit;
            start = a;
            end = b + 1;
            limit = end;
            String output="";
            for(i=start; i<limit; i++){
                output = output+ reverseSt.charAt(i+1)+"";
            }
            System.out.println(output);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
