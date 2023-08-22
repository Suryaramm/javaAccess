package conditionalFlow;
public class ForLoop {
    public static void main(String[] args) {
       
        int[] numbers = new int[5];

        int[] numberr = {10, 20, 30, 40, 50};
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        } 
        for (int i = 0; i < numberr.length; i++) {
            System.out.println(numberr[i]);
        }
        
    }
}



