/* Main Klasse
Erstellt von Nathan Barisic
Projektmitwirkende (Mitarbeitende): Moritz Oman, Ioan Zlatkov
Beschreibung: Umsetzung des Tankkarten Projekts
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;

public class ApplicationServer {
    private static final int PORT = 80;

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is running...");
            while (true) {
                Socket clientSocket = serverSocket.accept();

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Die PAN der Tankkarte wird auf gültigkeit mittels dem Luhn Algorithmus geprüft
    public boolean pruefeTankkarte(long pan) {
        String cardNo = Long.toString(pan);  // Konvertiert die PAN zu einem String, um die Ziffern zu durchlaufen
        int nDigits = cardNo.length();
        int nSum = 0;
        boolean isSecond = false;

        // Durchläuft die Ziffern der PAN von rechts nach links
        for (int i = nDigits - 1; i >= 0; i--) {
            int d = cardNo.charAt(i) - '0';  // Konvertiert den Zeichen zu einer Zahl

            if (isSecond) {
                d = d * 2;
            }

            // Fügt die Ziffern der Zahl hinzu, wenn sie größer als 9 ist, wird sie in ihre Bestandteile zerlegt (z.B. 18 => 1 + 8)
            nSum += d / 10;
            nSum += d % 10;

            isSecond = !isSecond;  // Wechselt isSecond für die nächste Ziffer
        }

        return (nSum % 10 == 0); //Überprüfung auf Vielfaches von 10
    }


    public boolean saveTransaktion(Transaktion t){

        return true;
    }

    public void calcMonatsabrechnung(Date startDate, Date endDate){

    }
}
