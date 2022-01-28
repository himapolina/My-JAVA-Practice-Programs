class FireAlarmSystem extends Exception {
    double roomTemp;
    boolean smoke;

    FireAlarmSystem(double roomTemp, boolean smoke){
        this.roomTemp=roomTemp;
        this.smoke=smoke;
    }



    public static void main(String[] args) {

            FireAlarmSystem obj = new FireAlarmSystem(40.25, false);

            if ((obj.roomTemp > 40) && (obj.smoke== true)){
                try{
                throw new Exception("Fire Fire pout Fire!");

            }

        catch(Exception e){
            System.out.println(e.getMessage());
            }

        }

        if(obj.roomTemp>40 && obj.smoke==false){
            try{
                throw new Exception("Hot turn on ac!");
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }

    }



}