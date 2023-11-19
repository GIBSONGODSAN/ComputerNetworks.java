import java.io.*;
import java.net.URI;

public class url {
    public static void main (String[] args) throws IOException{
        URI uri = URI.create("https://guthib.com/");
        BufferedReader in = null;
        FileWriter out = null;

        try{
            in = new BufferedReader(new InputStreamReader(uri.toURL().openStream()));
            out = new FileWriter("output.txt");
            String line;
            while((line = in.readLine()) != null){
                System.out.println(line);
                out.write(line+'\n');
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(in != null){
                    in.close();
                }
                if(out != null){
                    out.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}