import java.util.*;
class Travel{
    public static void main(String[] arg) throws MyException{
        Scanner sc = new Scanner(System.in);
        int discount=0;
        System.out.println("Couple? Enter yes or no: ");
        String coup = sc.nextLine();
        if(coup.equals("yes")){
        System.out.println("Enter age of female person: ");
        int age_f=sc.nextInt();
        System.out.println("Enter age of male person: ");
        int age_m=sc.nextInt();
        try{
            if(age_f<18 || age_m<21){
                discount=-1;
                throw new MyException("Age is invalid according to company norms.");
            }
            else{
                discount=10;
            }
        }
        catch(MyException e){
            System.out.println(e);
        }
        }
        else if(coup.equals("no")){
            System.out.println("Gender? Enter f or m: ");
            String gender = sc.nextLine();
            System.out.println("Enter age: ");
            int age= sc.nextInt();
            if(gender.equals("f")){
                try{
                    if(age<18){
                        discount=-1;
                        throw new MyException("Age is invalid according to company norms.");
                    }
                    else if(age>=60){
                        discount=20;
                    }
                }
                catch(MyException e){
                    System.out.println(e);
                }
            }
            if(gender.equals("m")){
                try{
                    if(age<21){
                        discount=-1;
                        throw new MyException("Age is invalid according to company norms.");
                    }
                    else if(age>=65){
                        discount=15;
                    }
                }
                catch(MyException e){
                    System.out.println(e);
                }
            }
        }
        if(discount>0){
            System.out.println("Discount = "+discount+"%");
        }
        else if(discount==0){
            System.out.println("Discount is not applicable.");
        }
        
    }
}
class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}