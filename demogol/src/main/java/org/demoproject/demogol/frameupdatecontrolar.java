package org.demoproject.demogol;

import java.io.IOException;
import java.time.LocalDate;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXDatePicker;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class frameupdatecontrolar {

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
    private MFXTextField fubrand;

    @FXML
    private MFXTextField fucolor;

    @FXML
    private MFXDatePicker fudate;

    @FXML
    private MFXTextField frontname;

    @FXML
    private MFXTextField funo;

    @FXML
    private MFXButton fupdate;

    @FXML
    private MFXTextField fuprice;

    @FXML
    private MFXTextField fuquantity;

    @FXML
    private MFXTextField fushape;

    @FXML
    private MFXTextField futype;

    @FXML
    private Text gender;

    @FXML
    private Text heading;

    @FXML
    private Pane mainviewcontain;

    @FXML
    private MFXButton nextbtn;

    @FXML
    private Text pname;

    @FXML
    private Text zname;

    private prodata data;
    private prodata selectedData;

    @FXML
    void closebtn(ActionEvent event) {


                Stage stage = (Stage) canbtn.getScene().getWindow();
      stage.close();
               
    }

    public void setData(prodata data) {
        this.data = data;
        this.selectedData = data;
        frontname.setText(data.getPname());
        funo.setText(data.getPno());
        fucolor.setText(data.getPcolor());
        fushape.setText(data.getPshape());
        fuquantity.setText(data.getPqun());
        fubrand.setText(data.getPbrand());
        futype.setText(data.getPtype());
        fudate.setValue(data.getPpro1date());
        fuprice.setText(String.valueOf(data.getPgqun11()));
    }

    @FXML
    void handuleupdate(ActionEvent event) {
        String newfname = frontname.getText();
        String newfno = funo.getText();
        String newfcolor = fucolor.getText();
        String newfshape = fushape.getText();
        String newfquantity = fuquantity.getText();
        String newfbrand = fubrand.getText();
        String newftype = futype.getText();
        LocalDate newfdate = fudate.getValue();
        String newfprice = fuprice.getText();

        selectedData.setPname(newfname);
        selectedData.setPno(newfno);
        selectedData.setPcolor(newfcolor);
        selectedData.setPshape(newfshape);
        selectedData.setPqun(newfquantity);
        selectedData.setPbrand(newfbrand);
        selectedData.setPtype(newftype);
        selectedData.setPpro1date(newfdate);
        selectedData.setPgqun11(Integer.parseInt(fuprice.getText()));

        int status = empbase.update(data);

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