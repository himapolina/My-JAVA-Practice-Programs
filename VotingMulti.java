import java.util.*;

public class VotingMulti implements Runnable{
    public static void main(String[] arg){
        Random random = new Random();
        int rand = 0, i=0;
        int arr[]=new int[240];
        for(i=0;i<240;i++){
            while (true){
                rand = random.nextInt(4);
                if(rand !=0) break;
            }
        arr[i]=rand;
        }
        Thread OPS = new Thread("OPS");
        Thread EPS = new Thread("EPS");
        Thread Stalin = new Thread("Stalin");
        OPS.start();

        EPS.start();
        Stalin.start();
        String res = run(arr);
        System.out.println(res);
    }
    @Override
    public static String run(int arr[]){
        int c1=0;
        int c2=0;
        int c3=0;
        int i=0;
        for(i=0;i<240;i++){
            if(arr[i]==1){
                c1+=1;
            }
            else if(arr[i]==2){
                c2+=1;
            }
            else if(arr[i]==3){
                c3+=1;
            }
        }
        String result = ""+c1+" "+c2+" "+c3+"";
        return result;
    }

}