package collections;

import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        
        HashMap<String, String> studentGrades = new HashMap<>();

    
        studentGrades.put("Alice", "A");
 
        studentGrades.put("Carol", "C");
        studentGrades.put("David", "B");
       

       
        HashMap<String, Integer> gradePriorities = new HashMap<>();
        gradePriorities.put("A", 3);
        gradePriorities.put("B", 2);
        gradePriorities.put("C", 1);



      
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
//        	System.out.println(entry);
            String student = entry.getKey();
            String grade = entry.getValue();
            System.out.println(student + ": " + grade);
        }

        // Find and remove students with the lowest priority grade "C"
        removeLowestPriorityGrades(studentGrades, gradePriorities);
    }

    private static void removeLowestPriorityGrades(HashMap<String, String> studentGrades, HashMap<String, Integer> gradePriorities) {
        int lowestPriority = Integer.MAX_VALUE;
        System.out.println(lowestPriority);

        // Find the lowest priority among the grades
        for (String grade : studentGrades.values()) {
        	System.out.println("//grade//");
        	System.out.println(grade);
        	
            int priority = gradePriorities.get(grade);
            System.out.println("//priority//");
            System.out.println(priority);
            lowestPriority = Math.min(lowestPriority, priority);
            System.out.println(" lowest////");
            System.out.println(lowestPriority);
            
            
        }

        // Create a list to store entries with lowest priority
        List<Map.Entry<String, String>> entriesToRemove = new ArrayList<>();

        // Collect entries with lowest priority
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
            String grade = entry.getValue();
            System.out.println("///// grade at collect//");
            System.out.println(grade);
           
            int priority = gradePriorities.getOrDefault(grade, Integer.MAX_VALUE);
            System.out.println("/// priority At collect//");
            System.out.println(priority);
          
            if (priority == lowestPriority) {
                entriesToRemove.add(entry);
            }
        }

      
        for (Map.Entry<String, String> entry : entriesToRemove) {
        	System.out.println("final grade");
        	System.out.println(entry);
            studentGrades.remove(entry.getKey());
        }
        
        System.out.println("Removing lowest priority grade(s) with priority: " + lowestPriority);
        for (Map.Entry<String, String> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
