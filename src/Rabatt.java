//Rabatt - Klasse
//Erstellt von Nathan Barisic

public class Rabatt {

    private String rabattcode;
    private String rabattArt;
    private double wert;

    public Rabatt(String rabattcode, String rabattArt, double wert) {
        this.rabattcode = rabattcode;
        this.rabattArt = rabattArt;
        this.wert = wert;
    }

    public double berechneRabatt(double menge){

        return 0;
    }

    public String getRabattcode() {
        return rabattcode;
    }

    public void setRabattcode(String rabattcode) {
        this.rabattcode = rabattcode;
    }

    public String getRabattArt() {
        return rabattArt;
    }

    public void setRabattArt(String rabattArt) {
        this.rabattArt = rabattArt;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    @Override
    public String toString() {
        return "Rabatt{" +
                "rabattcode='" + rabattcode + '\'' +
                ", rabattArt='" + rabattArt + '\'' +
                ", wert=" + wert +
                '}';
    }
}
