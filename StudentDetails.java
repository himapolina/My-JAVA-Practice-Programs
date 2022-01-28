/* Read the following details of ‘n’ students using Scanner class methods and display the same. - Registration number ( String)
-	Name (String that may contain first name, middle name and last name)
-	CGPA (Floating point number)
-	Programme Name(String)
-	School Name (String with multiple words)
-	Proctor Name (String that may contain first, middle and last names)
*/
import java.util.*;
class StudentDetails{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number n: ");
        int n=sc.nextInt();
        sc.nextLine();
        String[] name = new String[n];
        String[] programme = new String[n];
        String[] school = new String[n]; 
        String[] proctor = new String[n]; 
        String[] regno = new String[n];
        float[] cgpa= new float[n];
        for(int i=1;i<n+1;i++){
            System.out.println("Enter Details of Student "+i);
            System.out.println("Registration number: ");
            regno[i-1] = sc.nextLine();
            System.out.println("Name: ");
            name[i-1] = sc.nextLine();
            System.out.println("CGPA: ");
            cgpa[i-1] = sc.nextFloat();
            sc.nextLine();
            System.out.println("Programme: ");
            programme[i-1] = sc.nextLine();
            System.out.println("School: ");
            school[i-1] = sc.nextLine();
            System.out.println("Proctor: ");
            proctor[i-1] = sc.nextLine();
        }
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Registration number||      Name        ||  CGPA    ||  Programme   ||  School  ||      Proctor  ||");
        for(int i=0;i<n;i++){
            System.out.println(regno[i]+"              "+name[i]+"         "+cgpa[i]+"   "+programme[i]+"    "+school[i]+"   "+proctor[i]);
        }
    }
}