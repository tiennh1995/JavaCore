package lecture2;

import java.util.StringTokenizer;

public class StringTest {
	public static void main(String[] args) {
		// StringTest.useLastIndex(" Nguyen Huu Tien ");
		// StringTest.useSplit("Nguyen Huu Tien");
		// StringTest.useStringTokenizer("Nguyen Huu Tien");
		// StringTest.maxWithSplit("Hello, world.... hehe");
		// StringTest.maxWithStringTokenizer("Hello, world1.... hehe");
		// StringTest.maxWithSubString("Hello1? --- abc, world1.... hehe ahha;
		// (oh:k)
		// `aaa`");
		StringTest.maxWithCharAt("Hello1? --- abc, world1.... hehe ahha; (oh:k)  `aaa`");
	}

	public static void useLastIndex(String fullName) {
		fullName = fullName.replaceAll(" +", " ");
		fullName = fullName.trim();
		System.out.println("Ten truoc khi dao nguoc: " + fullName);

		String newFullName = "", name;
		int lastIndex = fullName.lastIndexOf(" ");
		name = fullName.substring(lastIndex + 1, fullName.length());
		newFullName += name;
		newFullName += " " + fullName.substring(0, lastIndex);
		System.out.println("Ten sau khi dao nguoc: " + newFullName);

	}

	public static void useSplit(String fullName) {
		fullName = fullName.replaceAll(" +", " ");
		fullName = fullName.trim();
		System.out.println("Ten truoc khi dao nguoc: " + fullName);

		String[] names = fullName.split(" ");
		StringBuffer newFullName = new StringBuffer(names[names.length - 1]);
		for (int i = 0; i < names.length - 1; i++) {
			newFullName.append(" " + names[i]);
		}

		System.out.println("Ten sau khi dao nguoc: " + newFullName);
	}

  public static void useStringTokenizer(String fullName) {
    fullName = fullName.replaceAll(" +", " ");
    fullName = fullName.trim();
    System.out.println("Ten truoc khi dao nguoc: " + fullName);

    StringTokenizer st = new StringTokenizer(fullName);
    StringBuffer newFullName = new StringBuffer("");
    StringBuffer name = new StringBuffer("");

    while (st.hasMoreTokens()) {
      name.append(st.nextToken() + " ");
      if (st.hasMoreTokens()) {
        newFullName.append(name);
      } else {
        newFullName.insert(0, name);
      }
      name.delete(0, name.length());
    }

    System.out.println("Ten sau khi dao nguoc: " + newFullName);
  }

	// Use split
	public static void maxWithSplit(String str) {
		System.out.println("Xau da cho la: '" + str + "'");
		String[] tokens = str.split("\\,|\\.| ");
		str = "";
		for (int i = 0; i < tokens.length; i++)
			if (!tokens[i].equals(""))
				str += tokens[i] + " ";

		str = str.trim();
		tokens = str.split(" ");
		int maxLength = tokens[0].length(), index[] = new int[tokens.length], indexLength = 1;
		index[0] = 0;
		for (int i = 1; i < tokens.length; i++)
			if (tokens[i].length() >= maxLength) {
				if (tokens[i].length() > maxLength) {
					maxLength = tokens[i].length();
					indexLength = 1;
					index[0] = i;
				} else {
					index[indexLength++] = i;
				}
			}

		System.out.println("Tu co do dai nhat voi " + maxLength + " ki tu la: ");
		for (int i = 0; i < indexLength; i++) {
			System.out.println("'" + tokens[index[i]] + "' o vi tri: " + index[i]);
		}
	}

	// use StringTokenizer
	public static void maxWithStringTokenizer(String str) {
		System.out.println("Xau da cho la: '" + str + "'");
		StringTokenizer st = new StringTokenizer(str, "\\,|\\.| ");
		String word;
		int maxLength = 0, index[] = new int[st.countTokens()], indexLength = 0, i = 0;
		while (st.hasMoreTokens()) {
			word = st.nextToken();
			if (!word.equals("")) {
				if (word.length() > maxLength) {
					maxLength = word.length();
					indexLength = 1;
					index[0] = i;
				} else {
					index[indexLength++] = i;
				}
				i++;
			}
		}

		System.out.println("Tu co do dai nhat voi " + maxLength + " ki tu la: ");
		st = new StringTokenizer(str, "\\,|\\.| ");
		i = 0;
		while (st.hasMoreTokens()) {
			word = st.nextToken();
			if (word.length() == maxLength) {
				System.out.println("'" + word + "' o vi tri: " + index[i]);
				i++;
			}
		}
	}

	// Use substring
	public static void maxWithSubString(String str) {
		System.out.println("Xau da cho la: '" + str + "'");
		str = str.replaceAll("[\\.+]|[,+]|[-+]|[?+]|[;+]|[:+]|['+]|[\"+]|[(+]|[)+]|[`+]", " ");
		str = str.replaceAll(" +", " ");
		str = str.trim();

		String word;
		int maxLength = 0, index[] = new int[str.length()], indexLength = 0, maxTokens = 0,
				beginIndex = str.lastIndexOf(' '), lastIndex = str.length();
		boolean loop = true;
		while (loop) {
			if (beginIndex != -1) {
				word = str.substring(beginIndex + 1, lastIndex);
				str = str.substring(0, beginIndex);
				beginIndex = str.lastIndexOf(' ');
				lastIndex = str.length();
			} else {
				word = str.replaceAll(" ", "");
				loop = false;
			}

			if (word.length() >= maxLength) {
				if (word.length() > maxLength) {
					maxLength = word.length();
					indexLength = 1;
					index[0] = maxTokens;
				} else {
					index[indexLength++] = maxTokens;
				}
			}
			maxTokens++;
		}
		System.out.println("Tu co do dai nhat voi " + maxLength + " ki tu, o vi tri: ");
		for (int i = 0; i < indexLength; i++)
			System.out.println(maxTokens - index[i] - 1 + " ");
	}

	// Use charAt
	public static void maxWithCharAt(String str) {
		System.out.println("Xau da cho la: '" + str + "'");
		str = str.replaceAll("[\\.+]|[,+]|[-+]|[?+]|[;+]|[:+]|['+]|[\"+]|[(+]|[)+]|[`+]", " ");
		str = str.replaceAll(" +", " ");
		str = str.trim();
		int maxLength = 0, index[] = new int[str.length()], indexLength = 0, maxTokens = 0;
		char c;
		int beginIndex = 0;
		String word;

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if ((c == ' ') || (i == str.length() - 1)) {
				if (c == ' ') {
					word = str.substring(beginIndex, i);
					maxTokens++;
					beginIndex = i + 1;
				} else
					word = str.substring(beginIndex, i + 1);
					
				if (word.length() >= maxLength) {
					if (word.length() > maxLength) {
						maxLength = word.length();
						indexLength = 1;
						index[0] = maxTokens;
					} else {
						index[indexLength++] = maxTokens;
					}
				}
			} 
		}

		System.out.println("Tu co do dai nhat voi " + maxLength + " ki tu, o vi tri: ");
		for (int i = 0; i < indexLength; i++)
			System.out.println(index[i] + " ");
	}
}
