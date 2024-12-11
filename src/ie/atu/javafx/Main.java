package ie.atu.javafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application{
    @Override
    public void start(Stage pramaryStage){
        System.out.println("Javafx Application Started");
    }
public class HelloJavaFX extends Application{
    @Override
    public void start(Stage primaryStage){
        Label welcomeLabel = new Label("Welcome to javafx");
        welcomeLabel.setStyle("-fx-font-size: 20px;");

        StackPane root = new StackPane();
        root.getChildren().add(welcomeLabel);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

    public static void main(String[] args){
        launch(args);
    }


}
