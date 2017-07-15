package file;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class TestFile {
  public static void main(String[] args) throws IOException {
    // readByte();
    // myCopy("C:\\tien_btjava\\test.txt", "C:\\tien_btjava\\testCopy.txt");
    // myCopy("C:\\tien_btjava\\testFolder", "C:\\tien_btjava\\testFolderCopy");
    // myCopy("con", "C:\\tien_btjava\\testCopy.txt");
    myDir();
    // manageExaminee();
  }

  // 1. Viết chương trình nhận một dòng văn bản từ người dùng và hiển thị dòng
  // văn bản đó lên màn hình.
  public static void readByte() throws IOException {
    byte data[] = new byte[100];
    System.out.println("Enter some characters.");
    System.in.read(data);
    System.out.println("You entered: ");
    for (int i = 0; i < data.length; i++)
      System.out.print((char) data[i]);
  }

  // 2. Viết chương trình mycopy với hai biến string là filename1, filename2 có
  // chức năng như sau:
  // - Nếu filename1 và filename2 là tên hai file thì chương trình copy nội dung
  // của filename1 sang filename2.
  // - Nếu filename2 là thư mục thì copy filename1 sang thư mục filename2.
  // - Nếu filename1 có tên là “con” thì cho phép tạo file filename2 với nội
  // dung gõ từ bàn phím.
  public static void myCopy(String fileName1, String fileName2) throws IOException {
    if (fileName1.equals("con")) {
      FileOutputStream fout = null;
      try {
        fout = new FileOutputStream(fileName2);
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
      byte data[] = new byte[100];
      System.out.println("Enter some characters.");
      System.in.read(data);
      for (int i = 0; i < data.length; i++)
        fout.write(data[i]);
      fout.close();
    } else {
      copy(new File(fileName1), new File(fileName2));
    }

  }

  public static void copy(File fileName1, File fileName2) throws IOException {
    if (fileName2.isDirectory())
      copyDirectory(fileName1, fileName2);
    else
      copyFile(fileName1, fileName2);
  }

  public static void copyFile(File file1, File file2) throws IOException {
    int i;
    FileInputStream fin = null;
    FileOutputStream fout = null;
    try {
      fin = new FileInputStream(file1.getPath());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    try {
      fout = new FileOutputStream(file2.getPath());
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

  public static void copyDirectory(File file1, File file2) throws IOException {
    if (!file2.exists())
      file2.mkdirs();

    for (File file : file1.listFiles()) {
      File fileCopy = new File(file2, file.getName());
      if (!fileCopy.exists() && file.isDirectory())
        fileCopy.mkdirs();
      copy(file, fileCopy);
    }
  }

  // 3. Viết chương trình mydir có chức năng
  // liệt kê hết các file có tên là filename nhập từ bàn phím (phần mở rộng file
  // là bất kỳ).
  public static void myDir() {
    try {
      BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your name of file: ");
      String fileName = inStream.readLine();
      File file = new File(System.getProperty("user.dir"));
      System.out.println("The result: ");
      for (String listFile : file.list()) {
        int lastIndex = listFile.lastIndexOf('.');
        String name = "";
        if (lastIndex >= 0)
          name = listFile.substring(0, lastIndex);
        else
          name = listFile;

        if (fileName.equals(name)) {
          System.out.println(listFile);
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // 4. Viết chương trình quản lý một danh sách thí sinh.
  // Chương trình cho phép thêm thí sinh, tìm kiếm, cập nhật...
  // Khi bắt đầu, chương trình sẽ lấy dữ liệu từ file thisinh.dat.
  // Khi kết thúc, chương trình ghi lại danh sách thí sinh vào file.
  // Có thể dùng RandomAccessFile hoặc dùng ObjectOutputStream và cài đặt
  // Serializable.
  public static void manageExaminee() throws IOException {
    String fileData = "thisinh.dat";
    Examinee[] listExaminees = new Examinee[20];
    int dataLength = 0, choose = 0;
    dataLength = readData(fileData, listExaminees, dataLength);

    do {
      choose = menu();
      switch (choose) {
      case 1:
        dataLength = func1(fileData, listExaminees, dataLength);
        break;
      case 2:
        func2(fileData, listExaminees, dataLength);
        break;
      case 3:
        func3(fileData, listExaminees, dataLength);
        break;
      case 4:
        func4(fileData, listExaminees, dataLength);
        break;
      case 5:
        System.out.println("Exit!");
        break;
      default:
        System.out.println("Your choice is invalid. Please choice again!");
        continue;
      }
    } while (choose != 5);
  }

  public static int menu() {
    try {
      System.out.println("------------Menu mange examinees------------");
      System.out.println("1. Add examinee");
      System.out.println("2. Search examinee by name");
      System.out.println("3. Update infomation of examinee");
      System.out.println("4. Show list examinees");
      System.out.println("5. Exit");
      System.out.println("Enter your choice: ");
      BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
      return Integer.valueOf(buff.readLine());
    } catch (Exception e) {
      return 0;
    }
  }

  public static int func1(String fileData, Examinee[] listExaminees, int dataLength) {
    try {
      Examinee ex = newExaminee();
      listExaminees[dataLength++] = ex;
      System.out.println(dataLength);
      writeData(fileData, listExaminees, dataLength);
    } catch (Exception e) {
      System.out.println("Add fail!");
      return dataLength;
    }
    System.out.println("Added!");
    return dataLength;
  }

  public static void func2(String fileData, Examinee[] listExaminees, int dataLength) {
    try {
      BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter examinee's name: ");
      String name = buff.readLine();
      int[] results = searchExaminee(name, listExaminees, dataLength);
      if (results[0] == -1)
        System.out.println("No result!");
      else {
        System.out.println("Result search for '" + name + "' : ");
        for (int i = 0; i < dataLength; i++) {
          if (results[i] == -1)
            break;
          else {
            System.out
                .println("id: " + listExaminees[results[i]].getId() + ", name: " + listExaminees[results[i]].getName());
          }
        }
      }
    } catch (Exception e) {
      System.out.println("Search fail!");
    }
  }

  public static void func3(String fileData, Examinee[] listExaminees, int dataLength) {
    try {
      BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter examinee's id: ");
      int index = searchByID(Integer.parseInt(buff.readLine()), listExaminees, dataLength);
      if (index != -1) {
        System.out.println("Examinee: " + listExaminees[index].getName());
        updateInfo(fileData, index, listExaminees, dataLength);
        System.out.println("Updated!");
      } else {
        System.out.println("Examinee is not found!");
      }
    } catch (Exception e) {
      System.out.println("Update fail!");
    }
  }

  public static void func4(String fileData, Examinee[] listExaminees, int dataLength) {
    for (int i = 0; i < dataLength; i++)
      System.out.println("id: " + listExaminees[i].getId() + ", name: " + listExaminees[i].getName());
  }

  public static Examinee newExaminee() throws NumberFormatException, IOException {
    Examinee ex = new Examinee();
    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter examinee's id: ");
    ex.setId(Integer.valueOf(buff.readLine()));
    System.out.println("Enter examinee's name: ");
    ex.setName(buff.readLine());
    return ex;
  }

  public static int[] searchExaminee(String name, Examinee[] listExaminees, int dataLength) {
    int[] results = new int[dataLength];
    Arrays.fill(results, -1);
    int length = 0;
    for (int i = 0; i < dataLength; i++) {
      if (listExaminees[i].getName().equalsIgnoreCase(name))
        results[length++] = i;
    }
    return results;
  }

  public static int searchByID(int id, Examinee[] listExaminees, int dataLength) {
    for (int i = 0; i < dataLength; i++)
      if (listExaminees[i].getId() == id)
        return i;
    return -1;
  }

  public static void updateInfo(String fileData, int index, Examinee[] listExaminees, int dataLength)
      throws NumberFormatException, IOException {
    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter new examinee's name: ");
    listExaminees[index].setName(buff.readLine());
    writeData(fileData, listExaminees, dataLength);
  }

  public static int readData(String fileData, Examinee[] listExaminees, int dataLength) throws IOException {
    File file = new File(fileData);
    if (!file.exists())
      file.createNewFile();
    try {
      FileInputStream fis = new FileInputStream(fileData);
      ObjectInputStream ois = new ObjectInputStream(fis);
      Examinee ex = null;
      while (fis.available() > 0) {
        ex = (Examinee) ois.readObject();
        listExaminees[dataLength++] = ex;
      }
      ois.close();
      fis.close();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (EOFException e) {
      System.out.println("File is empty");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return dataLength;
  }

  public static void writeData(String fileData, Examinee[] listExaminees, int dataLength) throws IOException {
    FileOutputStream fos = new FileOutputStream(fileData);
    ObjectOutputStream out = new ObjectOutputStream(fos);
    for (int i = 0; i < dataLength; i++)
      out.writeObject(listExaminees[i]);
    out.close();
    fos.close();
  }
}
