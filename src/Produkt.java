// Produkt Klasse
//Erstellt von Nathan Barisic

public class Produkt {
    private int pid;
    private String bezeichnung;
    private double preisProEinheit;

    public Produkt(int pid, String bezeichnung, double preisProEinheit) {
        this.pid = pid;
        this.bezeichnung = bezeichnung;
        this.preisProEinheit = preisProEinheit;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreisProEinheit() {
        return preisProEinheit;
    }

    public void setPreisProEinheit(double preisProEinheit) {
        this.preisProEinheit = preisProEinheit;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "pid=" + pid +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", preisProEinheit=" + preisProEinheit +
                '}';
    }
}
