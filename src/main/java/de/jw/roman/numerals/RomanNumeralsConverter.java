package de.jw.roman.numerals;

import java.util.Map;

/*
 * Class to convert integers from 1 to 3999 into Roman Numerals
 */
public class RomanNumeralsConverter {
	
	private static final Map<Integer, RomanLiteralsForDecadicUnit> NUMBERS_MAP = Map.of(
		1000, RomanLiteralsForDecadicUnit.THOUSANDS,
		100, RomanLiteralsForDecadicUnit.HUNDREDS,
		10, RomanLiteralsForDecadicUnit.TENS,
		1, RomanLiteralsForDecadicUnit.ONES
	);
	
	public static String convert(int number) {
		if(number < 1 || number > 3999) {
			return "ungültige Nummer";
		}
		StringBuilder sb = new StringBuilder("");
		for(int modulo = 1000; modulo >= 1; modulo /= 10) {
			int largestDecadicUnit = number - (number % modulo);
			convertNumberTenth(number, sb, modulo);
			number -= largestDecadicUnit;
		}
		return sb.toString();
	}

	private static void convertNumberTenth(int number, StringBuilder sb, int modulo) {
		RomanLiteralsForDecadicUnit numerals = NUMBERS_MAP.get(modulo);
		int tenth = number / modulo;
		if(modulo < 1000) {
			if(tenth == 4 || tenth == 9) {
				sb.append(numerals.oneNumeral);
			}
			if(tenth >= 4 && tenth < 9) {
				sb.append(numerals.fiveNumeral);
				tenth -= 5;
			}
			if(tenth == 9 ) {
				sb.append(numerals.nextTenNumeral);
			}
		}
		if(tenth < 9 && tenth > 0 ) {
			for(int i = 0; i < tenth; i++) {
				sb.append(numerals.oneNumeral);
			}
		}
	}
}
