package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
      
        ArrayList<String> fruits = new ArrayList<>();

       
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

       
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));

       
        System.out.println("Number of fruits: " + fruits.size());

       
        fruits.remove(1); 

       
        System.out.println("Remaining fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

