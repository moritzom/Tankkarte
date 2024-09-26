import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class Kassensystem {

    @FXML
    Button btn_sl1;
    @FXML
    Button btn_sl2;
    @FXML
    Button btn_sl3;
    @FXML
    Button btn_sl4;
    @FXML
    Button btn_tankkarte;
    @FXML
    Button btn_bar;
    @FXML
    TextField txt_preis;
    @FXML
    TextField txt_literpreis;

    double preis;
    Rabatt rabatt;
    String formatierterPreis = "";
    double literGetankt;
    double endgueltigerPreis;
    String formatierterPreis2 = "";
    String literFormatiert;

    public void chooseSauele(){

        literGetankt = Math.random() * 100;
        preis = Math.random() * 2;

        endgueltigerPreis = preis * literGetankt;

        DecimalFormat df = new DecimalFormat("#.##");
        formatierterPreis = df.format(endgueltigerPreis);
        literFormatiert = df.format(literGetankt);
        formatierterPreis2 = df.format(preis);

        txt_literpreis.setText("L getankt: " + literFormatiert + " Preis/L: " + formatierterPreis2);
        txt_preis.setText(formatierterPreis + "€");
    }

    public void payWithTankkarte(){
        if(formatierterPreis.equals("")){
            formatierterPreis = "0,00";
        }

        if(formatierterPreis.equals("0,00")){
            txt_preis.setText("Keine Säule ausgewählt!");
        } else {
            txt_preis.setText(formatierterPreis + "€ wurden mit Tankkarte bezahlt!");
        }
    }

    public void payWithBargeld(){
        if(formatierterPreis.equals("")){
            formatierterPreis = "0,00";
        }

        if(formatierterPreis.equals("0,00")){
            txt_preis.setText("Keine Säule ausgewählt!");
        } else {
            txt_preis.setText(formatierterPreis + "€ wurden Bar bezahlt!");
        }
    }
}
