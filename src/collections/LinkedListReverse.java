package collections;

import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
       
        LinkedList<String> names = new LinkedList<>();

       
        names.add("Ganga");
        names.add("Yamuna");
        names.add("Narmada");

        
        System.out.println("Names in reverse order:");
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
    }
}

