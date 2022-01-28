import java.io.*;
import java.util.*;
class Employee {
    String eid;
    String name;
    int year;
    Employee(String eid, String name, int year){

    this.eid = eid;
    this.name = name;
    this.year = year;
}}
class invalidId extends Exception{}
    class Exc {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("INPUT");
            System.out.println("Enter number of employees: ");
            int noEmp = sc.nextInt();
            Employee[] emp = new Employee[noEmp];
            int temp = noEmp; String id;String name; int year;
            String [] breakup;
            int total = 0;
            while(temp>0){
                System.out.println("Enter Employee ID: ");
                id =sc.next();
                System.out.println("Enter Employee Name: ");
                name = sc.next();
                System.out.println("Enter year: ");
                year = sc.nextInt();
                System.out.println("---------------------------------");
                breakup = id.split("-");
                
                try{
                if ((breakup[1].equals("S")) ||(breakup[1].equals("F"))){
                }else{
                throw new invalidId();
                }for (int i=0;i<breakup[2].length();i++){
                if(!(Character.isDigit(breakup[2].charAt(i)))){
                throw new invalidId();
                }}
                emp[total] = new Employee(id,name,year);
                total++;
                System.out.println("---------------------------------");
                }catch( invalidId ex){
                System.out.println("Invalid Id");
                System.out.println("---------------------------------");
                }
                temp--;
            }

            for (int i=0;i<total;i++){
            System.out.println("OUTPUT");
            System.out.println(emp[i].eid);
            System.out.println(emp[i].name);
            System.out.println(emp[i].year);
            System.out.println("---------------------------------");
        }
    }
}