package org.demoproject.demogol;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

         Parent splashRoot = FXMLLoader.load(getClass().getResource("splashscreen.fxml"));
        Scene splashScene = new Scene(splashRoot);
//        splashScene.getStylesheets().add(getClass().getResource("css/dashbordempl.css").toExternalForm()); // Add this line
               primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setResizable(false);
        primaryStage.setScene(splashScene);
        primaryStage.show();

      
        

        // Center the primary stage on the screen
        double screenWidth = Screen.getPrimary().getVisualBounds().getWidth();
        double screenHeight = Screen.getPrimary().getVisualBounds().getHeight();
        primaryStage.setX((screenWidth - primaryStage.getWidth()) / 2);
        primaryStage.setY((screenHeight - primaryStage.getHeight()) / 2);

        initializeDatabase();
    }


    //intializeing database only create one time
    private void initializeDatabase() {

        if (!isTableExist()) {
            createtable.createTable();
        }
        if (!isTableExistFRAME()) {
            frametable.frameTable(); 
        }

        if (!isTableExistLENSE()) {
            lensetable.lenseTable(); 
        }
        
        if (!isTableExistGO()) {
            gotable.goTable(); 
        }
        if (!isTableExistCUSTOMER()) {
            customertable.customerTable(); 
        }
    }


    ////For database if table already creat it not create more //////////////////////
    private boolean isTableExist() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/test", "test", "")) {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "employeedata", null);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    

      
    private boolean isTableExistFRAME() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/frame", "frame", "")) {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "FRAMEDATA", null);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

      
    private boolean isTableExistLENSE() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/lense", "lense", "")) {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "LENSEDATA", null);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean isTableExistGO() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/goggles", "goggles", "")) {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "GODATA", null);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean isTableExistCUSTOMER() {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:./data/customer2", "customer2", "")) {
            DatabaseMetaData metaData = connection.getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "CUSTDATA2", null);
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    

    public static void main(String[] args) {
        launch(args);
    }
}

