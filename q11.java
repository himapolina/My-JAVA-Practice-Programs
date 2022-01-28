import javafx.application.Application;  
import javafx.scene.Scene;
import javafx.event.ActionEvent;  
import javafx.scene.control.*;  
import javafx.scene.layout.BorderPane;  
import javafx.stage.Stage;  
public class q11 extends Application {  
    public static void main(String[] args) {  
    launch(args);  
        } 
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        BorderPane root = new BorderPane();  
        Scene scene = new Scene(root,200,300);  
        MenuBar menubar = new MenuBar();  
        Menu FileMenu = new Menu("File");  
        MenuItem filemenu1=new MenuItem("New");  
        MenuItem filemenu2=new MenuItem("Save");
        MenuItem filemenu3=new MenuItem("Save As");  
        MenuItem filemenu4=new MenuItem("Exit");
        filemenu4.setOnAction((ActionEvent t) -> {
            System.exit(0);
        });  
        Menu EditMenu=new Menu("Edit");  
        MenuItem EditMenu1=new MenuItem("Cut");  
        MenuItem EditMenu2=new MenuItem("Copy");  
        MenuItem EditMenu3=new MenuItem("Paste");
        MenuItem EditMenu4=new MenuItem("Crop");  
        EditMenu.getItems().addAll(EditMenu1,EditMenu2,EditMenu3, EditMenu4);  
        root.setTop(menubar);  
        FileMenu.getItems().addAll(filemenu1,filemenu2,filemenu3, filemenu4);  
        menubar.getMenus().addAll(FileMenu,EditMenu);  
        primaryStage.setScene(scene);  
        primaryStage.show();  
          
    }     
}  