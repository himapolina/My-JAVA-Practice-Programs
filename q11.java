import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
public class q11 extends Application {
private RadioButton r1 = new RadioButton("Cash");
private RadioButton r2 = new RadioButton("Debit Card");
private RadioButton r3 = new RadioButton("Credit Card");
private CheckBox r4 = new CheckBox("Milk");
private CheckBox r5 = new CheckBox("Juice");
private CheckBox r6 = new CheckBox("Tea");
private CheckBox r7 = new CheckBox("Coffee");
private CheckBox r8 = new CheckBox("Water Bottles");

private CheckBox r10 = new CheckBox("Apples 1dz");
private CheckBox r11 = new CheckBox("Oranges 1dz");
private CheckBox r12 = new CheckBox("Bananas 1dz");
private CheckBox r13 = new CheckBox("Potatoes 1kg");
private CheckBox r14 = new CheckBox("Onions 1kg");
private CheckBox r15 = new CheckBox("Tomatoes 1kg");
private ToggleGroup size=new ToggleGroup();
private Button add=new Button("Add Selected Items");
private Button done=new Button("Total");
TitledPane SIZE,beverages,food;
double price = 0.00;
Label P=new Label();
ArrayList<Bill>cart=new ArrayList<>();
@Override
public void start(Stage primaryStage) throws Exception {
r1.setUserData("Cash");
r2.setUserData("Debit Card");
r3.setUserData("Credit Card");
size.getToggles().add(r1);
size.getToggles().add(r2);
size.getToggles().add(r3);

done.setOnAction(new pricehandler());

add.setOnAction(new addhandler());
VBox v1=new VBox(r1,r2,r3);

SIZE = new TitledPane("Mode of Payment", v1);
SIZE.setCollapsible(false);
SIZE.setPrefHeight(75);
GridPane BEVERAGES=new GridPane();
BEVERAGES.setHgap(10);
BEVERAGES.setVgap(10);
BEVERAGES.setPadding(new Insets(10, 10, 10, 10));
BEVERAGES.addRow(0, r4);
BEVERAGES.addRow(1, r5);
BEVERAGES.addRow(2, r6);
BEVERAGES.addRow(3, r7);
BEVERAGES.addRow(4, r8);

r4.setUserData("Milk");
r5.setUserData("Juice");
r6.setUserData("Tea");
r7.setUserData("Coffee");
r8.setUserData("Water Bottles");

beverages = new TitledPane("Beverages Section", BEVERAGES);
beverages.setPrefHeight(150);
beverages.setCollapsible(false);
VBox v2=new VBox();

v2.setPadding(new Insets(0));
v2.getChildren().addAll(beverages);
GridPane FOOD=new GridPane();
FOOD.setHgap(10);
FOOD.setVgap(10);
FOOD.setPadding(new Insets(10, 10, 10, 10));
FOOD.addRow(0, r10);
FOOD.addRow(1, r11);
FOOD.addRow(2, r12);
FOOD.addRow(3, r13);
FOOD.addRow(4, r14);
FOOD.addRow(5, r15);

food = new TitledPane("Food Section", FOOD);
food.setPrefHeight(150);
food.setCollapsible(false);
VBox v3=new VBox();

v3.setPadding(new Insets(0));
v3.getChildren().addAll(food);
HBox h1=new HBox(SIZE,v2,v3);
HBox h2=new HBox(add,done,P);
h1.setSpacing(15);
h2.setSpacing(15);
VBox zong=new VBox(h1,h2);
primaryStage.setTitle( "Grocery Store Billing" );
primaryStage.setMinHeight(200);
primaryStage.setMinWidth(500);
Scene s=new Scene(zong);
primaryStage.setScene( s );
primaryStage.show();
for(int i=0;i<cart.size();i++){
System.out.println(cart.get(i));
}
}
public static void main(String[] args){
launch( args );
}
private class pricehandler implements EventHandler<ActionEvent > {
@Override
public void handle(ActionEvent event) {

if(r4.isSelected()){
price=price+80;
}
if(r5.isSelected()){
price=price+50;
}
if(r6.isSelected()){
price=price+100;
}
if(r7.isSelected()){
price=price+100;
}
if(r8.isSelected()){
price=price+50;
}

if(r10.isSelected()){
price=price+150;
}
if(r11.isSelected()){
price=price+150;
}
if(r12.isSelected()){
price=price+130;
}
if(r13.isSelected()){
price=price+60;
}
if(r14.isSelected()){
price=price+130;
}
if(r15.isSelected()){
price=price+150;
}

double tax;
tax=price*0.04;
price=tax+price;
P.setText("\t Total Price = Rs. "+new Double( price ).toString()+"");
}
}
private class addhandler implements EventHandler<ActionEvent>{
@Override
public void handle(ActionEvent event) {
if(r1.isSelected()){
Bill p=new Bill(r1.getText(),beverages.getUserData().toString(),price);
cart.add(p);
}else if(r2.isSelected()){
Bill p=new Bill(r2.getText(),beverages.getUserData().toString(),price);
cart.add(p);
}else if(r3.isSelected()){
Bill p=new Bill(r3.getText(),beverages.getUserData().toString(),price);
cart.add(p);
}
price=0;
r1.setSelected(true);
r4.setSelected(false);
r5.setSelected(false);
r6.setSelected(false);
r7.setSelected(false);
r8.setSelected(false);

r10.setSelected(false);
r11.setSelected(false);
r12.setSelected(false);
r13.setSelected(false);
r14.setSelected(false);
r15.setSelected(false);

}
}
public class Bill{
String size;
String top;
double price;
public Bill(String s,String t,double p){
this.size=s;
this.top=t;
this.price=p;
}
public String getSize(){
return size;
}
public void setSize(String s){
this.size=s;
}
public String getTop(){
return top;
}
public void setTop(String t){
this.top=t;
}
public double getPrice(){
return price;
}
public void setPrice(double p){
this.price=p;
}
}
}