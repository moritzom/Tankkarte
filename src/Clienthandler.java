// Clienthandler für Server

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

class ClientHandler implements Runnable {
    private Socket clientSocket;
    private ReentrantLock lock;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
        this.lock = new ReentrantLock();
    }

    @Override
    public void run() {
        try (
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream())
        ) {
            while (true) {
               // Request request = (Request) in.readObject();
                //Response response;
                lock.lock();
                try{
                    //response = processRequest(request);
                }
                finally {
                    lock.unlock();
                }
                //out.writeObject(response);
            }
        } catch (IOException e) {
            System.out.println("Keine neuen Requests mehr!");
        }
    }

    //private Response processRequest(Request request) throws IOException {
        //String dateiname = request.getDateiname();
        //int loeschen = request.getLoeschen();
        //Datareader datareader = new Datareader(dateiname, loeschen);
        //String inhalt = datareader.readDatei();
      //  return new Response(inhalt);
    //}
}
