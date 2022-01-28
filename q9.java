import java.io.*;
import java.util.*;
public class q9 {
    @SuppressWarnings("unchecked") 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name,course;
        int num, flag=0;
        HashMap<String,ArrayList> h1 = new HashMap<>();
        HashMap<String,String> h2 = new HashMap<>();
        ArrayList<String> list1=new ArrayList<>();
        list1.add("C");
        list1.add("C++");
        h1.put("Hima",list1);
        h2.put("Python","Dr. ABC");
        h2.put("Math","Dr. DEF");
        h2.put("C","Dr. GHI");
        h2.put("C++","Dr. JKL");
        h2.put("Physics","Dr. MNO");
        h2.put("Chemistry","Dr. PQR");
        h2.put("Digital Electronics","Dr. STU");
        while(flag!=1){
            System.out.println("1. Add a Student\n2. Remove a Student\n3. Display " +
            "student and courses\n4. Display Course and Faculty\n5. Fetch Teachers\n6. Exit\n");
            System.out.print("Choose an Option: ");
            int n = sc.nextInt();
            switch(n){
                case 1:
                ArrayList<String> list=new ArrayList<>();
                System.out.print("Enter Student Name: ");
                name = sc.next();
                System.out.print("Enter no. of courses registered: ");
                num = sc.nextInt();
                if(num>3){
                System.out.println("Only 3 courses can be registered!!");
                break;
                }
                for (int i = 0; i < num; i++) {
                System.out.print("Enter Course "+(i+1)+": ");
                course = sc.next();
                list.add(course);
                }
                h1.put(name,list);
                System.out.println("Student Added!");
                System.out.println();
                break;
                case 2:
                System.out.print("Enter Student Name: ");
                name = sc.next();
                h1.remove(name);
                System.out.println("Student Removed!");
                System.out.println();
                break;
                case 3:
                System.out.println("Student and registered Courses: ");

                for(Map.Entry m:h1.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
                }
                System.out.println();
                break;
                case 4:
                System.out.println("Courses and corresponding Faculty: ");
                for(Map.Entry m:h2.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
                }
                System.out.println();
                break;
                case 5:
                System.out.print("Enter Student's name: ");
                name = sc.next();
                ArrayList<String> list3=new ArrayList<>();
                list3 = h1.get(name);
                System.out.println("Faculties are: ");
                for(String subj:list3){
                if(h2.containsKey(subj)){
                System.out.println(h2.get(subj));
                }
                }
                System.out.println();
                break;
                case 6:
                flag=1;
                System.out.println("ok");
                break;
            }
        }
}
}