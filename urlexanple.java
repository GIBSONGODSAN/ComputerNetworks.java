package urld;
import java.net.URL;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class urlexanple {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.guthib.com/");
	    BufferedReader in = null;
	    FileWriter writer = null;
		try {
			in = new BufferedReader(new InputStreamReader(url.openStream()));
			writer = new FileWriter("output.txt");
			String line;
			while ((line = in.readLine()) != null) {
				  System.out.println(line);
				  writer.write(line + "\n"); // Write each line to the file
				}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
	}
}
