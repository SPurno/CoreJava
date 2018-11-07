import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamClass {
	public static void main(String[] args) throws IOException {
		
		new ByteStreamClass().ReadFile();
	}
	
	/* Method for File Read and Write */
	public void ReadFile() throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("any.txt");
			out = new FileOutputStream("output.json");
			int c;
			while((c = in.read()) != -1) {
			out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		System.out.println("File Write Successful ! Thank You");
		}
	}
}
