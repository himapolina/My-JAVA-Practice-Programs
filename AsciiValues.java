//Write a Java Program to print ASCII Table.
public class AsciiValues{
    public static void main(String[] args) 
	{
		int i;
		for(i = 0; i <= 255; i++)
		{
			System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
		}
	}
}