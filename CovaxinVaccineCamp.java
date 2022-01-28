import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// class that stores employee information
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
// For taking number of objects(employess) to be created

System.out.print("How many records will you be entering now? ");

// For storing number of objects to be created
int n;
// Get input from user
n = takeInput.nextInt();
// Ignore input if new line is there
takeInput.nextLine();
try {
// Open file employeesData.txt in write mode
FileWriter data = new FileWriter("employeesData.txt", true);
// Create an array of type CovaxinVaccineCamp of length n
CovaxinVaccineCamp[] employees = new CovaxinVaccineCamp[n];
// Get employee data for n times and store in employeesData.txt
for (int i = 0; i < employees.length; i++) {
employees[i] = new CovaxinVaccineCamp();

// prompt for getting Emp_id
System.out.print("Enter Emp_id: ");
employees[i].Emp_id = takeInput.nextLine();
// Write Emp_id to file
data.write("Emp_id: " + employees[i].Emp_id + "\n");

// Prompt for getting name of employee
System.out.print("Enter name of employee: ");
employees[i].Name = takeInput.nextLine();
// Write name of employee to file
data.write("Name: " + employees[i].Name + "\n");

// Prompt for getting age of emplyee
System.out.print("Enter age of employee: ");
// Get age of employee from user
employees[i].age = takeInput.nextInt();
// Write employee age to file
data.write("Age : " + employees[i].age + "\n");

// Prompt for getting address of employee
takeInput.nextLine();
System.out.print("Enter address of employee: ");
employees[i].address = takeInput.nextLine();
// Wtite address of emplyee to file
data.write("Address: " + employees[i].address + "\n");

// Prompt for getting mobile number of employee
System.out.print("Enter mobile number of employee: ");
employees[i].mobileNumber = takeInput.nextLine();
// Write mobile number to file
data.write("mobileNumber: " + employees[i].mobileNumber + "\n");

// Prompt for getting blood group of employee
System.out.print("Enter blood group of employee: ");
employees[i].bloodGroup = takeInput.nextLine();
// Write blood group to the file
data.write("bloodGroup: " + employees[i].bloodGroup + "\n");

// Prompt asking if wmployee geto allery or not
System.out.print("Did employee get Allergy?: ");
employees[i].Allergy = takeInput.nextLine();
// Writing response to the file
data.write("Allergy: " + employees[i].Allergy + "\n");

// Prompt for getting vaccination date of employee
System.out.print("Enter date of vaccination of employee: ");
employees[i].DateofVaccination = takeInput.nextLine();
// Write vaccination date if employee to file
data.write("DateofVaccination: " + employees[i].DateofVaccination + "\n");

}
// Close the file employeesData.txt
data.close();
// If IOException occurs
} catch (IOException e) {
// Print the message if exception occcurs
System.out.print("Some error occurred!");
}
// Closr the scanner object
takeInput.close();

}

// Read from employeesData.txt and diaply the employees who got allergy
static void readFromFile() {

try {
// Open employeesData.txt file for reading
File read = new File("employeesData.txt");
// Create new scanner object for reading from file
Scanner readData = new Scanner(read);
// Read until no lines are found
while (readData.hasNextLine()) {
// Name is second line so skipping 1 time
readData.nextLine();
// Get name of employee
String name = readData.nextLine();
// response of Allergy is 5th line from name so skipping 4 lines
readData.nextLine();
readData.nextLine();
readData.nextLine();
readData.nextLine();
// Get allergy response
String allergy = readData.nextLine();
// As there is one entry vaccination date after allergy so skip nextLine to get
// into another employee information
readData.nextLine();
// Check if allergy resonse is yes
if (allergy.equals("Allergy: yes"))
// Print the name of employee if he had allergy
System.out.println(name.substring(6));

}
// Close the scanner object
readData.close();
// catch of IOException occurs
} catch (IOException e) {
// Print message if exception occurs
System.out.print("Some error occurred!");

}

}

public static void main(String[] args) {

Scanner response = new Scanner(System.in);
// Show menu and ask for input (1 or 2)
System.out.print(
"1. To write employee record to file\n2. To read record from file and print employees who got allergy.\n");
System.out.print("Enter your choice (1 or 2): ");
int responseVal = response.nextInt();

// If user enters 1 then write the data to file entered by user
if (responseVal == 1)
writeToFile();
// If user enters 2 then print names of emplyees who got allergy
else if (responseVal == 2)
readFromFile();
// Show error message if user presses anything else
else
System.out.println("Invalid response!");
// Close the scanner object
response.close();

}
}