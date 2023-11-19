import java.io.*;
import java.net.*;

public class chatserver {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("Server waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;

            while (true) {
                // Reading from client
                if (input.ready()) {
                    message = input.readLine();
                    if (message == null || message.equalsIgnoreCase("exit")) {
                        break;
                    }
                    System.out.println("Client: " + message);
                }

                // Sending to client
                if (userInput.ready()) {
                    message = userInput.readLine();
                    output.println(message);
                    if (message.equalsIgnoreCase("exit")) {
                        break;
                    }
                }
            }

            userInput.close();
            input.close();
            output.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
