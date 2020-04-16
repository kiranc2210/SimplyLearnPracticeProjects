package regularExpression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegularExpr {

	public static void main(String[] args) {

		System.out.println("First Regular expression");

		String content = "LibreWireLess Technology inc";

		String pattern = ".*Wire.*";

		boolean match = Pattern.matches(pattern, content);

		if (match) {
			System.out.println("match Found");
		} else {
			System.out.println("match not  Found");
		}

		System.out.println("Second Regular expression");

		String content1 = "LibreWireLess Technology Inc";

		String Pattern1 = "[a-z]";
		Pattern p = Pattern.compile(Pattern1);

		Matcher m = p.matcher(content1);

		while (m.find())
			System.out.println(m.replaceAll("*"));

		System.out.println("Third Regular expression");

		String content3 = "452sffg5$#@896+dssar90/**-/-";

		String pattern3 = "[^A-Za-z0-9]";
		Pattern symbols = Pattern.compile(pattern3);
		Matcher match3 = symbols.matcher(content3);

		while (match3.find()) {
			StringBuffer sbf = new StringBuffer();
			sbf.append(match3.start());

			System.out.print(content3.charAt(Integer.parseUnsignedInt(sbf.toString())));

		}

	}

}
