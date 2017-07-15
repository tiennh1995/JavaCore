package lecture5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		int i;
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream("C:\\tien_btjava\\test.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			fout = new FileOutputStream("C:\\tien_btjava\\test_copy.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		fin.close();
		fout.close();
	}
}
