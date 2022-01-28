class Student{
    String name;
    String status;
    String mobile;
}
class FullTimeStudent extends Student{
    int tuition=2000;
    String status="Full Time";
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Status: "+status);
        System.out.println("Phone: "+mobile);
        System.out.println("Tuition Fee: "+tuition);
    }
}
class PartTimeStudent extends Student{
    int hours;
    String status= "Part Time";
    public void display(){
        int tuition=hours*200;
        System.out.println("Name: "+name);
        System.out.println("Status: "+status);
        System.out.println("Phone: "+mobile);
        System.out.println("Tuition Fee: "+tuition);
        System.out.println("Credits hours: "+hours);
    }
}
class RunStudents{
    public static void main(String[] arg){
        FullTimeStudent f1 = new FullTimeStudent();
        PartTimeStudent p1 = new PartTimeStudent();
        f1.name= new String("Hima");
        f1.mobile=new String("7032931035");
        f1.display();
        p1.name=new String("Bindu");
        p1.mobile=new String("8985990999");
        p1.hours=8;
        p1.display();
        
    }
}