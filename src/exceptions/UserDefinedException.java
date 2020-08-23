package exceptions;

public class UserDefinedException {
	public static String answer = "Hieu";

	public static void main(String[] args) {
		System.out.println("1st try...");
		try {
			guessName("Hi");
		} catch (WrongNameExc e) {
			e.getMessage();
			e.getCustomMessage();
		} finally {
			System.out.println();
		}

		System.out.println("2nd try...");
		try {
			guessName("Hieu");
		} catch (WrongNameExc e) {
			e.getCustomMessage();
		} finally {
			System.out.println();
		}
	}

	public static void guessName(String guess) throws WrongNameExc {
		if (guess.equals(answer)) {
			System.out.println("Your guess: " + guess);
			System.out.println("Correct!");
		} else {
			System.out.println("Before throwing exc");
			throw new WrongNameExc(guess);
		}
	}
}

class WrongNameExc extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String wrongName;

	public WrongNameExc(String wrongName) {
		this.wrongName = wrongName;
	}

	public void getCustomMessage() {
		System.out.println("Your guess: " + this.wrongName);
		System.out.println("Wrong dude!");
	}
}
