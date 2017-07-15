package lecture5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin;
		try {
			fin = new FileInputStream("C:\\tien_btjava\\test.txt");
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Usage ShowFile File");
			return;
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			return;
		}

		do {
			i = fin.read();
			if (i != -1)
				System.out.print((char) i);
		} while (i != -1);

		fin.close();
	}
}
