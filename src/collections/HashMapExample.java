package collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
   
        HashMap<String, Integer> ages = new HashMap<>();

      
        ages.put("Alice", 25);
        ages.put("Bob", 30);
        ages.put("Charlie", 28);

      
        System.out.println("Age of Alice: " + ages.get("Alice"));
        System.out.println("Age of Charlie: " + ages.get("Charlie"));

     
        System.out.println("Number of entries: " + ages.size());

       
        ages.put("Bob", 31); // Bob is now 31 years old

      
        ages.remove("Charlie");

       
        System.out.println("Remaining entries:");
        for (String name : ages.keySet()) {
            System.out.println(name + ": " + ages.get(name));
        }
    }
}

