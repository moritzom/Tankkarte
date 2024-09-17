//Request Klasse, wird später der Übung nach bearbeitet

import java.io.Serializable;

public class Request implements Serializable {

    String message;

    public Request(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
