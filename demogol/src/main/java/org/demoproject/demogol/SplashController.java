package org.demoproject.demogol;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SplashController implements Initializable {

    @FXML
    private AnchorPane mainsplash;

    @FXML
    private MediaView mediaview;

    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // Load the media file
        Media media = new Media(getClass().getResource("video/spl.mp4").toExternalForm());

        // Create a media player
        mediaPlayer = new MediaPlayer(media);
        mediaview.setMediaPlayer(mediaPlayer);

        // Add a listener for when the media ends
        mediaPlayer.setOnEndOfMedia(() -> {
            // Start loading the main application after the media ends
            loadMainApplication();
        });

        // Start playing the media
        mediaPlayer.play();
    }

    private void loadMainApplication() {
        Platform.runLater(() -> {
            try {
                Parent splashRoot = FXMLLoader.load(getClass().getResource("Main.fxml"));
                Scene splashScene = new Scene(splashRoot);
                Stage primaryStage = new Stage();

                Screen screen = Screen.getPrimary();
double screenWidth = screen.getBounds().getWidth();
                String css = getClass().getResource("css/application.css").toExternalForm();
splashScene.getStylesheets().add(css);

                // Set up primary stage for splash screen
                                      
                primaryStage.initStyle(StageStyle.TRANSPARENT);
                primaryStage.setMaximized(true);
                
                primaryStage.setScene(splashScene);
                                       primaryStage.setWidth(screenWidth);
                primaryStage.show();

                mainsplash.getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
        
        });
    }
}
