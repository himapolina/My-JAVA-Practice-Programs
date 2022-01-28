import java.util.*;
class Telephone {
String nm,phno;
public Telephone(String nm, String phno) {
this.nm = nm;
this.phno = phno;
}
public String getNm() {
return nm;
}
public String getPhno() {
return phno;
}
public void setNm(String nm) {
this.nm = nm;
}
public void setPhno(String phno) {
this.phno = phno;
}
}
class TelephoneIndex extends Telephone {
public TelephoneIndex(String nm, String phno) {
super(nm, phno);
}
void changenum(String no) {
this.phno = no;
}
void changename(String nme) {
this.nm = nme;
}
}

public class q13{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int i,n;
String nm,no,tp;
System.out.println("Enter the number of inputs : ");
n = sc.nextInt();
TelephoneIndex[] tpin = new TelephoneIndex[n];
for(i=0;i<n;i++) {
System.out.println("Enter the name : ");
nm = sc.next();
System.out.println("Enter the number : ");
no = sc.next();
tpin[i] = new TelephoneIndex(nm,no);
}
while(true){
System.out.println("\n -----MENU-----");
System.out.println("1. Check if contact exists");
System.out.println("2. Search for contact");
System.out.println("3. Change the name of a contact");
System.out.println("4. Change the number of a contact");
int ch;
System.out.println("Enter your choice : ");
ch = sc.nextInt();
sc.nextLine();
switch(ch) {
case 1:
System.out.println("Enter the name : ");
tp = sc.nextLine();
for(i=0;i<n;i++) {
if(tpin[i].getNm().startsWith(tp)) {
System.out.println(tpin[i].getNm()+"'s contact exists.");
}
}
break;
case 2:
System.out.println("Enter the name : ");
tp = sc.nextLine();

for(i=0;i<n;i++) {
if(tpin[i].getNm().startsWith(tp)) {
System.out.print("Name : " + tpin[i].getNm()+"\n");
System.out.println("Number : " + tpin[i].getPhno()+"\n");
}
}
break;
case 3:
System.out.println("Enter the name : ");
tp = sc.nextLine();
System.out.println("Enter the new name : ");
nm = sc.nextLine();
for(i=0;i<n;i++) {
if(tpin[i].getNm().startsWith(tp)) {
tpin[i].setNm(nm);
}
}
break;
case 4:System.out.println("Enter the name : ");
tp = sc.nextLine();
System.out.println("Enter the new number : ");
no = sc.nextLine();
for(i=0;i<n;i++) {
if(tpin[i].getNm().startsWith(tp)) {
tpin[i].setPhno(no);
}
}
break;
}}
}
}