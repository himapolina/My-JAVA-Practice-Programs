package pack1;
public class Words{
    public static int countNumWords(String s){
        String arr[] = s.split(" ");
        return(arr.length);
    }
}