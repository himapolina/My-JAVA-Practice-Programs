class Fibo{
    private int n=1,a=-1,b=1,c;
    synchronized void disp(){
        for(int i=1;i<=50;i++){
            c=a+b;
            System.out.println(n+" Fibonacci Number : "+c);
            a=b;
            b=c;
            if(n==30)
                try{
                    System.out.println("Fibonacci Number Generation Halted.");
                    Thread.sleep(5000);
                }catch(InterruptedException e){
                    System.out.println("Caught interrupted exception!");
                }
            n++;
        }
    }
}
class Natural{
    int n=1;
    boolean isNatural=true;
    synchronized void disp(){
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Caught interrupted exception!");
        }
        for(int i=1;i<=15;i++){
            System.out.println(n+" Natural number: "+i);
            n++;
        }
        /*for(int i=2;;i++){
            for(int j=2;j<=i/2;j++){
                if((i%j)==0){
                    isNatural = false;
                    break;
                }
            }
            if(isNatural){
                System.out.println(n+" Natural : "+i);
                n++;
                if(n==15){
                    break;
                }
            }
        }*/
    }
}
class NaturalThread implements Runnable{
    Thread t;
    Natural n1;
    NaturalThread(){
        t=new Thread(this);
        t.setPriority(Thread.NORM_PRIORITY);
        t.start();
    }
    public void run(){
        n1=new Natural();
        n1.disp();
    }
}
class FiboThread implements Runnable{
    Thread t2;
    Fibo f;
    FiboThread(){
        t2=new Thread(this);
        t2.setPriority(9);
        t2.start();
    }
    public void run(){
        f=new Fibo();
        f.disp();
    }
}
class q3{
    public static void main(String args[]){
        FiboThread ft=new FiboThread();
        NaturalThread pt=new NaturalThread();
    }
}
