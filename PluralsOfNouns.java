/* 1b cat1- Software is developed for kids to give plural of a given word.
Write a Java program to read a noun and print their plurals on
the basis of the following rules:
a. If noun ends in “y”, remove the “y” and add “ies”.
b. If noun ends in “s”, “ch”, or “sh”, add “es”.
c. In all other cases, just add “s”.
Print each noun and its plural in lowercase letters with separated
by a space. */
import java.util.*;
class PluralsOfNouns{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = sc.nextLine();
        StringBuilder str= new StringBuilder(noun);
        int n= noun.length();
        if(str.charAt(n-1)=="y"){
            str.deleteCharAt(n-1);
            str.append("ies");
            System.out.println("Plural of "+noun+" is "+str);
        }
        else if(str.matches(".*s$")||str.matches(".*ch$")||str.matches(".*sh$")){
            str.append("es");
            System.out.println("Plural of "+noun+" is "+str);
        }
        else{
            str.append("s");
            System.out.println("Plural of "+noun+" is "+str);
        }
    }
}