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

public class lenseupdatecontrolar {

    @FXML
    private MFXButton canbtn;

    @FXML
    private Text degree;

    @FXML
    private Text depart;

    @FXML
    private Text ename;

    @FXML
    private Text fname;

    @FXML
    private Text heading;

    @FXML
    private MFXTextField lucolor;

    @FXML
    private MFXDatePicker ludate;

    @FXML
    private MFXTextField lulenseno;

    @FXML
    private MFXTextField luname;

    @FXML
    private MFXTextField luprice;

    @FXML
    private MFXButton luupdate;

    @FXML
    private Pane mainviewcontain;

    @FXML
    private MFXButton nextbtn;

    @FXML
    private Text pname;


    private LensData data;
    private LensData selectedData;

    @FXML
    void closebtn(ActionEvent event) {
        Stage stage = (Stage) canbtn.getScene().getWindow();
        stage.close();
    }


    
    public void setData(LensData data) {
        this.data = data;
        this.selectedData = data;
        luname.setText(data.getLname());
        lucolor.setText(data.getLcolor());
        lulenseno.setText(data.getLnum());
                ludate.setValue(data.getLdate());
                luprice.setText(String.valueOf(data.getLprice()));
    }

    @FXML
    void handuleupdate(ActionEvent event) {
        String newlname = luname.getText();
        String newlcolor = lucolor.getText();
        String newlno = lulenseno.getText();
  LocalDate newldate = ludate.getValue();
        String newlprice = luprice.getText();

        selectedData.setLname(newlname);
        selectedData.setLcolor(newlcolor);
        selectedData.setLnum(newlno);
             selectedData.setLdate(newldate);
        selectedData.setLprice(Integer.parseInt(luprice.getText()));

        int status = lensbase.update(data);

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
