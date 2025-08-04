package test;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import main.CountWordClumps;

public class CountWordClumpsTest {

	@ParameterizedTest
	@MethodSource("testCases")
	void testCountClumps(String testName, int[] input, int expected) {
		assertEquals(expected, CountWordClumps.countClumps(input));
	}

	private static Stream<Arguments> testCases() {
		return Stream.of(Arguments.of("TC01", null, 0),
                Arguments.of("TC02", new int[] {}, 0),
				Arguments.of("TC03", new int[] { 1,2,3 }, 0),
                Arguments.of("TC04", new int[] { 1, 1,2 }, 1),
				Arguments.of("TC05", new int[] { 1, 1,1 },1));
	}
}
