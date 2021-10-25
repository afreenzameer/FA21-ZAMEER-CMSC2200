package edu.ben.lab3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MathTest {
    @ParameterizedTest
    @MethodSource("provideIntAdd")
    void testAdd(int augend, int addend, int expected) {
        assert Math.add(augend, addend) == expected;
    }


    private static Stream<Arguments> provideIntAdd() {
        return Stream.of(
                Arguments.of(2,3,5),
                Arguments.of(2,29,31),
                Arguments.of(7,42, 49),
                Arguments.of(4,2, 6),
                Arguments.of(36,3, 39)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIntSums")
    void testSums(int[] summands, int expected) {
        assert Math.sum(summands) == expected;
    }

    private static Stream<Arguments> provideIntSums() {
        return Stream.of(
                Arguments.of(new int[]{72, 3, 88}, 163),
                Arguments.of(new int[]{15,93}, 108),
                Arguments.of(new int[]{2,78}, 80),
                Arguments.of(new int[]{76,54}, 130),
                Arguments.of(new int[]{72,21}, 93)

        );

    }

    @ParameterizedTest
    @MethodSource("provideIntMultiply")
    void testMultiply(int multiplier, int multiplicand, int expected) {
        assert Math.multiply(multiplier, multiplicand) == expected;
    }

    private static Stream<Arguments> provideIntMultiply() {
        return Stream.of(
                Arguments.of(9,1, 9),
                Arguments.of(99,87, 8613),
                Arguments.of(62,13, 806),
                Arguments.of(71,52, 3692),
                Arguments.of(63,55, 3465)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIntSubtract")
    void testSubtract(int minuend, int subtrahend, int expected) {
        assert Math.subtract(minuend, subtrahend) == expected;
    }

    private static Stream<Arguments> provideIntSubtract() {
        return Stream.of(
                Arguments.of(46,83, -37),
                Arguments.of(71,26, 45),
                Arguments.of(78,60, 18),
                Arguments.of(58,30, 28),
                Arguments.of(74,42, 32)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIntExponentiate")
    void testExponentiate(int base, int power, int expected) {
        assert Math.exponentiate(base, power) == expected;
    }

    private static Stream<Arguments> provideIntExponentiate() {
        return Stream.of(
                Arguments.of(2,3, 8),
                Arguments.of(1,8, 1),
                Arguments.of(8,2, 64),
                Arguments.of(7,5, 16807),
                Arguments.of(12,3, 1728)
        );
    }
}
