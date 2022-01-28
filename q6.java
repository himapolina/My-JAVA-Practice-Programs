import java.io.*;
class Student implements Serializable{
    public String name, regno, proctor;
        double cgpa;
    public Student(String name, String regno, String proctor, double cgpa){
        super();
        this.name = name;
        this.regno = regno;
        this.proctor= proctor;
        this.cgpa= cgpa;

    }
}
class q6{
    public static void main(String[] arg){
        try{
            FileOutputStream fos = new FileOutputStream("StudentFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Student s1 = new Student("Hima", "19BCE2682", "Dr. ABC", 9.03);
            Student s2 = new Student("Bindu", "19BCT0044", "Dr. XYZ", 8.95);
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            
            FileInputStream fis = new FileInputStream("StudentFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Student) ois.readObject();
            s2 = (Student) ois.readObject();
            Read r = new Read();
            r.display(s1);
            r.display(s2);
            /*System.out.println("Student 1: ");
            System.out.println("Name : " + s1.name);
            System.out.println("Registration Number : " + s1.regno);
            System.out.println("Proctor : " + s1.proctor);
            System.out.println("CGPA : " + s1.cgpa);
            System.out.println("Student 2: ");
            System.out.println("Name : " + s2.name);
            System.out.println("Registration Number : " + s2.regno);
            System.out.println("Proctor : " + s2.proctor);
            System.out.println("CGPA : " + s2.cgpa);
            ois.close();*/
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e ){
            e.printStackTrace();
        }
    }
}
class Read{
    public void display(Student s1){
        /*try{
            FileInputStream fis = new FileInputStream(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
            //FileInputStream fis = new FileInputStream(null);
        }
        try{
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (Student) ois.readObject();
            s2 = (Student) ois.readObject();*/
            System.out.println("Student 1: ");
            System.out.println("Name : " + s1.name);
            System.out.println("Registration Number : " + s1.regno);
            System.out.println("Proctor : " + s1.proctor);
            System.out.println("CGPA : " + s1.cgpa);
            if(s1.cgpa>9){
                System.out.println("Grade : A");
            }else if(s1.cgpa >7 && s1.cgpa<=9){
                System.out.println("Grade : B");
            }else if(s1.cgpa >5 && s1.cgpa<=7){
                System.out.println("Grade : C");
            }
            
            //ois.close();
        /*}catch (IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }*/
    }
}