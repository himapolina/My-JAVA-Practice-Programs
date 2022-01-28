import pack1.Words;
import pack1.pack2.Length;
import java.util.*;
class Demo{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter some text: ");
        String s1 = sc.nextLine();
        System.out.println("Enter a word: ");
        String s2 = sc.nextLine();
        int n1= Words.countNumWords(s1);
        int n2 = Length.strLength(s2);
        System.out.println("Number of words in text is: "+n1);
        System.out.println("Length of word is: "+n2);
    }
}