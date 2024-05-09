package org.demoproject.demogol;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import io.github.gleidson28.GNAvatarView;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXDatePicker;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXTextField;
import io.github.palexdev.materialfx.utils.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class updateempcontrolar {

    @FXML
    private TextArea addresstf;

    @FXML
    private GNAvatarView avtarupdate;

    @FXML
    private MFXButton canbtn;

    @FXML
    private MFXButton changebtn;

    @FXML
    private MFXTextField citytf;

    @FXML
    private MFXTextField countrytf;

    @FXML
    private MFXTextField degreetf;

    @FXML
    private MFXTextField departmentf;

    @FXML
    private MFXDatePicker dobtf;

    @FXML
    private MFXTextField emailtf;

    @FXML
    private MFXTextField nametf;

    @FXML
    private MFXButton nextbtn;

    @FXML
    private MFXPasswordField passowrdtf;
    
    @FXML
private TableView<ownerdata> maintable;

    @FXML
    private MFXTextField phonetf;

    @FXML
    private MFXTextField gendertf;

    @FXML
    private MFXTextField salarytf;

    @FXML
    private MFXTextField worktimetf;

    @FXML
    private MFXTextField ziopcodetf;

    private ownerdata currentOwnerData; // Store the current owner data
    private List<ownerdata> listm; 


    @FXML
    private void updateimage() {
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
            avtarupdate.setImage(image);
        }
    }


    
    @FXML
    void closebtn(ActionEvent event) {
        Stage stage= (Stage) canbtn.getScene().getWindow();
        stage.close();
    }


    public void populateFields(ownerdata data) {
        // Populate the fields with the owner's information
        nametf.setText(data.getFname());
        emailtf.setText(data.getMail());
        phonetf.setText(data.getPhone());
        countrytf.setText(data.getCountryd());
        ziopcodetf.setText(data.getZipno());
        citytf.setText(data.getCityd()); 
        addresstf.setText(data.getAdd());
        degreetf.setText(data.getDegree());
        departmentf.setText(data.getDepart());
        gendertf.setText(data.getGender());
        dobtf.setValue(data.getSelectedDate());
        salarytf.setText(data.getSalary());
        worktimetf.setText(data.getWorktime());
        passowrdtf.setText(data.getPassword());

        // Populate the avatar image
        byte[] imageData = data.getImage();
        if (imageData != null && imageData.length > 0) {
            Image image = new Image(new ByteArrayInputStream(imageData));
            avtarupdate.setImage(image);
        }
        
        // Store the current owner data
        currentOwnerData = data;


        
    }

  


    @FXML
    void handuleupdate(ActionEvent event) {
        // Get the modified values from the text fields, date picker, and password field
        String newName = nametf.getText();
        String newEmail = emailtf.getText();
        String newPhone = phonetf.getText();
        String newCountry = countrytf.getText();
        String newZipcode = ziopcodetf.getText();
        String newCity = citytf.getText();
        String newAddress = addresstf.getText();
        String newDegree = degreetf.getText();
        String newDepartment = departmentf.getText();
        String newgender = gendertf.getText();
        LocalDate newDOB = dobtf.getValue();
        String newSalary = salarytf.getText();
        String newWorktime = worktimetf.getText();
        String newPassword = passowrdtf.getText();

        // Create a new ownerdata object with the updated values
        ownerdata updatedOwnerData = new ownerdata();
        updatedOwnerData.setId(currentOwnerData.getId()); // Set the ID to identify the record in the database
        updatedOwnerData.setFname(newName);
        updatedOwnerData.setMail(newEmail);
        updatedOwnerData.setPhone(newPhone);
        updatedOwnerData.setCountryd(newCountry);
        updatedOwnerData.setZipno(newZipcode);
        updatedOwnerData.setCityd(newCity);
        updatedOwnerData.setAdd(newAddress);
        updatedOwnerData.setDegree(newDegree);
        updatedOwnerData.setDepart(newDepartment);
        updatedOwnerData.setGender(newgender);
        updatedOwnerData.setSelectedDate(newDOB);
        updatedOwnerData.setSalary(newSalary);
        updatedOwnerData.setWorktime(newWorktime);
        updatedOwnerData.setPassword(newPassword);

        // Update the avatar image if it has been changed
        Image updatedImage = avtarupdate.getImage();
        if (updatedImage != null) {
            // Convert the Image to byte array
            // You need to implement this conversion method based on your requirements
            byte[] imageBytes = convertImageToByteArray(updatedImage);
            updatedOwnerData.setImage(imageBytes);
        }

        // Update the database with the modified owner data
        int status = ownerbase.update(updatedOwnerData); // You need to implement the update method in ownerbase class

        if (status > 0) {
            // Show success message if update is successful
            // You can show an alert or any other message here
            System.out.println("Update successful");
        } else {
            // Show error message if update fails
            // You can show an alert or any other message here
            System.out.println("Update failed");
        }
    }


    public void reloadDataFromDatabase() {
        listm = ownerbase.getAllOwnerData();
        maintable.getItems().setAll(listm);
    }

    

    // Method to convert Image to byte array
    private byte[] convertImageToByteArray(Image image) {
        try {
            // Convert the JavaFX Image to a buffered image
            BufferedImage bufferedImage = SwingFXUtils.fromFXImage(avtarupdate.getImage(), null);

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
        return null;
    }
}
