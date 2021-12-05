package edu.ben.lab8;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class HexConverterTest {
    @ParameterizedTest
    @MethodSource("provideIntConvertHexToDecimal")
    void testConvertHexToDecimal(String value, int expected) {
        assert HexConverter.convertHexToDecimal(value) == expected;
    }

    private static Stream<Arguments> provideIntConvertHexToDecimal() {
        return Stream.of(
                Arguments.of("1010", 4112),
                Arguments.of("1101", 4353),
                Arguments.of("01", 1),
                Arguments.of("10", 16),
                Arguments.of("1111", 4369)

        );

    }

    @ParameterizedTest
    @MethodSource("provideCustomInputException")
    void testCustomInputException(String arg, String expected) {
        CustomInputException e = assertThrows(CustomInputException.class, () -> HexConverter.toDecimal(arg));
        e.getMessage().equals(expected);
    }

    private static Stream<Arguments> provideCustomInputException() {
        return Stream.of(
                Arguments.of("-010","-010 is not a valid hex digit." ),
                Arguments.of("110z","110z is not a valid hex digit." )


        );

    }
}
