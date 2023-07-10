package cp1_hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		boolean mail = matchMail(str);

		if (mail) {
			System.out.println("Mail successfully created.");
		} else {
			System.out.println("Wrong mail format.");
		}

	}

	private static boolean matchMail(String mail) {
		String pattern1 = "^[A-Z][A-Za-z0-9]{4,9}@[A-Za-z]+\\.(com|co|kr|net)$";

		Pattern p1 = Pattern.compile(pattern1);
		Matcher m1 = p1.matcher(mail);

		return m1.matches();
	}

}
