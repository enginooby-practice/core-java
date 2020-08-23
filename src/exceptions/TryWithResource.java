package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {
		demo(); // exc is caught, program continues
		System.out.println("After throwing");
	}

	public static void demo() {
		try (FileReader fr = new FileReader("E://file-not-exist.txt")) { // automatically closes the resources
			fr.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found dude!");
		} catch (IOException e) { // generic exc
			e.printStackTrace();
		}
	}
}
