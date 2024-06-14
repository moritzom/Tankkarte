import java.io.Serializable;

public class Response implements Serializable {
    String inhalt;

    public Response(String inhalt) {
        this.inhalt = inhalt;
    }

    @Override
    public String toString() {
        return "Inhalt: " + inhalt;
    }
}
