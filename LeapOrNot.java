import java.util.*;
class LeapOrNot{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        if((year%100 !=0 && year%4==0) || (year%100==0 && year%400==0)){
            System.out.println("The year "+year+" is a leap year.");
        }
        else System.out.println("The year "+year+" is not a leap year.");
    }
}