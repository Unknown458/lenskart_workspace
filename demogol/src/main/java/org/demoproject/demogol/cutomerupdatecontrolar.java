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

public class cutomerupdatecontrolar {

    @FXML
    private MFXButton canbtn;

    @FXML
    private Text cname;

    @FXML
    private MFXTextField cuadd;

    @FXML
    private MFXDatePicker cudate;

    @FXML
    private MFXTextField cudiscount;

    @FXML
    private MFXTextField cuemail;

    @FXML
    private MFXTextField cufbrand;

    @FXML
    private MFXTextField cufcolor;

    @FXML
    private MFXTextField cufname;

    @FXML
    private MFXTextField cuframeno;

    @FXML
    private MFXTextField cufshape;

    @FXML
    private MFXTextField cuftype;

    @FXML
    private MFXTextField cugbrand;

    @FXML
    private MFXTextField cugcolor;

    @FXML
    private MFXTextField cugname;

    @FXML
    private MFXTextField cugtype;

    @FXML
    private MFXTextField culcolor;

    @FXML
    private MFXTextField culname;

    @FXML
    private MFXTextField culno;

    @FXML
    private MFXTextField cuname;

    @FXML
    private MFXButton cupdate;

    @FXML
    private MFXTextField cuphone;

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

    @FXML
    private Text zname1;

    @FXML
    private Text zname11;

    @FXML
    private Text zname111;

    @FXML
    private Text zname2;

    @FXML
    private Text zname21;

    @FXML
    private Text zname211;

    @FXML
    private Text zname2111;

    @FXML
    private Text zname22;

    @FXML
    private Text zname221;

    @FXML
    private Text zname2211;

    
    private cusdata data;
    private cusdata selectedData;


    @FXML
    void closebtn(ActionEvent event) {

        Stage stage = (Stage) canbtn.getScene().getWindow();
        stage.close();
    }

    public void setData(cusdata data) {
        this.data = data;
        this.selectedData = data;
        cuname.setText(data.getCname());
        cuemail.setText(data.getCmail());
        cuphone.setText(data.getCphone());
        cuadd.setText(data.getCadd());
        cudate.setValue(data.getCdate());
        cuframeno.setText(data.getCframe());
        cufname.setText(data.getCfname());
        cufcolor.setText(data.getCfcolor());
        cufshape.setText(data.getCfshape());
        cufbrand.setText(data.getCfbrand());
        cuftype.setText(data.getCftype());
        culname.setText(data.getClname());
        culcolor.setText(data.getClcolor());
        culno.setText(data.getClno());
        cugname.setText(data.getCgname());
        cugcolor.setText(data.getCgcolor());
        cugtype.setText(data.getCgtype());
        cugbrand.setText(data.getCgbrand());
        cudiscount.setText(String.valueOf(data.getCdiscus()));
    }


    @FXML
    void handuleupdate(ActionEvent event) {
        String newcname = cuname.getText();
        String newcemail = cuemail.getText();
        String newcphone = cuphone.getText();
        String newcadd = cuadd.getText();
        LocalDate newcdate = cudate.getValue();
        String newcframeno = cuframeno.getText();
        String newcfname = cufname.getText();
        String newcfcolor = cufcolor.getText();
        String newcfshape = cufshape.getText();
        String newcfbrand = cufbrand.getText();
        String newcftype = cuftype.getText();
        String newculname = culname.getText();
        String newculcolor = culcolor.getText();
        String newculno = culno.getText();
        String newcugname = cugname.getText();
        String newcugcolor = cugcolor.getText();
        String newcugtype = cugtype.getText();
        String newcugbrand = cugbrand.getText();
        String newcudiscount = cudiscount.getText();
    
        selectedData.setCname(newcname);
        selectedData.setCmail(newcemail);
        selectedData.setCphone(newcphone);
        selectedData.setCadd(newcadd);
        selectedData.setCdate(newcdate);
        selectedData.setCframe(newcframeno);
        selectedData.setCfname(newcfname);
        selectedData.setCfcolor(newcfcolor);
        selectedData.setCfshape(newcfshape);
        selectedData.setCfbrand(newcfbrand);
        selectedData.setCftype(newcftype);
        selectedData.setClname(newculname);
        selectedData.setClcolor(newculcolor);
        selectedData.setClno(newculno);
        selectedData.setCgname(newcugname);
        selectedData.setCgcolor(newcugcolor);
        selectedData.setCgtype(newcugtype);
        selectedData.setCgbrand(newcugbrand);
        selectedData.setCdiscus(Integer.parseInt(newcudiscount));
    
        int status = cusbase.update(selectedData);
    
        if (status > 0) {
            System.out.println("Update successful");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Update data Successfully");
            alert.showAndWait();
        } else {
            System.out.println("Update failed");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Update failed, Try again!");
            alert.showAndWait();
        }
    }

}
