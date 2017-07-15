package arrayandstring;

import java.util.StringTokenizer;

public class TestAS {
  public static void main(String[] args) {
    // Test 1
    // TestAS.average();

    // Test 2
    // TestAS.getNegative();

    // Test 3
//    TestAS.calPositive();

    // Test 4
    // TestAS.getFrequencyWith(1);

    // Test 5
    // TestAS.printIndexWith(2);

    // Test 6
    // TestAS.getFrequencyWith(2);

    // Test 7
    // TestAS.getFrequencyWith(0);

    // Test 8
    // TestAS.sort();

    // Test 9
    TestAS.maxtrix();

    // Test 10
    // TestAS.countWord();

    // Test 11
    // TestAS.stringUpcase();

    // Test 12
    // TestAS.standardizedString();

    // Test 13
    // TestAS.maxLengthString();

    // Test 14
    // TestAS.useStringTokenizer("Nguyen Huu Tien");
  }

  // 1. Cho trÆ°á»›c má»™t máº£ng gá»“m 10 pháº§n tá»­.
  // Viáº¿t chÆ°Æ¡ng trÃ¬nh tÃ­nh trung bÃ¬nh cá»™ng cá»§a cÃ¡c pháº§n tá»­ cá»§a
  // máº£ng.
  public static void average() {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for (int i = 1; i < array.length; i++)
      array[0] += array[i];

    System.out.println("Trung binh cong cua mang la: " + (float) array[0] / array.length);
  }

  // 2. Cho trÆ°á»›c má»™t máº£ng gá»“m 10 pháº§n tá»­.
  // Viáº¿t chÆ°Æ¡ng trÃ¬nh liá»‡t kÃª táº¥t cáº£ cÃ¡c pháº§n tá»­ cá»§a máº£ng
  // cÃ³ giÃ¡ trá»‹ Ã¢m.
  public static void getNegative() {
    int[] array = { 1, 2, -3, 4, -5, 6, 7, 8, -9, 10 };
    System.out.print("Cac phan tu co gia tri am la: ");
    for (int i = 0; i < array.length; i++)
      if (array[i] < 0)
        System.out.print(array[i] + " ");
    System.out.println("");
  }

  // 3. Cho trÆ°á»›c má»™t máº£ng gá»“m 10 pháº§n tá»­.
  // Viáº¿t chÆ°Æ¡ng trÃ¬nh tÃ­nh tÃ­ch táº¥t cáº£ cÃ¡c pháº§n tá»­ cá»§a máº£ng
  // cÃ³ giÃ¡ trá»‹ dÆ°Æ¡ng.
  public static void calPositive() {
    int[] array = { 1, 2, -3, 4, -5, 6, -7, -8, -9, -10 };
    int result = 1, numbers = 0;
    for (int i = 0; i < array.length; i++)
      if (array[i] > 0) {
        result *= array[i];
        numbers++;
      }
    if (numbers > 0) {
      System.out.println("Tich cac so duong trong mang la: " + result);
    } else {
      System.out.println("Khong co so duong trong mang");
    }
  }

  // 4. Cho trÆ°á»›c dÃ£y sá»‘ thá»±c a0, a1... an-1.
  // HÃ£y liá»‡t kÃª cÃ¡c pháº§n tá»­ xuáº¥t hiá»‡n trong dÃ£y Ä‘Ãºng má»™t láº§n.
  // Voi num = 1
  public static void getFrequencyWith(int num) {
    float[] array = { 1, 2, 3, 4, 1, 4, 6, 9, 3 };
    float[] result1 = new float[array.length];
    int result2[] = new int[array.length], resultLength = 0;
    for (int i = 0; i < array.length; i++) {
      int index = TestAS.checkFrequency(result1, array[i]);
      if (index >= 0) {
        result2[index]++;
      } else {
        result1[resultLength] = array[i];
        result2[resultLength] = 1;
        resultLength++;
      }
    }

    if (num > 0) {
      System.out.println("Cac phan tu xuat hien dung " + num + " lan trong mang la: ");
      for (int i = 0; i < resultLength; i++)
        if (result2[i] == num)
          System.out.println(result1[i] + " : " + result2[i]);
    } else {
      System.out.println("Danh sach cac phan tu va tan suat xuat hien trong mang la: ");
      for (int i = 0; i < resultLength; i++)
        System.out.println(result1[i] + " : " + result2[i]);
    }
  }

  public static int checkFrequency(float[] array, float f) {
    for (int i = 0; i < array.length; i++)
      if (array[i] == f)
        return i;
    return -1;
  }

  // 5. Cho trÆ°á»›c dÃ£y sá»‘ thá»±c a0, a1..., an-1.
  // HÃ£y xÃ¡c Ä‘á»‹nh chá»‰ sá»‘ cá»§a pháº§n tá»­ Ä‘áº§u tiÃªn trong dÃ£y báº±ng
  // giÃ¡ trá»‹ x cho trÆ°á»›c.
  // Náº¿u khÃ´ng cÃ³ pháº§n tá»­ nhÆ° váº­y, in ra -1.
  public static void printIndexWith(float x) {
    float[] array = { 1, 2, 3, 4, 5, 6 };
    for (int i = 0; i < array.length; i++)
      if (array[i] == x) {
        System.out.println("Chi so dau tien cua phan tu " + x + " la: " + i);
        return;
      }

    System.out.println("Chi so dau tien cua phan tu " + x + " la: -1");
  }

  // 6. Cho trÆ°á»›c dÃ£y sá»‘ thá»±c a0, a1..., an-1.
  // HÃ£y liá»‡t kÃª cÃ¡c pháº§n tá»­ xuáº¥t hiá»‡n trong dÃ£y Ä‘Ãºng 2 láº§n.
  // Dung phuong thuc getFrequencyWith(int num) da viet o tren voi num = 2

  // 7. Cho trÆ°á»›c dÃ£y sá»‘ thá»±c a0, a1..., an-1.
  // In ra mÃ n hÃ¬nh sá»‘ láº§n xuáº¥t hiá»‡n cá»§a cÃ¡c pháº§n tá»­.
  // Dung phuong thuc getFrequencyWith(int num) da viet o tren voi num = 0

  // 8. Cho trÆ°á»›c dÃ£y sá»‘ thá»±c a0, a1..., an-1.
  // Sáº¯p xáº¿p dÃ£y theo thá»© tá»± tÄƒng dáº§n vÃ  in ra mÃ n hÃ¬nh.
  public static void sort() {
    System.out.println("Day truoc khi sap xep: ");
    float[] array = { 1, 14, 6, 9, 3, 12, 4 };
    for (int i = 0; i < array.length; i++)
      System.out.print(array[i] + " ");
    System.out.println("");

    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[i]) {
          float temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }

    System.out.println("Day sau khi sap xep: ");
    for (int i = 0; i < array.length; i++)
      System.out.print(array[i] + " ");
    System.out.println("");
  }

  // 9. Cho trÆ°á»›c ma tráº­n A cÃ³ n dÃ²ng, m cá»™t, cÃ¡c pháº§n tá»­ lÃ 
  // nhá»¯ng sá»‘ nguyÃªn lá»›n
  // hÆ¡n 0 vÃ  nhá»� hÆ¡n 100.
  // Viáº¿t chÆ°Æ¡ng trÃ¬nh thá»±c hiá»‡n cÃ¡c chá»©c nÄƒng sau:
  // - TÃ¬m pháº§n tá»­ lá»›n nháº¥t cá»§a ma tráº­n cÃ¹ng chá»‰ sá»‘ cá»§a sá»‘
  // Ä‘Ã³.
  // - TÃ¬m vÃ  in ra cÃ¡c pháº§n tá»­ lÃ  sá»‘ nguyÃªn tá»‘ cá»§a ma tráº­n.
  // - Sáº¯p xáº¿p táº¥t cáº£ cÃ¡c cá»™t cá»§a ma tráº­n theo thá»© tá»± tÄƒng
  // dáº§n vÃ  in káº¿t quáº£ ra
  // mÃ n hÃ¬nh.

  public static void maxtrix() {
    int[][] array = { { 1, 5, 8, 0 }, { 2, 6, 1, 8 }, { 6, 9, 7, 1 }, { 9, 3, 2, 6 } };

    // 1.1
    int max = array[0][0], maxIndexesLength = 1;
    int[] maxIIndexes = new int[array.length];
    int[] maxJIndexes = new int[array[0].length];
    maxIIndexes[0] = 0;
    maxJIndexes[0] = 0;
    int i, j;
    System.out.println("Phan tu lon trong cua ma tran cung chi so voi no tuong ung la: ");
    for (i = 0; i < array.length; i++) {
      for (j = 0; j < array[i].length; j++) {
        if (max < array[i][j]) {
          max = array[i][j];
          maxIndexesLength = 1;
          maxIIndexes[0] = i;
          maxJIndexes[0] = j;
        } else if (max == array[i][j]) {
          maxIIndexes[maxIndexesLength] = i;
          maxJIndexes[maxIndexesLength] = j;
          maxIndexesLength++;
        }
      }
    }
    for (i = 0; i < maxIndexesLength; i++)
      System.out.println("[" + maxIIndexes[i] + "][" + maxJIndexes[i] + "] : " + max);

    // 1.2
    System.out.println("\nDach sach cac phan tu la so nguyen to trong ma tran: ");
    for (i = 0; i < array.length; i++) {
      for (j = 0; j < array[i].length; j++) {
        if (checkPrimeNumber(array[i][j]))
          System.out.println("[" + i + "][" + j + "] : " + array[i][j]);
      }
    }

    // 1.3
    System.out.println("\nMa tran truoc khi sap xep: ");
    for (i = 0; i < array.length; i++) {
      for (j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println("");
    }

    System.out.println("Ma tran sau khi sap xep: ");
    int2Sort(array);

    for (i = 0; i < 4; i++) {
      for (j = 0; j < 4; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public static boolean checkPrimeNumber(int x) {
    if (x == 0)
      return false;

    for (int i = 2; i <= Math.sqrt(x); i++)
      if (x % i == 0)
        return false;
    return true;
  }

  public static void int2Sort(int[][] array) {
    for (int i = 0; i < 4; i++)
      for (int j = 0; j < 4; j++)
        for (int k = j + 1; k < 4; k++)
          if (array[j][i] > array[k][i]) {
            int temp = array[j][i];
            array[j][i] = array[k][i];
            array[k][i] = temp;
          }
  }

  // 10. Cho trÆ°á»›c má»™t xÃ¢u kÃ½ tá»±. Ä�áº¿m sá»‘ tá»« cá»§a xÃ¢u kÃ½ tá»±
  // Ä‘Ã³.
  // VÃ­ dá»¥ xÃ¢u " TrÆ°á»�ng há»�c " cÃ³ 2 tá»«.
  public static void countWord() {
    String str = "  Hello world  ";
    str = str.replaceAll(" +", " ");
    str = str.trim();

    String[] result = str.split(" ");
    System.out.println("Xau '" + str + "' co " + result.length + " tu");
  }

  // 11. Viáº¿t chÆ°Æ¡ng trÃ¬nh Ä‘á»•i xÃ¢u kÃ½ tá»± cho trÆ°á»›c sang chá»¯ in
  // hoa rá»“i in káº¿t quáº£
  // ra mÃ n hÃ¬nh.
  // VÃ­ dá»¥: Tá»« xÃ¢u â€œabcdAbcDâ€� sáº½ in xÃ¢u â€œABCDABCDâ€�.
  public static void stringUpcase() {
    String str = "abcdAbcD";
    System.out.println("Xau truoc khi doi la: '" + str + "'");
    str = str.toUpperCase();
    System.out.println("Xau sau khi doi la: '" + str + "'");
  }

  // 12. Viáº¿t chÆ°Æ¡ng trÃ¬nh thá»±c hiá»‡n chuáº©n hoÃ¡ má»™t xÃ¢u kÃ½ tá»± cho
  // trÆ°á»›c
  // (loáº¡i bá»� cÃ¡c dáº¥u cÃ¡ch thá»«a, chuyá»ƒn kÃ½ tá»± Ä‘áº§u má»—i tá»«
  // thÃ nh chá»¯ hoa, cÃ¡c kÃ½ tá»±
  // khÃ¡c thÃ nh chá»¯ thÆ°á»�ng).
  public static void standardizedString() {
    String str = "  hello  worlD   ";
    System.out.println("Xau truoc khi chuan hoa la: '" + str + "'");

    str = str.replaceAll("[\\.+]|[,+]|[-+]|[?+]|[;+]|[:+]|['+]|[\"+]|[(+]|[)+]|[`+]", " ");
    str = str.replaceAll(" +", " ");
    str = str.trim();

    String[] arrStr = str.split(" ");
    str = "";
    for (int i = 0; i < arrStr.length; i++) {
      char[] arr = arrStr[i].toCharArray();
      if (arr[0] >= 'a' && arr[0] <= 'z')
        arr[0] -= 'a' - 'A';
      for (int j = 1; j < arr.length; j++)
        if (arr[j] >= 'A' && arr[j] <= 'Z')
          arr[j] += 'a' - 'A';
      arrStr[i] = String.valueOf(arr);
      str += arrStr[i] + " ";
    }
    str = str.trim();
    System.out.println("Xau sau khi chuan hoa la: '" + str + "'");
  }

  // 13. Viáº¿t chÆ°Æ¡ng trÃ¬nh tÃ¬m tá»« dÃ i nháº¥t trong xÃ¢u kÃ½ tá»± cho
  // trÆ°á»›c. Tá»« Ä‘Ã³ xuáº¥t
  // hiá»‡n á»Ÿ vá»‹ trÃ­ nÃ o?
  // (ChÃº Ã½: náº¿u cÃ³ nhiá»�u tá»« cÃ³ Ä‘á»™ dÃ i giá»‘ng nhau thÃ¬ chá»�n tá»«
  // Ä‘áº§u tiÃªn tÃ¬m tháº¥y).
  public static void maxLengthString() {
    String str = "hello, world. I'm fine.";
    System.out.println("Xau da cho la: '" + str + "'");
    String[] tokens = str.split("\\,|\\.| ");
    str = "";
    for (int i = 0; i < tokens.length; i++)
      if (!tokens[i].equals(""))
        str += tokens[i] + " ";

    str = str.trim();
    tokens = str.split(" ");
    int maxLength = tokens[0].length(), index = 0;
    for (int i = 1; i < tokens.length; i++)
      if (tokens[i].length() > maxLength) {
        maxLength = tokens[i].length();
        index = i;
      }

    System.out.println("Tu co do dai nhat la: '" + tokens[index] + "' o vi tri: " + index);
  }

  // 14. Cho trÆ°á»›c má»™t xÃ¢u há»� tÃªn theo cáº¥u trÃºc: há»�...Ä‘á»‡m...tÃªn;
  // viáº¿t chÆ°Æ¡ng trÃ¬nh chuyá»ƒn xÃ¢u Ä‘Ã³ sang biá»ƒu diá»…n theo cáº¥u trÃºc
  // tÃªnâ€¦há»�â€¦Ä‘á»‡m.
  public static void useStringTokenizer(String fullName) {
    fullName = fullName.replaceAll(" +", " ");
    fullName = fullName.trim();
    System.out.println("Ten truoc khi dao nguoc: " + fullName);

    StringTokenizer st = new StringTokenizer(fullName);
    StringBuffer newFullName = new StringBuffer("");
    String name;
    while (st.hasMoreTokens()) {
      name = st.nextToken() + " ";
      if (st.hasMoreTokens()) {
        newFullName.append(name);
      } else {
        newFullName.insert(0, name);
      }
    }
    System.out.println("Ten sau khi dao nguoc: " + newFullName);
  }
}
