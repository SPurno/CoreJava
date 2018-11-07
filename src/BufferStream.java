import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class BufferStream {

	public static void main(String[] args) throws IOException{
		String url = "https://api.github.com/users/spurno";
		String fileName = "User.json";
		BufferedInputStream buffer = null;
		FileOutputStream output = null;
				
		try {
			buffer = new BufferedInputStream(new URL(url).openStream());
			output = new FileOutputStream(fileName);
			int c;
			while((c = buffer.read()) != -1) {
				output.write(c);
			}
		} finally {
			if (buffer != null) {
				buffer.close();
			}
			if (output !=null) {
				output.close();
			}
			System.out.println("File Pushed into: " + fileName);
		}
	}
}
