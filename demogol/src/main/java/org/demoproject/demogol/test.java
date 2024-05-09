package org.demoproject.demogol;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class test extends Application {

    Button lastClickedButton;

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);

        Button button1 = new Button("Page 1");
        Button button2 = new Button("Page 2");
        Button button3 = new Button("Page 3");
        Button button4 = new Button("Page 4");

        button1.setOnAction(e -> changeButtonState(button1));
        button2.setOnAction(e -> changeButtonState(button2));
        button3.setOnAction(e -> changeButtonState(button3));
        button4.setOnAction(e -> changeButtonState(button4));

        root.getChildren().addAll(button1, button2, button3, button4);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menu Button Highlight");
        primaryStage.show();
    }

    private void changeButtonState(Button button) {
        if (lastClickedButton != null) {
            lastClickedButton.setStyle(""); // Reset last clicked button color
        }
        button.setStyle("-fx-background-color: red"); // Set current button color to red
        lastClickedButton = button; // Update last clicked button
    }

    public static void main(String[] args) {
        launch(args);
    }
}