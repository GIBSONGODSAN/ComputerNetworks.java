import java.io.*;
import java.net.*;

public class chatclient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            System.out.println("Connected to server.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;

            while (true) {
                // Reading from server
                if (input.ready()) {
                    message = input.readLine();
                    if (message == null || message.equalsIgnoreCase("exit")) {
                        break;
                    }
                    System.out.println("Server: " + message);
                }

                // Sending to server
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
