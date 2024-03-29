package edu.ben.lab5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Objects;
import java.util.stream.Stream;

public class StringUtilsTest {

        @Test
    void testisEmpty() {
        assert StringUtils.isEmpty(null);
    }

    @Test
    void testisEmpty2() {
        assert StringUtils.isEmpty("");
    }

    @ParameterizedTest
    @MethodSource("provideStringIsEmpty")
    void testisEmpty(String phrase) {

        assert !StringUtils.isEmpty(phrase);
    }


    private static Stream<Arguments> provideStringIsEmpty() {
        return Stream.of(
                Arguments.of("   "),
                Arguments.of("Hello"),
                Arguments.of("Adele")

        );
    }
    @Test
    void testisBlank() {
        assert StringUtils.isBlank(null);
    }

    @Test
    void testisBlank2() {
        assert StringUtils.isBlank("");
    }

    @ParameterizedTest
    @MethodSource("provideStringIsBlank")
    void testisBlank(String phrase) {
        assert !StringUtils.isBlank(phrase);
    }


    private static Stream<Arguments> provideStringIsBlank() {
        return Stream.of(
                Arguments.of("Hello"),
                Arguments.of("Goodbye"),
                Arguments.of("   "),
                Arguments.of("  ")


        );
    }

    @ParameterizedTest
    @MethodSource("provideStringReverse")
    void testReverse(String phrase, String expected) {
        assert Objects.equals(StringUtils.reverse(phrase), expected);
    }


    private static Stream<Arguments> provideStringReverse() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("beard", "draeb"),
                Arguments.of("dragon", "nogard"),
                Arguments.of("hippo", "oppih")
        );
    }

    @ParameterizedTest
    @MethodSource("provideStringReverseAll")
    void testReverseAll(String[] phrases, String[] expected) {
        String[] result = StringUtils.reverseAll(phrases);
        for(int i = 0; i < result.length; i++){
            assert result[i].equals(expected[i]);
        }
    }


    private static Stream<Arguments> provideStringReverseAll() {
        return Stream.of(
                Arguments.of(new String [] {"hello", "world"}, new String [] {"olleh","dlrow"}),
                Arguments.of(new String [] {"oh", "no"}, new String [] {"ho","on"}),
                Arguments.of(new String [] {"our", "table", "its", "broken"}, new String [] {"ruo","elbat","sti","nekorb"}),
                Arguments.of(new String [] {"go", "cubs"}, new String [] {"og","sbuc"})
        );
    }

}

