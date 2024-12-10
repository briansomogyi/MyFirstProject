/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class HelloWorld {

	/**
	 * 
	 */
	public HelloWorld() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			String string = scanner.nextLine();
			
			System.out.println("Utilizatorul a scris: " + string);
		}
	}

}
