package org.demoproject.demogol;

import java.io.IOException;

import animatefx.animation.BounceIn;
import animatefx.animation.BounceInDown;
import animatefx.animation.BounceInLeft;
import javafx.scene.Node;

import animatefx.animation.BounceInUp;
import animatefx.animation.BounceOut;
import animatefx.animation.FadeIn;
import animatefx.animation.FadeInLeft;
import animatefx.animation.SlideInLeft;
import animatefx.animation.SlideInRight;
import animatefx.animation.ZoomIn;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class controlar {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private MFXButton btnnext;

    @FXML
    private FontAwesomeIconView cancel;
    @FXML
    private Button close;

    @FXML
    private Pane containnew;

    @FXML
    private Button maximize;

    @FXML
    private Button min;




    ////butn action /////////////////////////////////////

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



    //intiliazation/////////////////////////////////////////////
    
    public void initialize() {
        // Set initial opacity of smtext to 0
        btnnext.setOpacity(0);
    
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
/////////////////////////////////////////////////////





    public void handleBtnNextClick(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("firstmain.fxml"));
        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
       }



    @FXML
    private AnchorPane container;

    @FXML
    private Text feat;

    @FXML
    private Text patner;

    @FXML
    private Text protection;

    @FXML
    private Text screenshot;

    @FXML
    private Text shade;

    @FXML
    private Text shadem;

    @FXML
    private Text smtext;

    @FXML
    private Text stylep;

    @FXML
    private FontAwesomeIconView svg;

    @FXML
    private TextFlow textflow;

    
    

}
