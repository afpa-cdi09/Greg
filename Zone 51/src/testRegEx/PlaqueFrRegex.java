package testRegEx;

import java.util.regex.Pattern;

public class PlaqueFrRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String plaque = "DA-125-ZE" ;

		String patternOld ="\\d{1,4}[A-Z]{2}\\d{2}" ;
		String patternNew1 = "[A-Z][A-Z][0-9][0-9][0-9][A-Z][A-Z]";
		String patternNew2 ="[A-Z]{2}-\\d{3}-[A-Z]{2}" ;

		if ((Pattern.matches(patternOld, plaque)) || (Pattern.matches(patternNew1, plaque))
				|| (Pattern.matches(patternNew2, plaque)))

			System.out.println("Plaque OK");
		else {
			System.out.println("Plaque Not OK");
		}

	}

}
