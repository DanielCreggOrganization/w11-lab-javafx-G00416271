package ie.atu.javafx;
import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application  {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");

        // Create four buttons
        Button button1 = new Button("Button 1"); button1.setOnAction(e -> System.out.println("hi, f*ck you <3"));
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");

        // Create a layout and add the buttons
        VBox layout = new VBox(10); // VBox with 10px spacing
        layout.getChildren().addAll(button1, button2, button3, button4);

        
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}