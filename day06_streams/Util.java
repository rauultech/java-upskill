package day06_streams;

import java.util.List;
import java.util.Comparator;
import static java.util.stream.Collectors.*;


public class Util {
    public static List<String> mapToUppercase(List<String> input) {
        return input.stream()
        .map(String::toUpperCase)
        .collect(toList());
    }

    public static List<String> removeElementsWithMoreThanThreeCharacters(List<String> input) {
        return input.stream()
        .filter(s -> s.length() <= 3)
        .collect(toList());
    }

    public static List<String> sortStrings(List<String> input) {
        return input.stream()
        .sorted()
        .collect(toList());
    }

    public static List<Integer> sortIntegers(List<String> input) {
        return input.stream()
        .map(Integer::valueOf)
        .sorted()
        .collect(toList());
    }

    public static List<Integer> sortIntegersDecending(List<String> input) {
        return input.stream()
        .map(Integer::valueOf)
        .sorted(Comparator.<Integer>reverseOrder())
        .collect(toList());
    }
}
