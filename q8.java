import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
class Sample implements Serializable {
    public String pid;
    public int diameter;
    public int length;
    public int weight;
    public Sample(String pid, int diameter, int length, int weight) {
        this.pid = pid;
        this.diameter = diameter;
        this.length = length;
        this.weight = weight;
    }
}
public class q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pid;
        int diameter;
        int length;
        int weight;
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        int i = 0;
        int n;
        System.out.print("Number of product samples : ");
        n = scanner.nextInt();
        for (int l = 0; l < n; l++) {
        System.out.println("");
        System.out.println("");
        System.out.print("Enter the ID of product " + (l + 1) + " : ");
        pid = scanner.next();
        System.out.print("Enter the Length(cm) of product " + (l + 1) + " : ");
        length = scanner.nextInt();
        System.out.print("Enter the Diameter(cm) of product " + (l + 1) + " : ");
        diameter = scanner.nextInt();
        System.out.print("Enter the Weight(gms) of product " + (l + 1) + " : ");
        weight = scanner.nextInt();
        Sample object = new Sample(pid, diameter, length, weight);
        String filename = "file.txt";
        try {
        FileOutputStream file = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(object);
        }
        catch (IOException ex) {
        }
        Sample object2 = null;
        try{
        FileInputStream file = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(file);
        object2 = (Sample) in.readObject();
        in.close();
        file.close();
        if (object2.length == 10 && object2.diameter == 3 && object2.weight
        == 100) {
        list1.add((object2.pid).toString());
        }
        if (object2.length != 10 || object2.diameter != 3 || object2.weight
        != 100) {
        list.add((object2.pid).toString());
        }
        }
        catch (IOException ex) {
        }
        catch (ClassNotFoundException ex) {
        System.out.println("ClassNotFoundException");
        }
        }
        System.out.println("");
        System.out.println("Following are Non-Defective Product ID's : ");
        for (String k : list1) {
        System.out.println(k);
        }
        System.out.println("");
        System.out.println("Following are Defective Product ID's : ");
        for (String j : list) {
        System.out.println(j);
        }
        System.out.println("");
    }
}