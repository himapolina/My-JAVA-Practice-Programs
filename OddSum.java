import java.util.*;
class OddSum{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int n= sc.nextInt();
        int reverse=0;
        int num=n;
        while(num>0){
            int x=num%10;
            reverse= reverse*10 +x;
            num/=10;
        }
        if((n+reverse)%2 !=0){
            System.out.println("Odd Sum");
        }
        else System.out.println("No Odd Sum");
    }
}