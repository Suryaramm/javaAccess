package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestLargest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(30);

        Integer secondSmallest = findSecondSmallest(numbers);
        Integer secondLargest = findSecondLargest(numbers);

        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }

    public static Integer findSecondSmallest(List<Integer> numbers) {
        return numbers.stream()
                      .distinct()
                      .sorted()
                      .skip(1)
                      .findFirst()
                      .orElse(null);
    }

    public static Integer findSecondLargest(List<Integer> numbers) {
        return numbers.stream()
                      .distinct()
                      .sorted(Comparator.reverseOrder())
                      .skip(1) 
                      .findFirst()
                      .orElse(null);
    }
}

