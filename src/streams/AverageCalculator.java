package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        double average = calculateAverage(numbers);

        System.out.println("Average: " + average);
    }

    public static double calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                      .mapToInt(Integer::intValue)
                      .average()
                 
                      .orElse(0.0);
    }
}

