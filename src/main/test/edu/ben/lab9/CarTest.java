package edu.ben.lab9;

import edu.ben.lab5.StringUtils;
import edu.ben.lab7.Square;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CarTest {


    @ParameterizedTest
    @MethodSource("provideMake")
    void testMake(String make) {
        Car s = new Car(make, "Civic", "Yellow");
        assert s.getMake().equals(make);
    }


    private static Stream<Arguments> provideMake() {
        return Stream.of(
                Arguments.of("Honda"),
                Arguments.of("Chrysler"),
                Arguments.of("Ford")
        );
    }

    @ParameterizedTest
    @MethodSource("provideModel")
    void testModel(String model) {
        Car s = new Car("Honda", model, "Yellow");
        assert s.getModel().equals(model);
    }


    private static Stream<Arguments> provideModel() {
        return Stream.of(
                Arguments.of("Civic"),
                Arguments.of("Corolla"),
                Arguments.of("Prius")
        );
    }

    @ParameterizedTest
    @MethodSource("provideColor")
    void testColor(String color) {
        Car s = new Car("Honda", "Civic", color);
        assert s.getColor().equals(color);
    }


    private static Stream<Arguments> provideColor() {
        return Stream.of(
                Arguments.of("Yellow"),
                Arguments.of("Red"),
                Arguments.of("Pink")
        );
    }


}


