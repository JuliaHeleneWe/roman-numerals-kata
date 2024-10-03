package de.jw.roman.numerals;

/**
 * Describes which literals are needed as symbol for 1, 5 and ten 
 * for Roman Numerals of a decadic unit
 */
enum RomanLiteralsForDecadicUnit {
	ONES('I', 'V', 'X'),
	TENS('X', 'L', 'C'),
	HUNDREDS('C', 'D', 'M'),
	THOUSANDS('M');
	char oneNumeral, fiveNumeral, nextTenNumeral;
	
	RomanLiteralsForDecadicUnit(char oneNumeral, char fiveNumeral, char nextTenNumeral) {
		this.oneNumeral = oneNumeral;
		this.fiveNumeral = fiveNumeral;
		this.nextTenNumeral = nextTenNumeral;
	}

	/**
	 * Roman Literals for thousands, which do not have a symbol for 5000 or 10000
	 */
	RomanLiteralsForDecadicUnit(char oneNumeral) {
		this.oneNumeral = oneNumeral;
	}
}
