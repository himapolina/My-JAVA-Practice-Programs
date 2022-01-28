interface A{
    public void sum();
}
interface B{
    public void factorial();
}
class Numbers implements A,B{
    int n=5, total=0, fact=1;
    public void sum(){
        for(int i=1;i<=n;i++){
            total+=i;
        }
        System.out.println("Sum of first "+n+" numbers is "+total);
    }
    public void factorial(){
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
class DemoNumbers{
    public static void main(String[] arg){
        Numbers num = new Numbers();
        num.sum();
        num.factorial();
    }
}