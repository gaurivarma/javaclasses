package introductiontoobjectorientedprogramming;

public class Mychar {
	private char ch;

	public Mychar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		// a,e,i,o,u,A,I,O,U,E
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}

	public boolean isNumber() {
		// IS O TO 9
		if (ch >= 48 && ch <= 57) {
			return true;
		}
		return false;
	}

	public boolean isAlphabet() {
		// A TO Z
		if (ch >= 'a' && ch <= 'z') {
			return true;
		}
		if (ch >= 'A' && ch <= 'z') {
			return true;
		}
		return false;

	}

	public boolean isconsonant() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

	public static void printlowercasealphabet() // static class is made due to in main program it is called by class not
												// by its ovbject
	{
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printuppercasealphabet() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}

	}

}
