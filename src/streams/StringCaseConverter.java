package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConverter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Java");
        strings.add("Streams");

        List<String> uppercaseStrings = convertToUppercase(strings);
        System.out.println("Uppercase Strings: " + uppercaseStrings);

        List<String> lowercaseStrings = convertToLowercase(strings);
        System.out.println("Lowercase Strings: " + lowercaseStrings);
    }

    public static List<String> convertToUppercase(List<String> strings) {
        return strings.stream()
                      .map(s->s.toUpperCase())
                      .collect(Collectors.toList());
    }

    public static List<String> convertToLowercase(List<String> strings) {
        return strings.stream()
                      .map(String::toLowerCase)
                      .collect(Collectors.toList());
    }
}

