package collections;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
   
        LinkedList<Integer> numbers = new LinkedList<>();

        
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        
        System.out.println("First number: " + numbers.getFirst());
        System.out.println("Last number: " + numbers.getLast());

   
        System.out.println("Number of elements: " + numbers.size());

       
        numbers.removeFirst(); 

        numbers.addFirst(20);

        
        System.out.println("Remaining numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
