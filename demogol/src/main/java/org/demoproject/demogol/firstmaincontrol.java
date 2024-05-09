package org.demoproject.demogol;

import java.io.IOException;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class firstmaincontrol {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ImageView avtar;

    @FXML
    private Pane body;

    @FXML
    private FontAwesomeIconView cancel;

    @FXML
    private Pane card;

    @FXML
    private Pane card1;

    @FXML
    private Text cardinnerh;

    @FXML
    private Text cardinnerh1;

    @FXML
    private Text cardinnerhsm;

    @FXML
    private Text cardinnerhsm1;

    @FXML
    private Button close;

    @FXML
    private Pane imagecircle;

    @FXML
    private AnchorPane imageview;

    @FXML
    private Pane imagewrap;

    @FXML
    private Pane imagewrap1;

    @FXML
    private Pane indexbox;

    @FXML
    private Text label;

    @FXML
    private Button maximize;

    @FXML
    private Button min;

    @FXML
    private Pane nav;

    @FXML
    private Pane navpro;

    @FXML
    private Text seprate;

    @FXML
    private Text smtitle;

    @FXML
    private TextFlow smwordwrap;

    @FXML
    private TextFlow textlabel;

    @FXML
    private Text title;

    // @FXML
    // void initialize() {
    //     // Load and display the image
    //     Image image = new Image("image/404a9dc1d31d63fbee6b7215a2111ec1.jpg");
    //     ImageView imageView = new ImageView(image);

    //     // Bind the imageView width property to imageview width property
    //     // So, if width of imageview change, the width of imageView automatically will be changed
    //     imageView.fitWidthProperty().bind(imageview.widthProperty());

    //     // Make the ratio same with original image
    //     imageView.setPreserveRatio(true);

    //     imageview.getChildren().add(imageView);
    // }

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
        stage.setIconified(true);
    }
    @FXML
    private BorderPane border;

    public void bindBorderWidthToSceneWidth(Scene scene) {
        // Bind the width of the BorderPane to the width of the scene
        border.prefWidthProperty().bind(scene.widthProperty());
    }


    @FXML
    void empdash(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("employeelogin.fxml"));
        root.getStylesheets().add(getClass().getResource("css/ownerlogin.css").toExternalForm());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
          stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void owndash(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ownerlogin.fxml"));
        root.getStylesheets().add(getClass().getResource("css/ownerlogin.css").toExternalForm());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
          stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }
}
