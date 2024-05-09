package org.demoproject.demogol;

import java.io.IOException;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXProgressBar;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ownercontorler {

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private MFXButton backbtn;

    @FXML
    private FontAwesomeIconView cancel;

    @FXML
    private Button close;

    @FXML
    private Text forget;

    @FXML
    private MFXButton googlebtn;

    @FXML
    private Text hii;

    @FXML
    private AnchorPane imagemain;

    @FXML
    private MFXButton loginbtn;

    @FXML
    private Text loginin;

    @FXML
    private Text loginin1;

    @FXML
    private Text loginin2;

    @FXML
    private Button maximize;

    @FXML
    private Button min;

    @FXML
    private Text or;

    @FXML
    private MFXPasswordField password;

    @FXML
    private Text regin;

    @FXML
    private Text reginew;

    @FXML
    private BorderPane containnew;

    @FXML
    private HBox titlebar;



    @FXML
    private MFXTextField username;

    @FXML
    private Text welcome;

    @FXML
    void closebtn(ActionEvent event) {
 Stage stage = (Stage) close.getScene().getWindow();
 stage.close();
    }

    @FXML
    void maxbtn(ActionEvent event) {
Stage stage =(Stage) maximize.getScene().getWindow();
stage.setMaximized(!stage.isMaximized());
    }

    @FXML
    void minbtn(ActionEvent event) {
Stage stage = (Stage) min.getScene().getWindow();
stage.setIconified(true);
    }


  

    @FXML
    void backto(ActionEvent event) {

        
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
    void logintobtn(ActionEvent event) throws IOException {
        String name = username.getText();
        String pass =  password.getText();
        

        if (name.isEmpty() || pass.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Fields");
            alert.setHeaderText(null);
            alert.setContentText("Please enter both username and password.");
            alert.showAndWait();
            
            return; // Exit the method early
        }
    
        
        if(name.equals("lenskart") && pass.equals("lenskart123")){
           try{
            root = FXMLLoader.load(getClass().getResource("dashboardowner.fxml"));
            root.getStylesheets().add(getClass().getResource("css/dashbord.css").toExternalForm());
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
              stage.setMaximized(true);
            stage.setScene(scene);
            stage.show();

           
           }
           catch(IOException e){
            e.printStackTrace();
           }
        }

        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid username or password. Please try again.");
        
            alert.showAndWait();
        }
    }

}
