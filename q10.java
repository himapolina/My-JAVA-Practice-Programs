import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class q10 extends Application {
    TextField num1 = new TextField();
    TextField num2 = new TextField();
    TextField res = new TextField();
    Button add = new Button("Add");
    Button sub = new Button("Subtract");
    Button mul = new Button("Multiply");
    Button div = new Button("Divide");
    Label symbol = new Label("+");
    Label r = new Label("=");
    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox text = new HBox();
        text.getChildren().addAll(num1, symbol, num2, r, res);
        text.setAlignment(Pos.CENTER);
        text.setPadding(new Insets(10, 10, 10, 10));
        text.setSpacing(10);
        HBox botton = new HBox();
        botton.getChildren().addAll(add, sub, mul, div);
        botton.setAlignment(Pos.CENTER);
        botton.setPadding(new Insets(3, 3, 3, 3));
        botton.setSpacing(3);
        BorderPane root = new BorderPane();
        root.setTop(text);
        root.setBottom(botton);
        add.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                double n1 = Double.parseDouble(num1.getText());
                double n2 = Double.parseDouble(num2.getText());
                res.setText(String.format("%.1f", n1 + n2));
            }
        });
        sub.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                symbol.setText("-");
                double n1 = Double.parseDouble(num1.getText());
                double n2 = Double.parseDouble(num2.getText());
                res.setText(String.format("%.1f", n1 - n2));
            }
        });
        mul.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                symbol.setText("*");
                double n1 = Double.parseDouble(num1.getText());
                double n2 = Double.parseDouble(num2.getText());
                res.setText(String.format("%.1f", n1 * n2));
            }
        });
        div.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                symbol.setText("/");
                double n1 = Double.parseDouble(num1.getText());
                double n2 = Double.parseDouble(num2.getText());
                res.setText(String.format("%.1f", n1 / n2));
            }
        });
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 300, 73));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}