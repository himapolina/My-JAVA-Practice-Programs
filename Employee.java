class Employee{
    String name;
    int id;
    double salary;
    
    Employee(){
        id=0;
        salary=10000;
        name="hima";
    }
    Employee(int x, String y, double z){
        id=x;
        name=y;
        salary=z;
    }
    public static void main(String[] arg){
        Employee[] emps = new Employee[3];
        emps[0]= new Employee(101,"Hima", 24500.0);
        emps[1]= new Employee(102,"Bindu", 25000.8);
        emps[2]= new Employee(103,"Hari", 23678.4);
        System.out.println("Total salary of 3 employees is "+ totalSalaries(emps));
    }
    static double totalSalaries(Employee[] x){
        double total= x[0].salary + x[1].salary + x[2].salary;
        return total;
    }
}