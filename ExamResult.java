import java.util.*;
class Student{
    String regn_no;
    String name;
    void print()
    {
        System.out.println("Registration no.: "+regn_no);
        System.out.println("Name: "+name);
    }
}
class Exam extends Student{
    int sum;
    int addMarks(int arr[])
    {
        for(int i:arr)
        sum+=i;
        return sum;
    }
}
class Result extends Exam{
    int total_marks;
    void getMarks(int arr[])
    {
        total_marks=addMarks(arr);
        System.out.println("Total marks: "+total_marks);
    }
}
public class ExamResult
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        System.out.println("---Enter Student Details---");
        Student s1 = new Student();
        System.out.println("Enter Student Name: ");
        s1.name= sc.nextLine();
        System.out.println("Enter Student Registration Number: ");
        s1.regn_no= sc.nextLine();
        System.out.println("Enter Marks of student in 6 subjects: ");
        Exam e = new Exam();
        for(int i=0;i<6;i++)
        arr[i]=sc.nextInt();
        Result r=new Result();
        r.getMarks(arr);
        s1.print();
    }
}