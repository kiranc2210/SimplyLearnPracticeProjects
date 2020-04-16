package stringExample;


public class JavaStringClass {

	public static void main(String[] args) {

		// String Literal
		String str = "India is the more buetyfull Country";

		System.out.println(str.length());

		// String created using New operator
		String str1 = new String("java");
		System.out.println(str1.length());

		char chr = str.charAt(22);
		System.out.println(chr);

		// Strinng Buffer CClass
		StringBuffer sbf = new StringBuffer("String Buffer class");

		System.out.println(sbf);

		// String Builder Class
		StringBuilder sbr = new StringBuilder();
		sbr.append(str);

		boolean truestr = str.equals(sbr);
		System.out.println(truestr);

		char y = 'y';
		System.out.println(sbr.hashCode());
		System.out.println(str.lastIndexOf(y));
		System.out.println("str ends with" + " " + str.endsWith("ry"));

		if (str.compareTo(sbr.toString()) == 0) {
			System.out.println("Str and sbr both are equal");
		}
		System.out.println(str.toUpperCase());

		System.out.println(str.toLowerCase());

		System.out.println(str.isEmpty());

		System.out.println(str.toCharArray());

		char[] str2 = new char[str.length()];
		str.getChars(5, 15, str2, 0);
		System.out.println(str2);

		String[] str3 = str.split(" ");
		//System.out.println(str3.toString());

	}

}

