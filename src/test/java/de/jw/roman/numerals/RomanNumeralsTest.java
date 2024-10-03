package de.jw.roman.numerals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RomanNumeralsTest {
	
	@ParameterizedTest
	@MethodSource
	void testNumber(int inputNumber, String romanNumeral) {
		assertEquals(romanNumeral, RomanNumeralsConverter.convert(inputNumber));
	}
	
	private static Stream<Arguments> testNumber() {
		return Stream.of(
			Arguments.of(-1,"ungültige Nummer"),
			Arguments.of(4000,"ungültige Nummer"),
			Arguments.of(1,"I"),
			Arguments.of(2,"II"),
			Arguments.of(3,"III"),
			Arguments.of(4,"IV"),
			Arguments.of(5,"V"),
			Arguments.of(8,"VIII"),
			Arguments.of(9,"IX"),
			Arguments.of(10,"X"),
			Arguments.of(20,"XX"),
			Arguments.of(30,"XXX"),
			Arguments.of(40,"XL"),
			Arguments.of(50,"L"),
			Arguments.of(80,"LXXX"),
			Arguments.of(90,"XC"),
			Arguments.of(100,"C"),
			Arguments.of(200,"CC"),
			Arguments.of(300,"CCC"),
			Arguments.of(400,"CD"),
			Arguments.of(500,"D"),
			Arguments.of(800,"DCCC"),
			Arguments.of(900,"CM"),
			Arguments.of(1000,"M"),
			Arguments.of(2000,"MM"),
			Arguments.of(3000,"MMM"),
			Arguments.of(260,"CCLX"),
			Arguments.of(21,"XXI"),
			Arguments.of(269,"CCLXIX"),
			Arguments.of(3999,"MMMCMXCIX")
		);
	}
}
