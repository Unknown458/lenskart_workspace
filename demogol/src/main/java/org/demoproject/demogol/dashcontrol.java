package org.demoproject.demogol;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.utils.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import io.github.gleidson28.AvatarType;


import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import io.github.palexdev.materialfx.controls.MFXDatePicker;


import io.github.palexdev.materialfx.controls.MFXPasswordField;
import javafx.fxml.Initializable;
import io.github.gleidson28.GNAvatarView;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXCheckbox;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXFilterComboBox;
import io.github.palexdev.materialfx.controls.MFXPaginatedTableView;
import io.github.palexdev.materialfx.controls.MFXTableColumn;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import java.io.ByteArrayInputStream;

import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.scene.Node;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import org.h2.command.Prepared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class dashcontrol implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;



    ////

    @FXML
    private Text Crowded;

    @FXML
    private Pane INFO;

    @FXML
    private MFXCheckbox checkbox;

    @FXML
    private Pane MAINFORM;

    @FXML
    private Pane PERSONAL;

    @FXML
    private Pane SIGNUP;

    @FXML
    private TextArea address;

   

    @FXML
    private Text aname;

    @FXML
    private Pane apllicationformmm;

    @FXML
    private MFXButton appbtn;

    @FXML
    private MFXButton appbtnpp;

    @FXML
    private MFXButton appbtnss;

    @FXML
    private Text apptifomr;

    @FXML
    private Text apptifomrpp;

    @FXML
    private Text apptifomrss;

    @FXML
    private Text avtarte;

    @FXML
    private Pane body;

    @FXML
    private FontAwesomeIconView calicon;

    @FXML
    private MFXButton canbtn;

    @FXML
    private MFXButton canbtnpp;

    @FXML
    private MFXButton canbtnss;

    @FXML
    private FontAwesomeIconView cancel;

    @FXML
    private Pane cancelbtn;

    @FXML
    private TableColumn<ownerdata, String> emailtable;

    @FXML
    private TableColumn<ownerdata, String> locationtable;

    @FXML
private TableColumn<ownerdata, ImageView> avtartable;

    
    @FXML
    private TableView<ownerdata> maintable;

    
    @FXML
    private TableColumn<ownerdata, String> nametable;

    
    @FXML
    private TableColumn<ownerdata, String> passwordtable;

    @FXML
    private TableColumn<ownerdata, Integer> idtable;

    
    @FXML
    private TableColumn<ownerdata, String> usernametable;

    @FXML
    private Text cancelbtn1;

    @FXML
    private MFXButton changebtn;

    @FXML
    private MFXTextField city;

    @FXML
    private Button close;

    @FXML
    private Text cname;

    @FXML
    private TableColumn<ownerdata, Void> viewColumn;

    @FXML
    private Text cname2;

    @FXML
    private FontAwesomeIconView comicon;

    @FXML
    private MFXFilterComboBox<String> country;

    @FXML
    private Text crypter;

    @FXML
    private MFXButton dashboard;

    @FXML
    private MFXButton dashboard1;

    @FXML
    private Button dashboard11;

    @FXML
    private Button dashboard111;

    @FXML
    private Button dashboard1111;

    @FXML
    private Text dashtext;

    @FXML
    private Text dashtext1;

    @FXML
    private Text dashtext11;

    @FXML
    private Text dashtext111;

    @FXML
    private Text dashtext1111;

    @FXML
    private Text degree;

    @FXML
    private MFXTextField degreet;

    @FXML
    private Text depart;

    @FXML
    private MFXComboBox<String> department;

    @FXML
    private Text dob;

    @FXML
    private MFXDatePicker dobtf;

    @FXML
    private FontAwesomeIconView docicon;

    @FXML
    private Text dribble;

    @FXML
    private MFXTextField email;

    @FXML
    private FontAwesomeIconView empicon;

    @FXML
    private Text emptext;

    @FXML
    private Text emptext1;

    @FXML
    private Text emptext11;

    @FXML
    private Text emptitle;

    @FXML
    private Text ename;

    @FXML
    private TextFlow faem;

    @FXML
    private Text far;

    @FXML
    private MFXButton finbtn;

    @FXML
    private MFXButton finbtnpp;

    @FXML
    private MFXButton finbtnss;

    @FXML
    private Pane firstpage;

    @FXML
    private Text fname;

    @FXML
    private Text formtab1;

    @FXML
    private MFXTextField fullname;

    @FXML
    private Text fullsm;

    @FXML
    private Text gender;

    @FXML
    private MFXComboBox<String> gendertf;

    @FXML
    private FontAwesomeIconView icon;

    @FXML
    private ImageView img;


    @FXML
    private GNAvatarView avtar;


    @FXML
    private MFXTextField inputsearch;

    @FXML
    private MFXButton letbtn;

    @FXML
    private MFXButton letbtn1;

    @FXML
    private Text letntext;

    @FXML
    private Text letntext1;

    @FXML
    private MFXButton logbtn;

    @FXML
    private MFXButton logbtnpp;

    @FXML
    private MFXButton logbtnss;

    @FXML
    private MFXButton logoutbtn;

 

    @FXML
    private Button maximize;

    @FXML
    private Pane mcontain;

    @FXML
    private Button min;

    @FXML
    private Pane mscontain;

    

    @FXML
    private Pane navadd;

    @FXML
    private Text navowner;

    @FXML
    private MFXButton newwindow;

    @FXML
    private MFXButton nextbtn;

    @FXML
    private MFXButton nextbtnpp;

    @FXML
    private MFXButton nextbtnss;

    @FXML
    private FontAwesomeIconView npticon;

    @FXML
    private Text partsm;

    @FXML
    private MFXPasswordField passwordtf;

    @FXML
    private MFXTextField phoneno;

    @FXML
    private Text pname;

    @FXML
    private MFXButton preview;

    @FXML
    private MFXButton previewpp;

    @FXML
    private MFXButton previewss;

    @FXML
    private Text report;

    @FXML
    private Text salary;

    @FXML
    private MFXTextField salarytf;

    @FXML
    private Pane search;

    @FXML
    private VBox sidebody;

    @FXML
    private MFXButton signsubmit;

    @FXML
    private Text signup;

    @FXML
    private Text smtextc;

    @FXML
    private Text smtextc1;

    @FXML
    private Text supportt;

    @FXML
    private Text tab2;

    @FXML
    private Text tab3;

    @FXML
    private Text tab4;

    @FXML
    private Text tab5;

    @FXML
    private Text tenko;

    @FXML
    private Text term;

    @FXML
    private HBox titlebar;

    @FXML
    private MFXTextField usernametf;

    @FXML
    private Pane viewemp;

    @FXML
    private Pane viewemp1;

    @FXML
    private Text worktime;

    @FXML
    private MFXComboBox<String> worktimetf;

    @FXML
    private MFXTextField zipcode;

    @FXML
    private Text zname;

/////////////////////////////////////////////////////////////////////////////////////////////


@FXML
    private void addimage() {
        // Create a file chooser
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose Image File");
        
        // Set the file chooser to filter only image files
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Image files (*.png, *.jpg, *.jpeg)", "*.png", "*.jpg", "*.jpeg");
        fileChooser.getExtensionFilters().add(extFilter);
        
        // Show the file chooser dialog
        File selectedFile = fileChooser.showOpenDialog(null);
        
        // If a file was selected, load and display it in the GNavtarView
        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString());
            avtar.setImage(image);
        }
    }







///Dtabaseconection////////////////////////////////////////////////////////////


@FXML
private void submit(ActionEvent event) {
    if (!checkbox.isSelected()) {
        // Show an alert if the user hasn't accepted the conditions
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(null);
        alert.setContentText("Please accept the conditions before submitting.");
        alert.showAndWait();
        return; // Exit the method without submitting the form
    }

    byte[] image = getImageBytes();
    String fname = fullname.getText();
    String mail = email.getText();
    String phone = phoneno.getText();
    String countryd = country.getSelectionModel().getSelectedItem();
    String zipno = zipcode.getText();
    String cityd = city.getText();
    String add = address.getText();
    String degree = degreet.getText();
    String depart = department.getText();
    String gender = gendertf.getSelectionModel().getSelectedItem();
    LocalDate selectedDate = dobtf.getValue();
    String salary = salarytf.getText();
    String worktime = worktimetf.getSelectionModel().getSelectedItem();
    String username = usernametf.getText();
    String password = passwordtf.getText();

    // Create a new ownerdata object
    ownerdata newData = new ownerdata(image, fname, mail, phone, countryd, zipno, cityd, add, degree, depart, gender, selectedDate, salary, worktime, username, password);

    // Save the new data to the database
    int status = ownerbase.save(newData);

    if (status > 0) {
        // Show success message if data is submitted successfully
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Submitted successfully");
        alert.showAndWait();

        // Clear the form fields after successful submission
        fullname.clear();
        email.clear();
        phoneno.clear();
        country.setValue(null);
        zipcode.clear();
        city.clear();
        address.clear();
        degreet.clear();
        department.setValue(null);
        gendertf.setValue(null);
        dobtf.setValue(null);
        salarytf.clear();
        worktimetf.setValue(null);

        usernametf.clear();
        passwordtf.clear();
        // Clear other fields as well...
        checkbox.setSelected(false);
        // Clear the table view
        maintable.getItems().clear();

        // Retrieve the updated data from the database
        List<ownerdata> updatedData = ownerbase.getAllOwnerData();


        
        // Add the updated data to the table view
        maintable.getItems().addAll(updatedData);
    } else {
        // Show error message if submission fails
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Failed to submit data. Please try again.");
        alert.showAndWait();
    }
}

private byte[] getImageBytes() {
    if (avtar.getImage() != null) {
        try {
            // Convert the JavaFX Image to a buffered image
            BufferedImage bufferedImage = SwingFXUtils.fromFXImage(avtar.getImage(), null);

            // Convert the buffered image to a byte array
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            baos.flush();
            byte[] imageBytes = baos.toByteArray();
            baos.close();

            return imageBytes;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    return null; // Return null if no image is selected
}




    @FXML
    void logindetail1(ActionEvent event) {
        PERSONAL.toFront();
    }
    @FXML
    void logindetail2(ActionEvent event) {
        PERSONAL.toFront();
    }

    @FXML
    void finish1(ActionEvent event) {
        SIGNUP.toFront();
    }
    @FXML
    void finsh2(ActionEvent event) {
        SIGNUP.toFront();
    }

    @FXML
    void app1form(ActionEvent event) {
        MAINFORM.toFront();
    }
    
    @FXML
    void app1form1(ActionEvent event) {
        MAINFORM.toFront();
    }

    @FXML
    void next1(ActionEvent event) {
        PERSONAL.toFront();
    }
    @FXML
    void next2(ActionEvent event) {
        SIGNUP.toFront();
    }


   

    @FXML
    void closebtn(ActionEvent event) {
Stage stage= (Stage) close.getScene().getWindow();
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
    void window(ActionEvent event) {
        // try {
        //     FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/updateemp.fxml"));
        //     Parent root1 = (Parent) fxmlLoader.load();
            
        //     // Load CSS file if it exists
        //     URL cssUrl = getClass().getResource("css/updateviewemp.css");
           
        //         String css = cssUrl.toExternalForm();
        //         root1.getStylesheets().add(css);
           
        //     Stage stage = new Stage();
        //     stage.setScene(new Scene(root1));  
        //     stage.show();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }


    @FXML
    void logout(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to Log out?");
    
        // Show the confirmation dialog and wait for user input
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
               
        try{
            root = FXMLLoader.load(getClass().getResource("firstmain.fxml"));
            root.getStylesheets().add(getClass().getResource("css/firstmain.css").toExternalForm());
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
        });


    }


    

  

    @FXML
    void dash(ActionEvent event){
        firstpage.toFront();
        dashboard.setStyle("-fx-background-color: #fff;");
               docicon.setFill(Color.web("#984aff"));
        empicon.setFill(Color.web("#9a9595"));
        // dashtext1.setStyle("");
        dashtext.setStyle("-fx-fill: black;");
                dashboard1.setStyle("-fx-background-color:#e5e7ed;");
            }


            @FXML
            void emp(ActionEvent event){
                MAINFORM.toFront();
                dashboard.setStyle("-fx-background-color:#e5e7ed;");
                // dashtext.setStyle("");
                dashtext1.setStyle("-fx-fill: black;");
                empicon.setFill(Color.web("#984aff"));
                docicon.setFill(Color.web("#9a9595"));
                dashboard1.setStyle("-fx-background-color: #fff;");
                    }


                    @FXML
                    void addemp(ActionEvent event) {
                        MAINFORM.toFront();
                    }

                    @FXML
                    void viewemp(ActionEvent event) {
                        viewemp.toFront();
                    }



                  

                    // private void openUpdateScene(ownerdata data) {
                    //     try {
                    //         // Load the FXML file for the update scene
                    //         FXMLLoader loader = new FXMLLoader(getClass().getResource("updateScene.fxml"));
                    //         Parent root = loader.load();
                    
                    //         // Access the controller of the update scene
                    //         UpdateController controller = loader.getController();
                    
                    //         // Pass the ownerdata object to the controller
                    //         controller.setData(data);
                    
                    //         // Create a new stage for the update scene
                    //         Stage stage = new Stage();
                    //         stage.setScene(new Scene(root));
                    //         stage.show();
                    //     } catch (IOException e) {
                    //         e.printStackTrace();
                    //     }
                    // }
                    
  

                    

    private List<Image> images;
    private int currentIndex = 0;
    private int slideDurationSeconds = 5; // Default slide duration in seconds




    List<ownerdata> listm;
    int index = -1;
    Connection con = null;
ResultSet rs = null;
PreparedStatement ps = null;




    ////intialization//////////////////////////////////////////////////////

    @Override
    public void initialize(URL location, ResourceBundle resources) {


      





idtable.setCellValueFactory(new PropertyValueFactory<ownerdata,Integer>("id"));

avtartable.setCellValueFactory(param -> {
    ImageView imageView = new ImageView();
     
    // Get the ownerdata object associated with the row
    ownerdata data = param.getValue();
    byte[] imageBytes = data.getImage();
    if (imageBytes != null && imageBytes.length > 0) {
        // Convert byte array to image and set it in the ImageView
        Image image = new Image(new ByteArrayInputStream(imageBytes));
        imageView.setImage(image);
        
        // Set the dimensions of the ImageView
        imageView.setFitWidth(30); // Set your desired width
        imageView.setFitHeight(30); // Set your desired height
        
        // Create a clip in the shape of a circle
        Circle clip = new Circle();
        
        // Set the radius of the circle clip to half of the ImageView dimensions
        double radius = Math.min(imageView.getFitWidth(), imageView.getFitHeight()) / 2;
        clip.setRadius(radius);
        
        // Center the circle clip within the ImageView
        clip.centerXProperty().bind(imageView.fitWidthProperty().divide(2));
        clip.centerYProperty().bind(imageView.fitHeightProperty().divide(2));
        
        imageView.setClip(clip);
    } else {
        // Set a default image or clear the ImageView
        imageView.setImage(null);
    }
    return new SimpleObjectProperty<>(imageView);
});

nametable.setCellValueFactory(new PropertyValueFactory<ownerdata,String>("fname"));
emailtable.setCellValueFactory(new PropertyValueFactory<ownerdata,String>("mail"));

locationtable.setCellValueFactory(new PropertyValueFactory<ownerdata,String>("countryd"));

usernametable.setCellValueFactory(new PropertyValueFactory<ownerdata,String>("username"));

passwordtable.setCellValueFactory(new PropertyValueFactory<ownerdata,String>("password"));
        

listm = ownerbase.getAllOwnerData();

maintable.getItems().setAll(listm);

viewColumn.setCellFactory(param -> new TableCell<>() {
    private final MFXButton viewButton = new MFXButton("View");
    private final MFXButton deleteButton = new MFXButton("Delete");

    {

        viewButton.setId("viewButton");
        deleteButton.setId("deleteButton");
        // Handle view button click event
        viewButton.setOnAction(event -> {
            // Get the ownerdata object associated with the clicked row
            ownerdata data = getTableView().getItems().get(getIndex());

            int ownerId = data.getId(); 
            
            // Populate the fields in the FXML file with the retrieved owner's information
            FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/updateemp.fxml")); // Replace "viewOwner.fxml" with the name of your FXML file
            try {
                Parent root = loader.load();
                // Access the controller of the viewOwner.fxml file
                updateempcontrolar controller = loader.getController();
                // Call a method in the controller to populate the fields with owner's information
                controller.populateFields(data); // Pass the ownerdata object to the method
                // Create a new scene with the loaded FXML and show it
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        // Handle delete button click event
        deleteButton.setOnAction(event -> {
            Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
            confirmationAlert.setTitle("Confirmation");
            confirmationAlert.setHeaderText("Delete Data");
            confirmationAlert.setContentText("Are you sure you want to delete this data?");
        
            Optional<ButtonType> result = confirmationAlert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                // User confirmed the deletion
                ownerdata data = getTableView().getItems().get(getIndex());
                int ownerId = data.getId();
        
                // Call the deleteOwnerData method from ownerbase to delete the record
                int status = ownerbase.deleteOwnerData(ownerId);
        
                if (status > 0) {
                    // Record deleted successfully
                    // Remove the deleted record from the table view
                    getTableView().getItems().remove(data);
                    System.out.println("Record deleted successfully");
                } else {
                    // Failed to delete the record
                    System.out.println("Failed to delete the record");
                }
            }
        });
    }


   




    @Override
    protected void updateItem(Void item, boolean empty) {
        super.updateItem(item, empty);
        if (empty) {
            setGraphic(null);
        } else {
           
            HBox buttonContainer = new HBox(viewButton, deleteButton);
            buttonContainer.setSpacing(5); // Adjust the spacing between buttons
            setGraphic(buttonContainer); // Place buttons in an HBox
        }
    }
});

        country.getItems().addAll("Afghanistan",
        "Albania","Algeria","Andorra","Angola","Australia","Austria","Iceland","India","Indonesia"
        );

        department.getItems().addAll("Frames Department","Sunglasses Department","Lens Department","Accessories Department","Optical Supplies Department" ,"Other");

        gendertf.getItems().addAll("Male","Female");


        worktimetf.getItems().addAll("9am to 6pm","10am to 8pm");


        images = new ArrayList<>();
        images.add(new Image(getClass().getResourceAsStream("image/New Project (15).png")));
        images.add(new Image(getClass().getResourceAsStream("image/banner.jpeg")));

        images.add(new Image(getClass().getResourceAsStream("image/wide.jpeg")));
        images.add(new Image(getClass().getResourceAsStream("image/wide3.jpeg")));
        // Add more images as needed

        // Create ImageView
        ImageView imageView = new ImageView();
        imageView.setFitWidth(912); // Set width as needed
        imageView.setFitHeight(227); // Set height as needed
        imageView.setId("banner");
        mscontain.getChildren().add(imageView);
 
        // Start the image slider animation
        startImageSlider(imageView);
        applyBorderRadiusToImageView(imageView);





    }

   
@FXML
void refresh(MouseEvent event) {
     // Clear the existing data in the list
     listm.clear();

     // Add the new updated data to the list
     listm.addAll(ownerbase.getAllOwnerData());
 
     // Update the TableView with the new data
     maintable.getItems().setAll(listm);
}









    private void startImageSlider(ImageView imageView) {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(slideDurationSeconds), event -> {
            // Increment index
            currentIndex = (currentIndex + 1) % images.size();
            // Update ImageView with the next image
            imageView.setImage(images.get(currentIndex));
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

      private void applyBorderRadiusToImageView( ImageView imageView) {
        // Create a rectangle with rounded corners to act as a clipping mask
        Rectangle clip = new Rectangle(imageView.getFitWidth(), imageView.getFitHeight());
        clip.setArcWidth(30); // Set the horizontal arc radius
        clip.setArcHeight(30); // Set the vertical arc radius

        // Apply the clipping mask to the ImageView
        imageView.setClip(clip);
    }
    
}





  