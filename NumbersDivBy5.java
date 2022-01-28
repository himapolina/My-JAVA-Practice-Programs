//Write a Java program to find out all odd numbers divisible by 5 from the range of integers 200 to 800.
public class NumbersDivBy5{
    public static void main(String[] arg){
        for(int i=200;i<=800;i++){
            if(i%5==0 && i%2!=0){
                System.out.printf(i+" ");
            }
        }
        
    }
}