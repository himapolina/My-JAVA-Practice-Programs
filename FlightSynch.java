import java.util.*;
class Read extends Thread{
    public void run(){
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}
class Display extends Thread{
    public void run(){

    }
}
class FlightSynch {
    public static void main(String[] arg){
        Read t1 = new Read();
        Display t2 = new Display();
    }
}