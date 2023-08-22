
package conditionalFlow;

public class DoWhile {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int i = 8;
        do {
        	System.out.println("surya");
            System.out.println(numbers[i]);
            i++;
        } while (i > numbers.length);
    }
}

