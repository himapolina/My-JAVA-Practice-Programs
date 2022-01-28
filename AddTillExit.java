//Write a Java Program to provide the option of adding two numbers to the user until the user wants to exit.
import java.util.*;
class AddTillExit{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter 1 to continue and 0 to exit");
            int input=sc.nextInt();
            if(input==1){
                System.out.println("Enter first number a: ");
            int a = sc.nextInt();
            System.out.println("Enter second number b: ");
            int b = sc.nextInt();
            System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
            }
            else if(input==0){
                System.out.println("Exiting...");
                break;
            }
            
        }
        

    }
}