package grandcircus.co;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validPhone("734-555-7884"));
		System.out.println(validDate("08/02/1999"));
		System.out.println(validEmail("+@email.com"));
		System.out.println(validName("Bobbysands"));
		System.out.println(validIndentifier("input@"));

	}

	public static boolean validPhone(String pnum) {
		// checks if string is a valid phone number xxx-xxx-xxxx
		Pattern p = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
		Matcher m = p.matcher(pnum);
		return m.matches();
	}

	public static boolean validDate(String date) {
		// checks for valid date dd//mm/yy
		Pattern p = Pattern.compile("[0-3][0-9]/[0-1][0-9]/\\d{4}");
		Matcher m = p.matcher(date);
		return m.matches();
	}

	public static boolean validEmail(String email) {
		Pattern p = Pattern.compile("[A-Za-z0-9._-]{3,30}@[A-Za-z0-9_-]{5,10}\\.[A-Za-z]{2,3}");
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static boolean validName(String name) {
		// check is string is valid name - starts with capital and no numbers/symbols
		Pattern p = Pattern.compile("[A-Z][a-z]{0,30}");
		Matcher m = p.matcher(name);
		return m.matches();
	}

	public static boolean validIndentifier(String java) {
		// check is string is valid java indentifier - starts with alphanumeric
		// has no
		Pattern p = Pattern.compile("^[a-zA-z$_][a-zA-Z0-9$_]*");
		Matcher m = p.matcher(java);
		return m.matches();
	}
}
