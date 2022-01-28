import java.util.*;
class Table{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        System.out.println("Multiplication Table of "+n+" is: ");
        for(int i=1;i<=10;i++){
            System.out.println(i+" x "+n+" = "+(i*n));
        }
    }
}