package collections;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

public class StudentGradeHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store students' names and grades
        HashMap<String, String> studentGrades = new HashMap<>();

        // Add students and their grades to the HashMap
        studentGrades.put("Alice", "B");
        studentGrades.put("Bob", "A");
        studentGrades.put("Charlie", "C");
        studentGrades.put("David", "D");
        studentGrades.put("Emily", "A");

        // Print all students' names with their grades
        System.out.println("Students and their grades:");
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Find and remove the student with the lowest grade
        String[] gradeValues = {"A", "B", "C", "D", "E"};
        String lowestGrade = Collections.min(studentGrades.values());
        System.out.println(lowestGrade);
        String lowestGradeStudent = null;
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
            if (entry.getValue().equals(lowestGrade)) {
                lowestGradeStudent = entry.getKey();
                break;
            }
        }
        if (lowestGradeStudent != null) {
            studentGrades.remove(lowestGradeStudent);
        }

        // Print HashMap data after removing the lowest grade student
        System.out.println("\nAfter removing the lowest grade student:");
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


