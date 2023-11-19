import java.io.*;
import java.net.*;

public class echoclient {
    public static void main (String[] args) throws IOException{
        try {
            Socket socket = new Socket("localhost",6103);
            System.out.println("Connected to server");

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String line;

            while((line = in.readLine()) != null){
                out.println(line);
            }
            socket.close();
            in.close();
            out.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}   