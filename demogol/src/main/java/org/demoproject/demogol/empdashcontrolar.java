package org.demoproject.demogol;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javafx.print.PrinterJob;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import java.sql.Connection;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXComboBox;
import io.github.palexdev.materialfx.controls.MFXDatePicker;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.print.Printer;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class empdashcontrolar implements Initializable {



    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Text Crowded;

    @FXML
    private MFXButton mfxframeview;
    
    @FXML
    private Pane viewlensetable;

    @FXML
    private MFXTextField lvcolor;

    @FXML
    private MFXComboBox<String> lvlensename;

    @FXML
    private Pane lvlenseno;

    @FXML
    private MFXTextField fvbrand;

    @FXML
    private MFXTextField fvcolor;

    @FXML
    private MFXTextField fvname;

    @FXML
    private MFXTextField fvshape;

    @FXML
    private Pane cuspart1;

    @FXML
    private Pane customerp2;

    @FXML
    private MFXTextField fvtype;

    @FXML
    private MFXTextField ggbrand;

    @FXML
    private MFXTextField ggcolor;

    @FXML
    private MFXTextField ggdiscount;

    @FXML
    private MFXComboBox<String> ggname;

    @FXML
    private MFXTextField ggtype;


    @FXML
    private Pane viewgoglestable;
    @FXML
    private MFXButton mfxgoodles;
    @FXML
    private Pane viewallproducts;

    @FXML
    private MFXTextField gqun1;

    @FXML
    private MFXTextField gqun11;

    @FXML
    private Pane Goggles;

    @FXML
    private Pane MAINFORM;

    @FXML
    private Pane MAINFORM1;

    @FXML
    private Pane MAINFORM2;

    @FXML
    private Pane addcustomer;

    @FXML
    private MFXButton addproductbtn;

    @FXML
    private Pane propanemain;

    @FXML
    private Text addrecname;

    @FXML
    private MFXButton appbtnemp;

    @FXML
    private MFXButton appbtnemp1;

    @FXML
    private MFXButton appbtnemp2;

    @FXML
    private MFXButton appbtnemp21m;
    @FXML
    private MFXButton appbtnemp21;
    @FXML
    private MFXButton appbtnemp211;

    @FXML
    private MFXButton appbtnemp2111;

    @FXML
    private Pane body;

    @FXML
    private MFXTextField brand;

    @FXML
    private Pane viewcustable;

    @FXML
    private Pane viewprotable;

    @FXML
    private Text brand1;

    @FXML
    private Text brand2;

    @FXML
    private Text brand21;

    @FXML
    private FontAwesomeIconView calicon;

    @FXML
    private MFXButton canbtnemp;

    @FXML
    private MFXButton canbtnemp1;

    @FXML
    private MFXButton canbtnemp2;

    @FXML
    private MFXButton canbtnemp21;

    @FXML
    private MFXButton mfxlenseproduft;

    @FXML
    private FontAwesomeIconView cancel;

    @FXML
    private Pane cancelbtn;

    @FXML
    private Text cancelbtn1;

    @FXML
    private Pane centerpane;

    @FXML
    private Button close;

    @FXML
    private MFXTextField color;

    @FXML
    private FontAwesomeIconView comicon;

    @FXML
    private Text crypter;

    @FXML
    private Text curdate;

    @FXML
    private Text curnom;

    @FXML
    private Text cus1;

    @FXML
    private MFXTextField cusadd;

    
    @FXML
    private MFXTextField lvprice;
    @FXML
    private MFXTextField fvprice;

    @FXML
    private Text cusadd5;

    @FXML
    private MFXComboBox<String> cusbrand;

    @FXML
    private MFXComboBox<String> cuscolor;

    @FXML
    private MFXDatePicker cusdate;

    @FXML
    private MFXTextField cusdiscount;

    @FXML
    private MFXComboBox<String> cusframename;

    
    @FXML
    private MFXTextField rridnew;

    @FXML
    private MFXComboBox<String> cusframno;

    @FXML
    private MFXComboBox<String> cuslens;

    @FXML
    private MFXComboBox<String> cuslenseno;

    @FXML
    private MFXTextField cusmail;

    @FXML
    private Text cusname;

    @FXML
    private MFXTextField cusno;

    @FXML
    private MFXTextField cusquantity;

    @FXML
    private Text cusstate;

    @FXML
    private MFXTextField custotal;

    @FXML
    private MFXComboBox<String> custype;

    @FXML
    private Button dashboard;

    @FXML
    private Button dashboard1;

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
    private MFXDatePicker pro1date;

    @FXML
    private MFXDatePicker lensdate;

    @FXML
    private Text date1;

    @FXML
    private Text date2;

    @FXML
    private MFXTextField ggprice;

    @FXML
    private Text date21;

    @FXML
    private Text datename;

    @FXML
    private FontAwesomeIconView docicon;

    @FXML
    private Text dribble;

    @FXML
    private Text dudate;

    @FXML
    private Text duenom;

    @FXML
    private FontAwesomeIconView empicon;

    @FXML
    private Text emptext;

    @FXML
    private Text emptext11;

    @FXML
    private Text emptext2;

    @FXML
    private Text emptext3;

    @FXML
    private Text emptext4;

    @FXML
    private Text emptext5;

    @FXML
    private Text emptitle;

    @FXML
    private Text emptitle1;

    @FXML
    private Text far;

    @FXML
    private Text fcolor1;

    @FXML
    private Text fcolor2;

    @FXML
    private Text fcolor21;

    @FXML
    private Pane firstpage;

    @FXML
    private Text fnameemp1;

    @FXML
    private Text fnameemp2;

    @FXML
    private Text fnameemp21;

    @FXML
    private Text fno1;

    @FXML
    private Text fno2;

    @FXML
    private Text fno21;

    @FXML
    private MFXTextField foname;

    @FXML
    private Text framename;

    @FXML
    private Text framenoemp;

    @FXML
    private Pane framepro1;

    @FXML
    private Pane framepro11;

    @FXML
    private Text fshape1;

    @FXML
    private Text fshape2;

    @FXML
    private Text fullsm;

    @FXML
    private Text fullsm1;

    @FXML
    private MFXTextField gobrand;

    @FXML
    private MFXDatePicker godate;

    @FXML
    private MFXTextField gogcolor;

    @FXML
    private MFXTextField gogno;

    @FXML
    private MFXTextField gogtypt;

    @FXML
    private MFXTextField gqun;

    @FXML
    private Text hadd1;

    @FXML
    private Text hadd2;

    @FXML
    private Text hadd3;

    @FXML
    private Text hadd4;

    @FXML
    private Text hadd5;

    @FXML
    private Text holdername;

    @FXML
    private FontAwesomeIconView icon;

    @FXML
    private ImageView img;

    @FXML
    private MFXTextField inputsearch;

    @FXML
    private Text lense;

    @FXML
    private Text lense1;

    @FXML
    private Text lensecolor;

    @FXML
    private Text lensecolor1;

    @FXML
    private Text lenseno;

    @FXML
    private Text lenseno1;

    @FXML
    private Text lenseno3;

    @FXML
    private Pane lensepro;

    @FXML
    private MFXButton logoutbtn;

    @FXML
    private Button maximize;

    @FXML
    private MFXButton mfxaddcustomer;

    @FXML
    private MFXButton mfxreci;

    @FXML
    private MFXButton mfxviewcustomer;

    @FXML
    private Button min;

    @FXML
    private Pane mscontain;

    @FXML
    private MFXTextField namef;

    @FXML
    private Pane navadd;

    @FXML
    private Text navowner;

    @FXML
    private MFXButton nextbtnemp;

    @FXML
    private MFXButton nextbtnemp1;

    @FXML
    private MFXButton nextbtnemp2;

    @FXML
    private MFXButton nextbtnemp21;

    @FXML
    private MFXTextField no;

    @FXML
    private Text notice;

    @FXML
    private FontAwesomeIconView npticon;

    @FXML
    private Text partsm;

    @FXML
    private Text partsm1;

    @FXML
    private MFXButton previewemp;

    @FXML
    private MFXButton previewemp1;

    @FXML
    private MFXButton previewemp2;

    @FXML
    private MFXButton previewemp21;

    @FXML
    private MFXButton printbtn;

    @FXML
    private MFXTextField proname;

    @FXML
    private MFXTextField qun;

    @FXML
    private Text quntty1;

    @FXML
    private Text quntty2;

    @FXML
    private Text quntty21;

    @FXML
    private Text recename;

    @FXML
    private Text recfname;

    @FXML
    private Pane recipt;

    @FXML
    private Pane reciptmain;

    @FXML
    private Text recipttit;

    @FXML
    private Text recipttitle;

    @FXML
    private Text recno;

    @FXML
    private Text recnom;

    @FXML
    private Text recpname;

    @FXML
    private Text recproname;

    @FXML
    private Text report;

    @FXML
    private Text scrolltitle;

    @FXML
    private Pane search;

    @FXML
    private MFXButton searchid;

    @FXML
    private MFXTextField lensmate;
    @FXML
    private MFXTextField lensnum;

    @FXML
    private MFXTextField lenscolor;

    @FXML
    private MFXTextField lensprice;

    @FXML
    private MFXTextField shape;

    @FXML
    private Text showmore;

    @FXML
    private VBox sidebody;

    @FXML
    private Text smtextc;

    @FXML
    private Text smtextc2;

    @FXML
    private Text smtextc3;

    @FXML
    private Text smtextc4;

    @FXML
    private Text smtextc5;

    @FXML
    private Text supportt;

    @FXML
    private Text tenko;

    @FXML
    private Text termnom;

    @FXML
    private Text termres;

    @FXML
    private Text tit;

    @FXML
    private Text tit1;

    @FXML
    private Text tit2;

    @FXML
    private Text tit21;

    @FXML
    private HBox titlebar;

    @FXML
    private Label total;

    @FXML
    private Label totalamo;

    @FXML
    private Text totall;

    @FXML
    private Text totall1;

    @FXML
    private MFXTextField type;

    @FXML
    private Text type1;

    @FXML
    private Text type2;

    @FXML
    private Text type21;

    @FXML
    private MFXButton viewproduct;




    ///frametable//////////////////////

    @FXML
    private TableView<prodata> framemaintable;
   
    @FXML
    private TableColumn<prodata, String> fbrandtable;

    
    @FXML
    private TableColumn<prodata, Integer> idframe;

    @FXML
    private TableColumn<prodata, String> fbutoontable;
    @FXML
    private TableColumn<prodata, String> fcolortable;

    @FXML
    private TableColumn<prodata, LocalDate> fdatetable;
    @FXML
    private TableColumn<prodata, String> fnametable;
    @FXML
    private TableColumn<prodata, String> fnotable;
    @FXML
    private TableColumn<prodata, String> fpricetable;

    @FXML
    private TableColumn<prodata, String> fquantitytable;
    @FXML
    private TableColumn<prodata, String> fshapetable;

    @FXML
    private TableColumn<prodata, String> ftypetable;

   

    ///endframetable///////////////////
    ///lensetable//////////////////////

    @FXML
    private TableColumn<LensData, String> lbutoontable;
    @FXML
    private TableColumn<LensData, String> lcolortable;

    @FXML
    private TableColumn<LensData, LocalDate> ldatetable;

    @FXML
    private TableView<LensData> lensemaintable;

    @FXML
    private TableColumn<LensData, Integer> idlense;


    @FXML
    private TableColumn<LensData, String> lnametable;

    @FXML
    private TableColumn<LensData, String> lnotable;
    @FXML
    private TableColumn<LensData, String> locationtable;

    @FXML
    private TableColumn<LensData, String> lpricetable;
    ///endlenstaale////////////////////
    ///goggletable/////////////////////
    @FXML
    private TableColumn<GoData, String> Gbutoontable;

    @FXML
    private TableColumn<GoData,LocalDate> Gdatetable;

    @FXML
    private TableColumn<GoData,Integer> Gidtable;
    @FXML
    private TableColumn<GoData, String> gbrandtable;

    @FXML
    private TableColumn<GoData, String> gcolortable;

    @FXML
    private TableView<GoData> gmaintable;
    @FXML
    private TableColumn<GoData, String> gnametable;

    @FXML
    private TableColumn<GoData, String> gnotable;
    @FXML
    private TableColumn<GoData, String> gpricetable;

    @FXML
    private TableColumn<GoData, String> gquantitytable;
    @FXML
    private TableColumn<GoData, String> gtypetable;

    ////endgoggletable/////////////////

    private ObservableList<ObservableList<String>> tableData;

   

    
    

    
   /////customertable///////////////////////////////////////////


   @FXML
   private TableView<cusdata> maintable;
   @FXML
   private TableColumn<cusdata, Integer> idtable;

   @FXML
   private TableColumn<cusdata, String> emailtable;
    @FXML
    private TableColumn<cusdata, String> nametable;

    @FXML
    private TableColumn<cusdata, String> passwordtable;

    @FXML
    private TableColumn<cusdata, String> locationtablecus;

    @FXML
    private TableColumn<cusdata, LocalDate> usernametable;

    @FXML
    private TableColumn<cusdata, String> viewColumn;


////////////////////////////////////////////
//////////////////recipttable////////////////////////////////////////
// @FXML
// private TableColumn<cusdata, String> reciptitem;

// @FXML
// private TableColumn<cusdata, Integer> reciptprice;

// @FXML
// private TableColumn<cusdata, Integer> reciptquantity;

// @FXML
// private TableColumn<cusdata, Integer> reciptamount;

// @FXML
// private TableColumn<cusdata, Integer> reciptdiscunt;

// @FXML
// private TableView<cusdata> reciptmaintable;







@FXML
private TableView<ObservableList<String>> reciptmaintable;

@FXML
private TableColumn<ObservableList<String>, String> reciptitem;
@FXML
private TableColumn<ObservableList<String>, String> reciptquantity;

@FXML
private TableColumn<ObservableList<String>, String> reciptdiscunt;

@FXML
private TableColumn<ObservableList<String>, String> reciptamount;
@FXML
private TableColumn<ObservableList<String>, String> reciptprice;

//////////////////////////////////////////////////////////////////


    @FXML
    void addcus(ActionEvent event) {
        addcustomer.toFront();
    }

    @FXML
    void addgoggles(ActionEvent event) {
        Goggles.toFront();
    }

    @FXML
    void addlense(ActionEvent event) {
        lensepro.toFront();
    }

    @FXML
    void addpro(ActionEvent event) {
        propanemain.toFront();
    }

    @FXML
    void brandname(ActionEvent event) {

    }

    @FXML
    void cancelcus(ActionEvent event) {

    }

    @FXML
    void closebtn(ActionEvent event) {
Stage stage= (Stage) close.getScene().getWindow();
stage.close();
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
    void datepro(ActionEvent event) {

    }

    @FXML
            void emp(ActionEvent event){
                addcustomer.toFront();
                dashboard.setStyle("-fx-background-color:#e5e7ed;");
                // dashtext.setStyle("");
                dashtext1.setStyle("-fx-fill: black;");
                empicon.setFill(Color.web("#984aff"));
                docicon.setFill(Color.web("#9a9595"));
                dashboard1.setStyle("-fx-background-color: #fff;");
                    }


    @FXML
    void frame(ActionEvent event) {
        MAINFORM.toFront();
    }

    @FXML
    void framecolor(ActionEvent event) {

    }

    @FXML
    void frameno(ActionEvent event) {

    }

    @FXML
    void frameshape(ActionEvent event) {

    }

    @FXML
    void gogalcol(ActionEvent event) {

    }

    @FXML
    void gogbrand(ActionEvent event) {

    }

    @FXML
    void gogdate(ActionEvent event) {

    }

    @FXML
    void goglename(ActionEvent event) {

    }

    @FXML
    void gogoolno(ActionEvent event) {

    }

    @FXML
    void gogptype(ActionEvent event) {

    }

    @FXML
    void gogqun(ActionEvent event) {

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
    void prodname(ActionEvent event) {

    }

    
    @FXML
    void custmer1get(ActionEvent event) {
        cuspart1.toFront();
    }

    @FXML
    void cusget2(ActionEvent event) {
        customerp2.toFront();
    }


    @FXML
    void submitcusnew(ActionEvent event) {
          
        String cname = namef.getText();
        String cmail = cusmail.getText();
        String cphone = cusno.getText();
        String cadd = cusadd.getText();
        LocalDate cdate = cusdate.getValue();
        String cframe = cusbrand.getSelectionModel().getSelectedItem();
        String cfname = fvname.getText();
        String cfcolor = fvcolor.getText();
        String cfshape = fvshape.getText();
        String cfbrand = fvbrand.getText();
        String cftype = fvtype.getText();
        Integer cfprice = Integer.parseInt(fvprice.getText());
        String clname = lvlensename.getSelectionModel().getSelectedItem();
        String clcolor = lvcolor.getText();
        String clno = cusdiscount.getText();
        Integer clprice = Integer.parseInt(lvprice.getText());
        String cgname = ggname.getSelectionModel().getSelectedItem();
        String cgcolor = ggcolor.getText();
        String cgtype = ggtype.getText();
        String cgbrand = ggbrand.getText();
        Integer cgprice = Integer.parseInt(ggprice.getText());
        Integer cdiscus = Integer.parseInt(ggdiscount.getText());
    
        cusdata cdata= new cusdata(cname,  cmail,  cphone,  cadd,  cdate,  cframe,  cfname,  cfcolor,  cfshape,  cfbrand,  cftype,cfprice,  clname,  clcolor,  clno,clprice,  cgname,  cgcolor,  cgtype,  cgbrand,cgprice, cdiscus);
    
        int status = cusbase.save(cdata);
        
        if (status > 0) {
            // Show success message if data is submitted successfully
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Submitted successfully");
            alert.showAndWait();
            
            // Clear the form fields after successful submission
            namef.clear();
            cusmail.clear();
            cusno.clear();
            cusadd.clear();
            cusdate.setValue(null);
            cusbrand.setValue(null);
            fvname.clear();
            fvcolor.clear();
            fvshape.clear();
            fvbrand.clear();
            fvtype.clear();
            fvprice.clear();
            lvlensename.setValue(null);
            lvcolor.clear();
            cusdiscount.clear();
            ggname.setValue(null);
            ggcolor.clear();
            ggtype.clear();
            ggbrand.clear();
            ggprice.clear();
            ggdiscount.clear();
            
            // Clear the table view
            maintable.getItems().clear();
            
            // Retrieve the updated data from the database
            List<cusdata> updatedData = cusbase.getAllOwnerData();
            
            
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

    


    @FXML
    void quantity(ActionEvent event) {

    }

    @FXML
    void reciptbtn(ActionEvent event) {
        recipt.toFront();
    }

    @FXML
    void submitcus(ActionEvent event) {

    }

    @FXML
    void typepro(ActionEvent event) {

    }

    @FXML
    void viewcus(ActionEvent event) {
        viewcustable.toFront();
    }

    @FXML
    void viewpro(ActionEvent event) {
        viewallproducts.toFront();
    }

    @FXML
    void proprice(ActionEvent event) {
    
    }
    @FXML
    void gogprice(ActionEvent event) {
    
    }


    @FXML
    void submitpro(ActionEvent event) {

        String pname = proname.getText();
        String pno = no.getText();
        String pcolor = color.getText();
        String pshape = shape.getText();
        String pqun = qun.getText();
        String pbrand = brand.getText();
        String ptype = type.getText();
        LocalDate ppro1date = pro1date.getValue();
        Integer pgqun11 = Integer.parseInt(gqun11.getText());

        prodata pdata = new prodata(pname,pno,pcolor,pshape,pqun,pbrand,ptype,ppro1date,pgqun11);

        int status = empbase.save(pdata);
        
        if (status > 0) {
            // Show success message if data is submitted successfully
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Submitted successfully");
            alert.showAndWait();
    
            // Clear the form fields after successful submission
            proname.clear();
            no.clear();
            color.clear();
            shape.clear();
            qun.clear();
            brand.clear();
            type.clear();
            pro1date.setValue(null);;
            gqun11.clear();
            // Clear other fields as well...
    
            // Clear the table view
            framemaintable.getItems().clear();
    
            // Retrieve the updated data from the database
            List<prodata> updatedData = empbase.getAllOwnerData();
    
    
            
            // Add the updated data to the table view
            framemaintable.getItems().addAll(updatedData);
        } else {
            // Show error message if submission fails
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Failed to submit data. Please try again.");
            alert.showAndWait();
        }

    }

    @FXML
    void lenssubmit(ActionEvent event) {


        String lname = lensmate.getText();
        String lcolor = lenscolor.getText();
        String lnum = lensnum.getText();
        LocalDate ldate = lensdate.getValue();
        Integer lprice = Integer.parseInt(lensprice.getText());


        LensData lensData = new LensData(lname, lcolor, lnum, ldate, lprice);

    // Save data
    int status = lensbase.saveLensData(lensData);


    if (status > 0) {
        // Show success message if data is submitted successfully
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText("Submitted successfully");
        alert.showAndWait();

        // Clear the form fields after successful submission
        lensmate.clear();
    lenscolor.clear();
    lensnum.clear();
    lensdate.setValue(null);
    lensprice.clear();
        // Clear other fields as well...

        // Clear the table view
        lensemaintable.getItems().clear();

        // Retrieve the updated data from the database
        List<LensData> updatedData = lensbase.getAllOwnerData();


        
        // Add the updated data to the table view
        lensemaintable.getItems().addAll(updatedData);
    } else {
        // Show error message if submission fails
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Failed to submit data. Please try again.");
        alert.showAndWait();
    }

    }


    @FXML
    void gosubmit(ActionEvent event) {
  String gname = foname.getText();
  String gnum = gogno.getText();
  String gcolor = gogcolor.getText();
  String gtype = gogtypt.getText();
  String gquantity = gqun.getText();
  String gbrand = gobrand.getText();
 Integer gprice = Integer.parseInt(gqun1.getText());
  LocalDate gdate = godate.getValue();

  GoData goData = new GoData(gname, gnum, gcolor, gtype, gquantity, gbrand, gprice, gdate);

  // Save data
  int status = gobase.saveGoData(goData);


  if (status > 0) {
    // Show success message if data is submitted successfully
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle("Success");
    alert.setHeaderText(null);
    alert.setContentText("Submitted successfully");
    alert.showAndWait();

    // Clear the form fields after successful submission
    foname.clear();
    gogno.clear();
    gogcolor.clear();
       gogtypt.clear();
       gqun.clear();
       gobrand.clear();
       gqun1.clear();
       godate.setValue(null);
    // Clear other fields as well...

    // Clear the table view
    gmaintable.getItems().clear();

    // Retrieve the updated data from the database
    List<GoData> updatedData = gobase.getAllOwnerData();


    
    // Add the updated data to the table view
    gmaintable.getItems().addAll(updatedData);
} else {
    // Show error message if submission fails
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setTitle("Error");
    alert.setHeaderText(null);
    alert.setContentText("Failed to submit data. Please try again.");
    alert.showAndWait();
}
    }


    private List<Image> images;
    private int currentIndex = 0;
    private int slideDurationSeconds = 5; 









    ///////////riciptpart//////////////////////////////////////////////////////

    @FXML
    void rrid(ActionEvent event) {

    }

   

   



    ///////////////////////////////////////////////////////////////////



//////Intislization////////////////////////////////////////////////////


List<prodata> listm;
List<LensData> listl;
List<GoData> listg;
List<cusdata> listc;
List<cusdata> listr;
int index = -1;
Connection con = null;
ResultSet rs = null;
PreparedStatement ps = null;




@Override
public void initialize(URL location, ResourceBundle resources) {

//     reciptitem.setCellValueFactory(new PropertyValueFactory<cusdata,String>("cfname"));
//     reciptquantity.setCellValueFactory(new PropertyValueFactory<cusdata, Integer>("1"));
//     reciptprice.setCellValueFactory(new PropertyValueFactory<cusdata, Integer>("cfprice"));
//     reciptdiscunt.setCellValueFactory(new PropertyValueFactory<cusdata, Integer>("cdiscus"));
//     reciptamount.setCellValueFactory(new PropertyValueFactory<cusdata, Integer>("cfprice"));



//     reciptitem.setCellValueFactory(new PropertyValueFactory<cusdata,String>("clname"));
//     reciptquantity.setCellValueFactory(new PropertyValueFactory<cusdata, Integer>("1"));
//     reciptprice.setCellValueFactory(new PropertyValueFactory<cusdata, Integer>("clprice"));
//     reciptdiscunt.setCellValueFactory(new PropertyValueFactory<cusdata, Integer>("cdiscus"));
//     reciptamount.setCellValueFactory(new PropertyValueFactory<cusdata, Integer>("clprice"));
// ;
//     reciptmaintable.getItems().setAll(listr);



//     listr = cusbase.getAllOwnerData()





reciptitem.setCellValueFactory(data -> new SimpleStringProperty((String) data.getValue().get(0)));
reciptquantity.setCellValueFactory(data -> new SimpleStringProperty((String) data.getValue().get(1)));
reciptprice.setCellValueFactory(data -> new SimpleStringProperty((String) data.getValue().get(2)));
reciptdiscunt.setCellValueFactory(data -> new SimpleStringProperty((String) data.getValue().get(3)));
reciptamount.setCellValueFactory(data -> new SimpleStringProperty((String) data.getValue().get(4)));


ObservableList<ObservableList<String>> tableData = FXCollections.observableArrayList();
// Add data to the list
reciptmaintable.setItems(tableData);


// ObservableList<String> newRow2 = FXCollections.observableArrayList();
// newRow2.add("Item name1"); // Item
// newRow2.add("2"); // Quantity
// newRow2.add("200.0"); // Price
// tableData.add(newRow2);


    fnametable.setCellValueFactory(new PropertyValueFactory<prodata,String>("pname"));
    fnotable.setCellValueFactory(new PropertyValueFactory<prodata,String>("pno"));
    fcolortable.setCellValueFactory(new PropertyValueFactory<prodata,String>("pcolor"));
    fshapetable.setCellValueFactory(new PropertyValueFactory<prodata,String>("pshape"));
    fquantitytable.setCellValueFactory(new PropertyValueFactory<prodata,String>("pqun"));
    fbrandtable.setCellValueFactory(new PropertyValueFactory<prodata,String>("pbrand"));
    ftypetable.setCellValueFactory(new PropertyValueFactory<prodata,String>("ptype"));
    fdatetable.setCellValueFactory(new PropertyValueFactory<prodata,LocalDate>("ppro1date"));
    fpricetable.setCellValueFactory(new PropertyValueFactory<prodata,String>("pgqun11"));
    idframe.setCellValueFactory(new PropertyValueFactory<>("id"));
    
listm = empbase.getAllOwnerData();
framemaintable.getItems().setAll(listm);


fbutoontable.setCellFactory(param -> new TableCell<>() {
    private final MFXButton viewButton = new MFXButton("View");
    private final MFXButton deleteButton = new MFXButton("Delete");

    {

        viewButton.setId("viewButton");
        deleteButton.setId("deleteButton");
        // Handle view button click event
        viewButton.setOnAction(event -> {
            // Get the ownerdata object associated with the clicked row
            prodata data = getTableView().getItems().get(getIndex());
            int id = data.getId(); 

                     
            // Populate the fields in the FXML file with the retrieved owner's information
            FXMLLoader loader = new FXMLLoader(getClass().getResource("frameupdate.fxml")); // Replace "viewOwner.fxml" with the name of your FXML file
            try {
                Parent root = loader.load();
                // Access the controller of the viewOwner.fxml file
                frameupdatecontrolar controller = loader.getController();
                // Call a method in the controller to populate the fields with owner's information
                controller.setData(data); // Pass the ownerdata object to the method
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
            // Get the ownerdata object associated with the clicked row
            
            Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
    confirmationAlert.setTitle("Confirmation");
    confirmationAlert.setHeaderText("Delete Data");
    confirmationAlert.setContentText("Are you sure you want to delete this data?");

    Optional<ButtonType> result = confirmationAlert.showAndWait();
    if (result.isPresent() && result.get() == ButtonType.OK) {
        // User confirmed the deletion
        prodata data = getTableView().getItems().get(getIndex());
        int ownerId = data.getId();

        // Call the deleteOwnerData method from ownerbase to delete the record
        int status = empbase.deleteOwnerData(ownerId);

        if (status > 0) {
            // Record deleted successfully
            // Remove the deleted record from the table view
            getTableView().getItems().remove(data);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Delete data Successfully");
            alert.showAndWait();
            System.out.println("Record deleted successfully");
        } else {
            // Failed to delete the record
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Something went wrong. Please try again!");
            alert.showAndWait();

            System.out.println("Failed to delete the record");
        }
    }
        
        });
    }

    @Override
    protected void updateItem(String item, boolean empty) {
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




///////////// lense start////////////////////////////////////////////////////////

lnametable.setCellValueFactory(new PropertyValueFactory<LensData,String>("lname"));
lcolortable.setCellValueFactory(new PropertyValueFactory<LensData,String>("lcolor"));
lnotable.setCellValueFactory(new PropertyValueFactory<LensData,String>("lnum"));
ldatetable.setCellValueFactory(new PropertyValueFactory<LensData,LocalDate>("ldate"));
lpricetable.setCellValueFactory(new PropertyValueFactory<LensData,String>("lprice"));
idlense.setCellValueFactory(new PropertyValueFactory<>("id"));

listl = lensbase.getAllOwnerData();
lensemaintable.getItems().setAll(listl);


lbutoontable.setCellFactory(param -> new TableCell<>() {
private final MFXButton viewButton1 = new MFXButton("View");
private final MFXButton deleteButton1 = new MFXButton("Delete");

{

    viewButton1.setId("viewButton1");
    deleteButton1.setId("deleteButton1");
    // Handle view button click event
    viewButton1.setOnAction(event -> {
        // Get the ownerdata object associated with the clicked row
        LensData data = getTableView().getItems().get(getIndex());
        int id = data.getId(); 

                 
        // Populate the fields in the FXML file with the retrieved owner's information
        FXMLLoader loader = new FXMLLoader(getClass().getResource("lenseupdate.fxml")); // Replace "viewOwner.fxml" with the name of your FXML file
        try {
            Parent root = loader.load();
            // Access the controller of the viewOwner.fxml file
            lenseupdatecontrolar controller = loader.getController();
            // Call a method in the controller to populate the fields with owner's information
            controller.setData(data); // Pass the ownerdata object to the method
            // Create a new scene with the loaded FXML and show it
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    });

    // Handle delete button click event
    deleteButton1.setOnAction(event -> {
        // Get the ownerdata object associated with the clicked row
        
        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
    confirmationAlert.setTitle("Confirmation");
    confirmationAlert.setHeaderText("Delete Data");
    confirmationAlert.setContentText("Are you sure you want to delete this data?");

    Optional<ButtonType> result = confirmationAlert.showAndWait();
    if (result.isPresent() && result.get() == ButtonType.OK) {
        // User confirmed the deletion
        LensData data = getTableView().getItems().get(getIndex());
        int ownerId = data.getId();

        // Call the deleteOwnerData method from ownerbase to delete the record
        int status = lensbase.deleteOwnerData(ownerId);

        if (status > 0) {
            // Record deleted successfully
            // Remove the deleted record from the table view
            getTableView().getItems().remove(data);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Delete data Successfully");
            alert.showAndWait();
            System.out.println("Record deleted successfully");
        } else {
            // Failed to delete the record
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Something went wrong. Please try again!");
            alert.showAndWait();

            System.out.println("Failed to delete the record");
        }
    }
    
    
    });
}

@Override
protected void updateItem(String item, boolean empty) {
    super.updateItem(item, empty);
    if (empty) {
        setGraphic(null);
    } else {
       
        HBox buttonContainer = new HBox(viewButton1, deleteButton1);
        buttonContainer.setSpacing(5); // Adjust the spacing between buttons
        setGraphic(buttonContainer); // Place buttons in an HBox
    }
}
});


/////////////////goggles//////////////////////////////////////////////////


gnametable.setCellValueFactory(new PropertyValueFactory<GoData,String>("gname"));
gnotable.setCellValueFactory(new PropertyValueFactory<GoData,String>("gnum"));
gcolortable.setCellValueFactory(new PropertyValueFactory<GoData,String>("gcolor"));
gtypetable.setCellValueFactory(new PropertyValueFactory<GoData,String>("gtype"));
gquantitytable.setCellValueFactory(new PropertyValueFactory<GoData,String>("gquantity"));
gbrandtable.setCellValueFactory(new PropertyValueFactory<GoData,String>("gbrand"));
gpricetable.setCellValueFactory(new PropertyValueFactory<GoData,String>("gprice"));
Gdatetable.setCellValueFactory(new PropertyValueFactory<GoData,LocalDate>("gdate"));

Gidtable.setCellValueFactory(new PropertyValueFactory<>("id"));

listg = gobase.getAllOwnerData();
gmaintable.getItems().setAll(listg);


Gbutoontable.setCellFactory(param -> new TableCell<>() {
private final MFXButton viewButton2 = new MFXButton("View");
private final MFXButton deleteButton2 = new MFXButton("Delete");

{

    viewButton2.setId("viewButton2");
    deleteButton2.setId("deleteButton2");
    // Handle view button click event
    viewButton2.setOnAction(event -> {
        // Get the ownerdata object associated with the clicked row
        GoData data = getTableView().getItems().get(getIndex());
        int id = data.getId(); 

                 
        // Populate the fields in the FXML file with the retrieved owner's information
        FXMLLoader loader = new FXMLLoader(getClass().getResource("goupdate.fxml")); // Replace "viewOwner.fxml" with the name of your FXML file
        try {
            Parent root = loader.load();
            // Access the controller of the viewOwner.fxml file
            goupdatecontrolar controller = loader.getController();
            // Call a method in the controller to populate the fields with owner's information
            controller.setData(data); // Pass the ownerdata object to the method
            // Create a new scene with the loaded FXML and show it
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    });

    // Handle delete button click event
    deleteButton2.setOnAction(event -> {
        // Get the ownerdata object associated with the clicked row
        
        

        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
    confirmationAlert.setTitle("Confirmation");
    confirmationAlert.setHeaderText("Delete Data");
    confirmationAlert.setContentText("Are you sure you want to delete this data?");

    Optional<ButtonType> result = confirmationAlert.showAndWait();
    if (result.isPresent() && result.get() == ButtonType.OK) {
        // User confirmed the deletion
        GoData data = getTableView().getItems().get(getIndex());
        int ownerId = data.getId();

        // Call the deleteOwnerData method from ownerbase to delete the record
        int status = gobase.deleteOwnerData(ownerId);

        if (status > 0) {
            // Record deleted successfully
            // Remove the deleted record from the table view
            getTableView().getItems().remove(data);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Delete data Successfully");
            alert.showAndWait();
            System.out.println("Record deleted successfully");
        } else {
            // Failed to delete the record
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Something went wrong. Please try again!");
            alert.showAndWait();

            System.out.println("Failed to delete the record");
        }
    }
    
    
    });
}

@Override
protected void updateItem(String item, boolean empty) {
    super.updateItem(item, empty);
    if (empty) {
        setGraphic(null);
    } else {
       
        HBox buttonContainer = new HBox(viewButton2, deleteButton2);
        buttonContainer.setSpacing(5); // Adjust the spacing between buttons
        setGraphic(buttonContainer); // Place buttons in an HBox
    }
}
});


//////////customers///////////////////////////////////////////////

nametable.setCellValueFactory(new PropertyValueFactory<cusdata,String>("cname"));
emailtable.setCellValueFactory(new PropertyValueFactory<cusdata,String>("cmail"));
locationtablecus.setCellValueFactory(new PropertyValueFactory<cusdata,String>("cadd"));
usernametable.setCellValueFactory(new PropertyValueFactory<cusdata,LocalDate>("cdate"));
passwordtable.setCellValueFactory(new PropertyValueFactory<cusdata,String>("cdiscus"));

idtable.setCellValueFactory(new PropertyValueFactory<>("id"));

listc = cusbase.getAllOwnerData();
maintable.getItems().setAll(listc);


viewColumn.setCellFactory(param -> new TableCell<>() {
private final MFXButton viewButton3 = new MFXButton("View");
private final MFXButton deleteButton3 = new MFXButton("Delete");

{

    viewButton3.setId("viewButton3");
    deleteButton3.setId("deleteButton3");
    // Handle view button click event
    viewButton3.setOnAction(event -> {
        // Get the ownerdata object associated with the clicked row
        cusdata data = getTableView().getItems().get(getIndex());
        int id = data.getId(); 

                 
        // Populate the fields in the FXML file with the retrieved owner's information
        FXMLLoader loader = new FXMLLoader(getClass().getResource("cusupdate.fxml")); // Replace "viewOwner.fxml" with the name of your FXML file
        try {
            Parent root = loader.load();
            // Access the controller of the viewOwner.fxml file
            cutomerupdatecontrolar controller = loader.getController();
            // Call a method in the controller to populate the fields with owner's information
            controller.setData(data); // Pass the ownerdata object to the method
            // Create a new scene with the loaded FXML and show it
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    });

    // Handle delete button click event
    deleteButton3.setOnAction(event -> {
        // Get the ownerdata object associated with the clicked row
        
        

        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
    confirmationAlert.setTitle("Confirmation");
    confirmationAlert.setHeaderText("Delete Data");
    confirmationAlert.setContentText("Are you sure you want to delete this data?");

    Optional<ButtonType> result = confirmationAlert.showAndWait();
    if (result.isPresent() && result.get() == ButtonType.OK) {
        // User confirmed the deletion
        cusdata data = getTableView().getItems().get(getIndex());
        int ownerId = data.getId();

        // Call the deleteOwnerData method from ownerbase to delete the record
        int status = gobase.deleteOwnerData(ownerId);

        if (status > 0) {
            // Record deleted successfully
            // Remove the deleted record from the table view
            getTableView().getItems().remove(data);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Delete data Successfully");
            alert.showAndWait();
            System.out.println("Record deleted successfully");
        } else {
            // Failed to delete the record
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Something went wrong. Please try again!");
            alert.showAndWait();

            System.out.println("Failed to delete the record");
        }
    }
    
    
    });
}

@Override
protected void updateItem(String item, boolean empty) {
    super.updateItem(item, empty);
    if (empty) {
        setGraphic(null);
    } else {
       
        HBox buttonContainer = new HBox(viewButton3, deleteButton3);
        buttonContainer.setSpacing(5); // Adjust the spacing between buttons
        setGraphic(buttonContainer); // Place buttons in an HBox
    }
}
});
////////////////////////////////////////////////////////////////

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


////////////////////////////////////////////////


List<prodata> frameDataList = empbase.getAllOwnerData();

for (prodata data : frameDataList) {
    cusbrand.getItems().add(data.getPno()); // Add pno values to the ComboBox
}


cusbrand.getSelectionModel().selectedItemProperty().addListener((obs, oldValue, newValue) -> {
    String selectedPno = (String) newValue;
    // Get the corresponding frame data
    List<prodata> frameData = empbase.getAllOwnerData1(selectedPno);
    if (!frameData.isEmpty()) {
        prodata frame = frameData.get(0);
        // Fill in the shape and color text fields
        fvname.setText(frame.getPname());
        fvcolor.setText(frame.getPcolor());
        fvshape.setText(frame.getPshape());
        fvbrand.setText(frame.getPbrand());
        fvtype.setText(frame.getPtype());
        fvprice.setText(frame.getPgqun11().toString());
      
    }

});




List<LensData> leseDataList = lensbase.getAllOwnerData();

for (LensData data : leseDataList) {
    lvlensename.getItems().add(data.getLname()); // Add pno values to the ComboBox
}

lvlensename.getSelectionModel().selectedItemProperty().addListener((obs, oldValue, newValue) -> {
    String selectedlname = (String) newValue;
    // Get the corresponding frame data
    List<LensData> lensedata = lensbase.getAllOwnerData2(selectedlname);
    if (!lensedata.isEmpty()) {
        LensData frame = lensedata.get(0);
        
        // Fill in the shape and color text fields
        lvcolor.setText(frame.getLcolor());
        cusdiscount.setText(frame.getLnum());
        lvprice.setText(frame.getLprice().toString());
        
    }

});



List<GoData> goDataList = gobase.getAllOwnerData();

for (GoData data : goDataList) {
    ggname.getItems().add(data.getGname()); // Add pno values to the ComboBox
}

ggname.getSelectionModel().selectedItemProperty().addListener((obs, oldValue, newValue) -> {
    String selectedgname = (String) newValue;
    // Get the corresponding frame data
    List<GoData> godata = gobase.getAllOwnerData3(selectedgname);
    if (!godata.isEmpty()) {
        GoData frame = godata.get(0);
                // Fill in the shape and color text fields
        ggcolor.setText(frame.getGcolor());
        ggtype.setText(frame.getGtype());
        ggbrand.setText(frame.getGbrand());
        ggprice.setText(frame.getGprice().toString());
        
        
    }

});


}



@FXML
void refresh(MouseEvent event) {
    listm.clear();
    listl.clear();
    listg.clear();
    listc.clear();
    // Add the new updated data to the list
    listm.addAll(empbase.getAllOwnerData());
    listl.addAll(lensbase.getAllOwnerData());
    listg.addAll(gobase.getAllOwnerData());
    listc.addAll(cusbase.getAllOwnerData());


    // Update the TableView with the new data
    framemaintable.getItems().setAll(listm);
    lensemaintable.getItems().setAll(listl);
    gmaintable.getItems().setAll(listg);
    maintable.getItems().setAll(listc);
}



@FXML
void rrsearch(ActionEvent event) {
    tableData = FXCollections.observableArrayList(); // Initialize tableData here
    
    String id = rridnew.getText(); // Get the ID from the rrid field
    List<cusdata> data = cusbase.getAllOwnerData5(Integer.parseInt(id)); // Search for data with the given ID
    
    if (!data.isEmpty()) {
        cusdata d = data.get(0);
        curnom.setText(d.getCdate().toString());
        duenom.setText(d.getCdate().toString());
        cusname.setText(d.getCname());
        cusadd5.setText(d.getCadd());
        ;
        // ... and so on for each field
    } else {
        // Handle the case where no data is found
    }
    tableData.clear(); // Now you can clear tableData

    double totalPrice = 0;

    // Add the retrieved data to the table
    for (cusdata d : data) {
        ObservableList<String> newRow = FXCollections.observableArrayList();
        newRow.add(d.getCfname()); // Item
        newRow.add("1"); // Quantity
        newRow.add(String.valueOf(d.getCfprice())); // Price
        newRow.add(String.valueOf(d.getCdiscus())); // Price
        newRow.add(String.valueOf(d.getCfprice())); // Price
        tableData.add(newRow);

        ObservableList<String> newRow2 = FXCollections.observableArrayList();
        newRow2.add(d.getClname()); // Item
        newRow2.add("1"); // Quantity
        newRow2.add(String.valueOf(d.getClprice())); // Price
        newRow2.add("0"); // Price
        newRow2.add(String.valueOf(d.getClprice())); // Price
        tableData.add(newRow2);

        ObservableList<String> newRow3 = FXCollections.observableArrayList();
        newRow3.add(d.getCgname()); // Item
        newRow3.add("1"); // Quantity
        newRow3.add(String.valueOf(d.getCgprice())); // Price
        newRow3.add("0"); // Price
        newRow3.add(String.valueOf(d.getCgprice())); // Price
        tableData.add(newRow3);

        totalPrice += d.getCfprice() + d.getClprice();
    }

    totalPrice -= (totalPrice * data.get(0).getCdiscus() / 100);
    reciptmaintable.setItems(tableData);
    totalamo.setText(String.valueOf(totalPrice)); // Update the table with the new data
}



@FXML
void viewframetable(ActionEvent event) {
    viewprotable.toFront();
}


@FXML
void viewlensetable(ActionEvent event) {
    viewlensetable.toFront();
}

@FXML
void goggesviewbtn(ActionEvent event) {
    viewgoglestable.toFront();
}

@FXML
void logoutnew(ActionEvent event) {
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
void backtomain(ActionEvent event) {
    firstpage.toFront();
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


///////////combocbox///////////////////////////////////////////



@FXML
void rrprint(ActionEvent event) {
    Printer printer = Printer.getDefaultPrinter();
    PrinterJob job = PrinterJob.createPrinterJob(printer);
    if (job != null) {
        job.showPrintDialog(reciptmain.getScene().getWindow());
        boolean success = job.printPage(reciptmain);
        if (success) {
            job.endJob();
        }
    }
}
}
