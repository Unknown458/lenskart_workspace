package org.demoproject.demogol;

import java.time.LocalDate;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXDatePicker;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class goupdatecontrolar {

    @FXML
    private MFXButton canbtn;

    @FXML
    private Text cname;

    @FXML
    private Text degree;

    @FXML
    private Text depart;

    @FXML
    private Text dob;

    @FXML
    private Text ename;

    @FXML
    private Text fname;

    @FXML
    private MFXTextField funame;

    @FXML
    private MFXButton fupdate;

    @FXML
    private Text gender;

    @FXML
    private MFXTextField gubrand;

    @FXML
    private MFXTextField gucolor;

    @FXML
    private MFXDatePicker gudate;

    @FXML
    private MFXTextField guno;

    @FXML
    private MFXTextField guprice;

    @FXML
    private MFXTextField guquantity;

    @FXML
    private MFXTextField gutype;

    @FXML
    private Text heading;

    @FXML
    private Pane mainviewcontain;

    @FXML
    private MFXButton nextbtn;

    @FXML
    private Text pname;


    private GoData data;
    private GoData selectedData;

    @FXML
    void closebtn(ActionEvent event) {
        Stage stage = (Stage) canbtn.getScene().getWindow();
        stage.close();
    }


    public void setData(GoData data) {
        this.data = data;
        this.selectedData = data;
        funame.setText(data.getGname());
        guno.setText(data.getGnum());
        gucolor.setText(data.getGcolor());
        gutype.setText(data.getGtype());
        guquantity.setText(data.getGquantity());
        gubrand.setText(data.getGbrand());
        guprice.setText(String.valueOf(data.getGprice()));
        gudate.setValue(data.getGdate());
    }


    @FXML
    void handuleupdate(ActionEvent event) {
        String newgname = funame.getText();
        String newgno = guno.getText();
        String newgcolor = gucolor.getText();
        String newgtype = gutype.getText();
        String newgquantity = guquantity.getText();
        String newgbrand = gubrand.getText();
        String newgprice = guprice.getText();
        LocalDate newgdate = gudate.getValue();

        selectedData.setGname(newgname);
        selectedData.setGnum(newgno);
        selectedData.setGcolor(newgcolor);
        selectedData.setGtype(newgtype);
        selectedData.setGquantity(newgquantity);
        selectedData.setGbrand(newgbrand);
        selectedData.setGprice(Integer.parseInt(guprice.getText()));
        selectedData.setGdate(newgdate);

        int status = gobase.update(data);

        if (status > 0) {
            System.out.println("Update successful");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText(" Update data Successfully");
            alert.showAndWait();
        } else {

            System.out.println("Update successful");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText(" Update failed, Try agian!");
            alert.showAndWait();
            System.out.println("Update failed");
        }
    }
    }


