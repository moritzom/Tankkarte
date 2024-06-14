import java.util.List;

public class Kunde {

    private int kundenNr;
    private String vorname;
    private String nachname;
    private int plz;
    private String ortsname;
    private String strasse;
    private int hausNr;
    private boolean istGesperrt;
    private List<Tankkarte> karten;
    private List<Rabatt> rabatte;

    public Kunde(int kundenNr, String vorname, String nachname, int plz, String ortsname, String strasse, int hausNr, boolean istGesperrt, List<Tankkarte> karten, List<Rabatt> rabatte) {
        this.kundenNr = kundenNr;
        this.vorname = vorname;
        this.nachname = nachname;
        this.plz = plz;
        this.ortsname = ortsname;
        this.strasse = strasse;
        this.hausNr = hausNr;
        this.istGesperrt = istGesperrt;
        this.karten = karten;
        this.rabatte = rabatte;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrtsname() {
        return ortsname;
    }

    public void setOrtsname(String ortsname) {
        this.ortsname = ortsname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausNr() {
        return hausNr;
    }

    public void setHausNr(int hausNr) {
        this.hausNr = hausNr;
    }

    public boolean isIstGesperrt() {
        return istGesperrt;
    }

    public void setIstGesperrt(boolean istGesperrt) {
        this.istGesperrt = istGesperrt;
    }

    public List<Tankkarte> getKarten() {
        return karten;
    }

    public void setKarten(List<Tankkarte> karten) {
        this.karten = karten;
    }

    public List<Rabatt> getRabatte() {
        return rabatte;
    }

    public void setRabatte(List<Rabatt> rabatte) {
        this.rabatte = rabatte;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kundenNr=" + kundenNr +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", plz=" + plz +
                ", ortsname='" + ortsname + '\'' +
                ", strasse='" + strasse + '\'' +
                ", hausNr=" + hausNr +
                ", istGesperrt=" + istGesperrt +
                ", karten=" + karten +
                ", rabatte=" + rabatte +
                '}';
    }
}
