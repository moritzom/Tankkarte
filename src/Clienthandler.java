import java.io.*;
import java.net.*;
import java.util.concurrent.locks.ReentrantLock;

class Clienthandler implements Runnable {
    private Socket clientSocket;
    private ReentrantLock lock;

    public Clienthandler(Socket socket) {
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
                Request request = (Request) in.readObject();
                Response response;
                lock.lock();
                try{
                    response = processRequest(request);
                }
                finally {
                    lock.unlock();
                }
                out.writeObject(response);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Keine neuen Requests mehr!");
        }
    }

    private Response processRequest(Request request) throws IOException {
        String inhalt = request.getMessage();
        System.out.println("Message: " + inhalt);
        return new Response(inhalt);
    }
}
