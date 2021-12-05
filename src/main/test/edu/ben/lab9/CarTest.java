package edu.ben.lab9;

import edu.ben.lab5.StringUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CarTest {
    @ParameterizedTest
    @MethodSource("provideCar")
    void testCar(int Car, String[] expected) {
//        String[] result = Car.class(Car);
//        {
//            assert result[input].equals(expected[input]);
//        }
    }


    private static Stream<Arguments> provideCar() {
        return Stream.of(
                Arguments.of(0, new String[]{"Honda", "Civic", "Yellow"}),
                Arguments.of(1, new String[]{"Toyota", "Corolla", "Red"}),
                Arguments.of(2, new String[]{"Dodge", "Prius", "Pink"})
        );
    }

}
