package ie.atu.javafx;
import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class Main extends Application  {
    Stage window;


public static void main(String []args){
     launch(args);
}

@Override
public void start(Stage primaryStage) throws Exception{
    window = primaryStage;
    window.setTitle("thenewboston - Javafx");
    

    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10,10,10,10));
    grid.setVgap(8);
    grid.setHgap(10);

    //Name label
    Label nameLabel = new Label("Username: ");
    GridPane.setConstraints(nameLabel, 0 , 0 );

    //input label
    TextField nameInput= new TextField();
    nameInput.setPromptText("hi");
    GridPane.setConstraints(nameInput, 1, 0);

    //password
    Label passwordLabel = new Label("Password: ");
    GridPane.setConstraints(passwordLabel, 0 , 1 );

    //input label
    TextField passwordInput= new TextField();
    passwordInput.setPromptText("hi");
    GridPane.setConstraints(passwordInput, 1, 1);

    Button loginButton = new Button("Log in");
    GridPane.setConstraints(loginButton, 1, 2);


    grid.getChildren().addAll(nameLabel, nameInput, passwordLabel, passwordInput, loginButton);
    Scene scene = new Scene(grid, 300, 200);
    scene.getStylesheets().add("/oohpretty.css");
    window.setScene(scene);
    window.show();
    }
}