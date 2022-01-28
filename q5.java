import vit.University;
import vit.btech.Classes;
import java.util.*;
class q5{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int scopeStudents = 12000;
        int siteStudents = 10000;
        int one = 5192;
        int two = 5201;
        int three = 4908;
        int four = 5023;
        System.out.println("---Number of Students already added---");
        System.out.println("SCOPE = "+scopeStudents);
        System.out.println("SITE = "+siteStudents);
        System.out.println("First Year = "+one);
        System.out.println("Second Year = "+two);
        System.out.println("Third Year = "+three);
        System.out.println("Fourth Year = "+four+"\n");
        System.out.println("Enter number of students you want to add: ");
        int n = sc.nextInt();
        University school = new University();
        for(int i=0;i<n;i++){
            System.out.println("\n Enter details of Student "+(i+1)+"\n");
            System.out.println(" Enter school of student    1. SCOPE     2. SITE  : ");
            int s=sc.nextInt();
            
            if(s==1){
                scopeStudents = school.countScope(scopeStudents);
                System.out.println(" Student Added! Total students in SCOPE = "+scopeStudents);
            }else if(s==2){
                siteStudents = school.countSite(siteStudents);
                System.out.println(" Student Added! Total students in SITE = "+siteStudents);
            }
            System.out.println("\n Enter year of study of student   1 or 2 or 3 or 4 : ");
            int year = sc.nextInt();
            Classes c = new Classes();
            if(year==1){
                one = c.first(one);
                System.out.println("Student Added! Total students in 1st year = "+one);
            }else if(year==2){
                two = c.second(two);
                System.out.println("Student Added! Total students in 2nd year = "+two);
            }else if(year==3){
                three = c.third(three);
                System.out.println("Student Added! Total students in 3rd year = "+three);
            }else if(year==4){
                four = c.fourth(four);
                System.out.println("Student Added! Total students in 4th year = "+four);
            }
        }
    }
}