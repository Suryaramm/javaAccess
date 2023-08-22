package jumpStatements;

public class BreakStatement {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
		    if (i == 3) {
		        break; // The loop will exit when i becomes 3
		    }
		    System.out.println(i);
		}


	}

}
