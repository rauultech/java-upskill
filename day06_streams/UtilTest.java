package day06_streams;

import java.util.List;

public class UtilTest {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cat", "dog", "elephant");
        System.out.println(Util.mapToUppercase(strings));
        System.out.println(Util.removeElementsWithMoreThanThreeCharacters(strings));
        System.out.println(Util.sortStrings(strings));
        List<String> numbers = List.of("5", "2", "9", "1", "3");
        System.out.println(Util.sortIntegers(numbers));
        System.out.println(Util.sortIntegersDecending(numbers));
    }
}
