package org.demoproject.demogol;

import java.io.File;
import java.io.IOException;

import animatefx.animation.FadeIn;
import animatefx.animation.SlideInLeft;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class testcontrolar {

 private Stage stage;
 private Scene scene;
 private Parent root;


 @FXML
 private MFXButton Aboutbtn;

 @FXML
 private MFXButton Contactbtn;



    @FXML
    private Button btnnext;

 @FXML
 private FontAwesomeIconView cancel;

 @FXML
 private Button close;

 @FXML
 private AnchorPane container;

 @FXML
 private BorderPane containnew;

 @FXML
 private MFXButton homebtn;

 @FXML
 private Button maximize;

 @FXML
 private Button min;

 @FXML
 private MFXButton patnerbtn;

 
 @FXML
 private Text smtext;
 
 @FXML
 private FontAwesomeIconView svg;
 
 @FXML
 private HBox titlebar;

 @FXML
 private Text protection;

 
 
 public void initialize() {
    // Set initial opacity of smtext to 0
     Font font = Font.loadFont(getClass().getResourceAsStream("DMSans-ExtraBoldItalic.ttf"), 0);
     String fontName = font.getName();
    btnnext.setOpacity(0);
    // Font myCustomFont = Font.loadFont(getClass().getResourceAsStream("DMSans-ExtraBoldItalic.ttf"), 30);
    // protection.setFont(myCustomFont);

    // Create FadeIn animation for btnnext
    FadeIn fadeInAnimation = new FadeIn(btnnext);
    fadeInAnimation.setSpeed(1.0); // Set speed

    // Set up SlideInLeft animation for btnnext
    SlideInLeft slideInLeftAnimation1 = new SlideInLeft(btnnext);
    slideInLeftAnimation1.setSpeed(0.5); // Set speed

    // Set the event handler for when the SlideInLeft animation finishes
    slideInLeftAnimation1.setOnFinished(event -> {
        // Play the FadeIn animation when the SlideInLeft animation finishes
        fadeInAnimation.play();
    });

    // Play the SlideInLeft animation
    slideInLeftAnimation1.play();
}   


 @FXML
 void handleBtnNextClick(ActionEvent event) {
     try {
         // Load the FXML file for the next page
         FXMLLoader loader = new FXMLLoader(getClass().getResource("firstmain.fxml"));
         Parent loginRoot = loader.load();
         loginRoot.getStylesheets().add(getClass().getResource("css/firstmain.css").toExternalForm());
         // Set the content of the AnchorPane to the loaded FXML file
         containnew.getChildren().setAll(loginRoot);
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
 




 @FXML
 void closebtn(ActionEvent event) {
Stage stage = (Stage) close.getScene().getWindow();
stage.close();
 }



 @FXML
 void maxbtn(ActionEvent event) {
Stage stage = (Stage) maximize.getScene().getWindow();
stage.setMaximized(!stage.isMaximized());
 }

 @FXML
 void minbtn(ActionEvent event) {
     Stage stage = (Stage) min.getScene().getWindow();
stage.setIconified(true);;
 }
 
 


 
 
}