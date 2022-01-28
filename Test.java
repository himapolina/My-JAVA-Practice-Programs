interface Reserve{
    int available=45;
    int totalseats=45;
    int waiting=0; 
    double fare=2500.5;
    public static void doReservation(){
    }
}
class Reservation implements Reserve{
    String name;
    int ticketID, avl= available, wait= waiting;
    public static void doReservation(){
        if(avl>0){
            avl-=1;
            System.out.println("Reservation done");
        }
        else if(avl==0 && wait<10){
            wait+=1;
            System.out.println("Addded to waiting list");
        }
        else{
            System.out.println("Reservation Canceled.");
        }
    }

}
class Test{
    public static void main(String[] arg){
        Reserve obj= new Reservation();
    }
}