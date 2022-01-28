/*3b CAT1 - Write a Java program to calculate salary of an employee in the
company.
1. Member variables are:
Employee_No, Employee_name, Basic salary, Dearness
Allowance (DA), House Rent allowance (HRA), and
Gross_salary.
2. Member Methods are:
    • To calculate and return Dearness Allowance (DA) - (DA - 30%
    of basic salary),
    • To calculate and return House Rent Allowance (HRA) (35% of
    basic salary in case the basic salary is > 400, otherwise it is 30%
    of basic salary),
    • To calculate and return Gross_salary (Basic + DA + HRA)
3. The program should use the parametrized constructor to
initialize the member variables of the class.
4. The program should print the Employee_No,
Employee_name, Basicsalary, Dearness
Allowance (DA), House rent allowance (HRA), and
Gross_salary.  */
import java.util.Scanner;
class SalaryOfEmployee{
    int Employee_No;
    String Employee_name;
    double Basic_Salary, DA, HRA, Gross_salary;
    SalaryOfEmployee(int Employee_No, String Employee_name, double Basic_Salary){
            this.Employee_No = Employee_No;
            this.Employee_name = Employee_name;
            this.Basic_Salary = Basic_Salary;
            this.DA = dearness_allowance(Basic_Salary);
            this.HRA= house_rent_allowance(Basic_Salary);
            this.Gross_salary = gross_salary(Basic_Salary,DA,HRA);
            System.out.println(""+Employee_No+", "+Employee_name+", "+Basic_Salary+", "+DA+", "+HRA+", "+Gross_salary);
    }
    public static void main(String arg[]){
        System.out.println("Employee details in order are Employee No., Employee Name, Basic Salary, DA, HRA, Gross Salary");
        SalaryOfEmployee emp1 = new SalaryOfEmployee(101, "hima", 24500.35);
        SalaryOfEmployee emp2 = new SalaryOfEmployee(102, "bindu", 23900.58);
        }
    static double gross_salary(double Basic_Salary, double DA, double HRA){
        return (Basic_Salary + DA + HRA);
    }
    static double dearness_allowance(double Basic_Salary){
        return (0.3*(Basic_Salary));
    }
    static double house_rent_allowance(double Basic_Salary){
        if(Basic_Salary>400) return (0.35*Basic_Salary);
        else return(0.3*Basic_Salary);
    }
}