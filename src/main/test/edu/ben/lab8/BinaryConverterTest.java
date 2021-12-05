
package edu.ben.lab8;

import edu.ben.lab8.BinaryConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinaryConverterTest {
    @ParameterizedTest
    @MethodSource("provideIntConvertBinaryToDecimal")
    void testConvertBinaryToDecimal(String value, int expected) {
        assert BinaryConverter.convertBinaryToDecimal(value) == expected;
    }

    private static Stream<Arguments> provideIntConvertBinaryToDecimal() {
        return Stream.of(
                Arguments.of("1010", 10),
                Arguments.of("1101", 13),
                Arguments.of("01", 1),
                Arguments.of("10", 2),
                Arguments.of("1111", 15)


        );

    }
    @ParameterizedTest
    @MethodSource("provideCustomInputException")
    void testCustomInputException(String arg, String expected) {
        CustomInputException e = assertThrows(CustomInputException.class, () -> BinaryConverter.toDecimal(arg));
       e.getMessage().equals(expected);
    }

    private static Stream<Arguments> provideCustomInputException() {
        return Stream.of(
                Arguments.of("-010","-010 is not a valid binary digit." ),
                Arguments.of("1103","1102 is not a valid binary digit." )


        );

    }
}
