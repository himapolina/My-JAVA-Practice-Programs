import java.util.*;
class Tax{
    double salary;
    public double taxrRate(double salary){
        return(0);
    }
}
class Cat1 extends Tax{
    public double taxrRate(double salary){
        return(0.1*(salary-200000));
    }
}
class Cat2 extends Tax{
    public double taxrRate(double salary){
        return(0.2*(salary-300000)+(10000));
    }
}
class Cat3 extends Tax{
    public double taxrRate(double salary){
        return(0.3*(salary-500000)+50000);
    }
}
class Cat4 extends Tax{
    public double taxrRate(double salary){
        return(0.4*(salary-1000000)+200000);
    }
}
class q3{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary Amount: ");
        double income = sc.nextDouble();
        if(income!=0){
        if(income<= 200000){
            Tax t = new Tax();
            calc(t, income);
        }else if(income<=300000){
            Cat1 t = new Cat1();
            calc(t, income);
        }else if(income<= 500000){
            Cat2 t = new Cat2();
            calc(t, income);
        }else if(income<=1000000){
            Cat3 t = new Cat3();
            calc(t, income);
        }else{
            Cat4 t = new Cat4();
            calc(t, income);
        }
        
        }
    }
    public static void calc(Tax t, double income){
        t.salary=income;
        double p = t.taxrRate(income);
        System.out.println("Income Tax Amount = Rs. "+p+" /-");
    }
}