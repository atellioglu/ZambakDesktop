package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import util.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;

/**
 * Created by abdullaht on 13.10.2017.
 */
public class YeniSatisController {
    @FXML
    private TextField txtIsimSoyisim;
    @FXML
    private TextArea txtAdres;
    @FXML
    private TextField txtTelefon;
    @FXML
    private RadioButton radioKapidaOdeme,radioEft,radioEl;
    @FXML
    private RadioButton radioInstagram,radioFacebook,radioWhatsapp,radioSite;
    @FXML
    private DatePicker datePickerSiparis;
    @FXML
    private TextField txtKargoUcreti;
    @FXML
    private ComboBox<String> comboBoxCountry;
    @FXML
    private Button btnUrunSec;
    @FXML
    private TextField txtUrunUcreti;
    @FXML
    protected void initialize(){
        comboBoxCountry.getItems().addAll(Util.get().getCountryList());

        datePickerSiparis.setValue(LocalDate.now());
    }
    public void btnTemizleClicked(ActionEvent actionEvent) {

    }

    public void kapidaOdemeAction(ActionEvent actionEvent) {
        radioKapidaOdeme.setSelected(true);
        radioEft.setSelected(false);
        radioEl.setSelected(false);
    }

    public void eftOdemeAction(ActionEvent actionEvent) {
        radioKapidaOdeme.setSelected(false);
        radioEft.setSelected(true);
        radioEl.setSelected(false);

    }
    public void eldenOdemeAction(ActionEvent actionEvent) {
        radioKapidaOdeme.setSelected(false);
        radioEft.setSelected(false);
        radioEl.setSelected(true);
    }
    public void kaynakAction(ActionEvent actionEvent){
        radioWhatsapp.setSelected(false);
        radioInstagram.setSelected(false);
        radioFacebook.setSelected(false);
        radioSite.setSelected(false);
        ((RadioButton)actionEvent.getSource()).setSelected(true);
    }
}
