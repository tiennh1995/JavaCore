package lecture5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RWData {
	public static void main(String[] args) throws IOException {
		DataOutputStream dataOut = null;
		DataInputStream dataIn;
		int i = 10;
		double d = 1023.56;
		boolean b = true;

		try {
			dataOut = new DataOutputStream(new FileOutputStream("C:\\tien_btjava\\testdata"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			System.out.println("Writing " + i);
			dataOut.writeInt(i);
			System.out.println("Writing " + d);
			dataOut.writeDouble(d);
			System.out.println("Writing " + b);
			dataOut.writeBoolean(b);
			System.out.println("Writing " + 12.2 * 7.4);
			dataOut.writeDouble(12.2 * 7.4);
		} catch (IOException e) {
			e.printStackTrace();
		}

		dataOut.close();

		try {
			dataIn = new DataInputStream(new FileInputStream("C:\\tien_btjava\\testdata"));
		} catch (IOException exc) {
			System.out.println("Cannot open file.");
			return;
		}

		try {
			i = dataIn.readInt();
			System.out.println("Reading " + i);
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
			b = dataIn.readBoolean();
			System.out.println("Reading " + b);
			d = dataIn.readDouble();
			System.out.println("Reading " + d);
		} catch (IOException exc) {
			System.out.println("Read error.");
		}

		dataIn.close();
	}
}
