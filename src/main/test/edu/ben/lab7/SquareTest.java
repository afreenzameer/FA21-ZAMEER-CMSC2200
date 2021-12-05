package edu.ben.lab7;

import edu.ben.lab3.Math;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SquareTest {

    @ParameterizedTest
    @MethodSource("provideDoubleSideLength")
    void testSideLength(double sideLength, double expected) {
        Square s = new Square(sideLength);
        assert s.getSideLength() == expected;
    }


    private static Stream<Arguments> provideDoubleSideLength() {
        return Stream.of(
                Arguments.of(2,2),
                Arguments.of(3,3),
                Arguments.of(4, 4),
                Arguments.of(5, 5),
                Arguments.of(6, 6)
        );
    }
    @ParameterizedTest
    @MethodSource("provideDoubleArea")
    void testArea(double sideLength, double expected) {
        Square s = new Square(sideLength);
        assert s.area() == expected;
    }


    private static Stream<Arguments> provideDoubleArea() {
        return Stream.of(
                Arguments.of(2,4),
                Arguments.of(3,9),
                Arguments.of(4, 16),
                Arguments.of(5, 25),
                Arguments.of(6, 36)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDoublePerimeter")
    void testPerimeter(double sideLength, double expected) {
        Square s = new Square(sideLength);
        assert s.perimeter() == expected;
    }


    private static Stream<Arguments> provideDoublePerimeter() {
        return Stream.of(
                Arguments.of(2,8),
                Arguments.of(3,12),
                Arguments.of(4, 16),
                Arguments.of(5, 20),
                Arguments.of(6, 24)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSetSideLength")
    void testSetSideLength(double sideLength, double expected) {
        Square s = new Square(sideLength);
        s.setSideLength(sideLength);
        assert s.getSideLength()== expected;
    }


    private static Stream<Arguments> provideSetSideLength() {
        return Stream.of(
                Arguments.of(2,2),
                Arguments.of(3,3),
                Arguments.of(4, 4),
                Arguments.of(-5,0),
                Arguments.of(0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideEquals")
    void testEquals(double sideLength1, double sideLength2, boolean expected) {
        Square s = new Square(sideLength1);
        Square z = new Square(sideLength2);
        assert expected == s.equals(z);

    }

    private static Stream<Arguments> provideEquals() {
        return Stream.of(
                Arguments.of(2,2, true),
                Arguments.of(3,3, true),
                Arguments.of(4, 5, false),
                Arguments.of(5, 6, false)
        );
    }
}
