import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CovaxinVaccineCamp{
public String Emp_id;
public String Name;
public int age;
public String address;
public String mobileNumber;
public String bloodGroup;
public String Allergy;
public String DateofVaccination;

static void writeToFile() {
Scanner takeInput = new Scanner(System.in);
System.out.print("Enter number of objects to be created: ");
int n;
n = takeInput.nextInt();

takeInput.nextLine();
try {
FileWriter data = new FileWriter("employeesData.txt", true);
CovaxinVaccineCamp[] employees = new CovaxinVaccineCamp[n];
for (int i = 0; i < employees.length; i++) {
employees[i] = new CovaxinVaccineCamp();
System.out.print("Enter Emp_id: ");
employees[i].Emp_id = takeInput.nextLine();
data.write("Emp_id: " + employees[i].Emp_id + "\n");
System.out.print("Enter name of employee: ");
employees[i].Name = takeInput.nextLine();
data.write("Name: " + employees[i].Name + "\n");
System.out.print("Enter age of employee: ");
employees[i].age = takeInput.nextInt();
data.write("Age : " + employees[i].age + "\n");
takeInput.nextLine();
System.out.print("Enter address of employee: ");
employees[i].address = takeInput.nextLine();
data.write("Address: " + employees[i].address + "\n");
System.out.print("Enter mobile number of employee: ");
employees[i].mobileNumber = takeInput.nextLine();
data.write("mobileNumber: " + employees[i].mobileNumber + "\n");
System.out.print("Enter blood group of employee: ");
employees[i].bloodGroup = takeInput.nextLine();
data.write("bloodGroup: " + employees[i].bloodGroup + "\n");
System.out.print("Do employee got Allergy?: ");
employees[i].Allergy = takeInput.nextLine();
data.write("Allergy: " + employees[i].Allergy + "\n");
System.out.print("Enter date of vaccination of employee: ");
employees[i].DateofVaccination = takeInput.nextLine();
data.write("DateofVaccination: " + employees[i].DateofVaccination + "\n");

}
data.close();
} catch (IOException e) {
System.out.print("Some error occurred!");
}
takeInput.close();

}
static void readFromFile() {

try {
File read = new File("employeesData.txt");
Scanner readData = new Scanner(read);
while (readData.hasNextLine()) {
readData.nextLine();
String name = readData.nextLine();
readData.nextLine();
readData.nextLine();
readData.nextLine();
readData.nextLine();
String allergy = readData.nextLine();
readData.nextLine();
if (allergy.equals("Allergy: yes"))
System.out.println(name.substring(6));

}
readData.close();
} catch (IOException e) {
System.out.print("Some error occurred!");

}

}

public static void main(String[] args) {

Scanner response = new Scanner(System.in);
System.out.print(
"1. To write employee data to file\n2. To read data from employeesData.txt and print employees who got allergy.\n");
System.out.print("Enter your response: ");
int responseVal = response.nextInt();
if (responseVal == 1)
writeToFile();
else if (responseVal == 2)
readFromFile();
else
System.out.println("Invalid response");
response.close();

}
}