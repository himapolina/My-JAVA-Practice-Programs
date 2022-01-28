import java.util.Scanner;
class ValidityOfString{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int[] freq= new int[str.length()];
        for(int i=0;i<str.length();i++){
            freq[i]= numberOfOccurences(str, str.charAt(i));
        }
        boolean flag= true;
        int i=1;
        while(flag && i<str.length()){
            if(freq[i]==freq[0]) flag=true;
            else flag= false;
            i++;
        }
        if(flag==false){
            System.out.println("NO");
        }
        else System.out.println("YES");
    }
    static int numberOfOccurences(String x, char a){
        int count=0;
        for(int i=0; i<x.length();i++){
            if(x.charAt(i)==a) count+=1;
        }
        return count;
    }
}