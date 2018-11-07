import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputStream {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = null;
		try {
			sc = new Scanner(new BufferedReader(new FileReader("any.txt")));
			while (sc.hasNext()) {
				System.out.println(sc.next());
				
			}
		} finally {
			if (sc!= null) {
				sc.close();
			}
		}
	}
}
