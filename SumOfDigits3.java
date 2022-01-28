//Write a Java program to find sum of all digits between 10 and 50, which are divisible by 3.

public class SumOfDigits3{
    public static void main(String[] arg){
        System.out.println("This program prints the sum of all numbers between 10 and 50 which are divisible by 3");
        int count=0;
        
        for(int i=10;i<=50;i++){
            if(i%3==0){
                count+=i;
                System.out.printf(i+" + ");
            }
        }
        System.out.println(" = "+count);
        
    }
}