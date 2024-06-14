/* Main Klasse
Erstellt von Nathan Barisic
Projektmitwirkende (Mitarbeitende): Moritz Oman, Ioan Zlatkov
Beschreibung: Umsetzung des Tankkarten Projekts
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ApplicationServer {
    private static final int PORT = 80;

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is running...");
            while (true) {
                Socket clientSocket = serverSocket.accept();

                //Thread t = new Thread(new Clienthandler(clientSocket));
                //t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
