import java.sql.Date;
import java.util.List;

public class Tankkarte {
    private long pan;
    private  int kundenNr;
    private Date gueltigBis;
    private double limit;
    private List<Produkt> produkte;
    private String status;

    public Tankkarte(long pan, int kundenNr, Date gueltigBis, double limit, String status) {
        this.pan = pan;
        this.kundenNr = kundenNr;
        this.gueltigBis = gueltigBis;
        this.limit = limit;
        this.status = status;
    }

    public long getPan() {
        return pan;
    }

    public void setPan(long pan) {
        this.pan = pan;
    }

    public int getKundenNr() {
        return kundenNr;
    }

    public void setKundenNr(int kundenNr) {
        this.kundenNr = kundenNr;
    }

    public Date getGueltigBis() {
        return gueltigBis;
    }

    public void setGueltigBis(Date gueltigBis) {
        this.gueltigBis = gueltigBis;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tankkarte{" +
                "pan=" + pan +
                ", kundenNr=" + kundenNr +
                ", gueltigBis=" + gueltigBis +
                ", limit=" + limit +
                ", status='" + status + '\'' +
                '}';
    }
}
