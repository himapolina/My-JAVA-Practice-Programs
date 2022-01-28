/* Write a Java program with class definition for ‘Employee’ with emp-name, emp-id, salary and
joining-date and required methods as members of the class. Create an array of objects of ‘emp’ for
‘n’ number of employees in VIT. Write a Java program to display the emp-name and emp-id of
employees who have salary less than INR100000 and sort the emp-name and display the Employee
details based on salary in ascending order. */
import java.util.*;
class Employee{
    String emp_name;
    int emp_id;
    double salary;
    String joining_date;
}
class RunEmployee{
    public static void main(String[] arg){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter number of employees 'n': ");
    int n= sc.nextInt();
    sc.nextLine();
    Employee[] emps = new Employee[n];
    Employee flag = new Employee();
    for(int i=0;i<n;i++){
        emps[i] = new Employee();
        System.out.println("Enter details of Employee "+(i+1)+": ");
        System.out.println("Enter employee name: ");
        emps[i].emp_name = sc.nextLine();
        System.out.println("Enter employee id: ");
        emps[i].emp_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee salary: ");
        emps[i].salary=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter joining date of employee: ");
        emps[i].joining_date=sc.nextLine();
    }
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            if(emps[i].salary> emps[j].salary){
                flag=emps[i];
                emps[i]=emps[j];
                emps[j]=flag;
            }
        }
    }
    System.out.println("Details of Employees, whose salary>10000 in ascending order of their salaries: ");
    for(int i=0;i<n;i++){
        if(emps[i].salary>10000){
        System.out.println("Enter employee name: "+emps[i].emp_name);
        System.out.println("Enter employee id: "+emps[i].emp_id);
        System.out.println("Enter employee salary: "+emps[i].salary);
        System.out.println("Enter joining date of employee: "+emps[i].joining_date);
        }
    }
    }
}