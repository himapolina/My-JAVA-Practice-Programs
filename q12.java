import java.util.*;
class IceCream{
    double cost;
    public double icecream() {
        cost=45;
        return(cost);
    }
}

class Chocolate extends IceCream {
    public double icecream() {
        cost=50.5;
        return(cost);
    }
}

class Vanilla extends IceCream { 
    public double icecream() {
        cost=35.5;
        return(cost);
    } 
}
class Mango extends IceCream { 
    public double icecream() {
        cost=43.5;
        return(cost);
    } 
}
class Caramel extends IceCream { 
    public double icecream() {
        cost=41;
        return(cost);
    } 
}
class q12{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of ice-creams to order: ");
        int n= sc.nextInt();
        double total=0;
        System.out.println("Ice Cream Choices: (1) Chocolate    (2) Vanilla    (3) Mango    (4) Caramel \n");
        for(int i=0;i<n;i++){
            System.out.println("Enter ice cream choice guest "+(i+1)+": ");
            int choice=sc.nextInt();
            if(choice==1){
                Chocolate ob = new Chocolate();
                total+= ob.icecream();
            }else if(choice==2){
                Vanilla ob = new Vanilla();
                total+= ob.icecream();
            }else if(choice==3){
                Mango ob = new Mango();
                total+= ob.icecream();
            }else if(choice==4){
                Caramel ob= new Caramel();
                total+= ob.icecream();
            }
        
        }
        System.out.println("Total Cost of the Order is = Rs."+total+"");
    }
}