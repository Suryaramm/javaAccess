package jumpStatements;

public class CountinueStatement {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
		    if (i == 3) {
		        continue; // Skip iteration when i is 3
		    }
		    System.out.println(i);
		}


	}

}
