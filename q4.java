import java.util.*;
interface Card{
    public abstract void amount(double money);
}
class Dollars implements Card{
    public void amount(double money){
        System.out.println("Dollars = "+(money*0.014)+"");
    }
}
class Pounds implements Card{
    public void amount(double money){
        System.out.println("Pounds =  "+(money*(0.0097))+"");
    }
}

public class q4{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in Rupees:  ");
        double money = sc.nextDouble();
        System.out.println("Choose to convert, 1. USD      2. Pounds : ");
        int choice = sc.nextInt();
        if(choice==1){
            Dollars m = new Dollars();
            m.amount(money);
        }else if(choice==2){
            Pounds m = new Pounds();
            m.amount(money);
        }else{
            System.out.println("Invalid Input!");
        }
    }
}