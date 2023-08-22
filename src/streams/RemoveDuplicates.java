package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        List<Integer> distinctNumbers = removeDuplicates(numbers);
        System.out.println("Distinct Numbers: " + distinctNumbers);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        return list.stream()
                   .distinct()
                   .collect(Collectors.toList());
    }
}

