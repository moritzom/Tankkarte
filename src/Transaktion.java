import java.sql.Date;

public class Transaktion {

    private int transID;
    private long pan;
    private Produkt produkt;
    private double menge;
    private  double preisProEinheit;
    private Date datum;
    private String status;

    public void markAbgerechnet(){

    }

    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }

    public long getPan() {
        return pan;
    }

    public void setPan(long pan) {
        this.pan = pan;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public double getMenge() {
        return menge;
    }

    public void setMenge(double menge) {
        this.menge = menge;
    }

    public double getPreisProEinheit() {
        return preisProEinheit;
    }

    public void setPreisProEinheit(double preisProEinheit) {
        this.preisProEinheit = preisProEinheit;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaktion{" +
                "transID=" + transID +
                ", pan=" + pan +
                ", produkt=" + produkt +
                ", menge=" + menge +
                ", preisProEinheit=" + preisProEinheit +
                ", datum=" + datum +
                ", status='" + status + '\'' +
                '}';
    }
}
