import java.io.*;
import java.net.*;

public class echoserver {
    public static void main (String[] args) throws IOException{
        try {
            ServerSocket serverSocket = new ServerSocket(6103);
            System.out.println("Server is running on port 6103");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;

            while((line = in.readLine()) != null){
                System.out.println(line);
            }

            serverSocket.close();
            socket.close();
            in.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}   