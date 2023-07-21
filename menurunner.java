package conditionalstatements;

import java.util.Scanner;

public class menurunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter ther number1:-");

		int number1 = scanner.nextInt();
		System.out.println("number1 is\t " + number1);
		System.out.println("enter the number2:-");
		int number2 = scanner.nextInt();
		System.out.println("number2 is\t" + number2);
		System.out.println("choices are");
		System.out.println("1-add");
		System.out.println("2-substract");
		System.out.println("3-multiply");
		System.out.println("4-divide");
		System.out.println("enter the choices-");
		int choice = scanner.nextInt();
		System.out.println("choice is\t" + choice);


		choiceoperationthroughSwitchcase(number1, number2, choice);
	}

	private static void choiceoperationthroughNestedif(int number1, int number2, int choice) {
		if (choice == 1) {
			System.out.printf("%d+%d=%d", number1, number2, number1 + number2).println();

		} else if (choice == 2) {
			System.out.printf("%d-%d=%d", number1, number2, number1 - number2).println();
		} else if (choice == 3) {
			System.out.printf("%d*%d=%d", number1, number2, number1 * number2).println();
		} else if (choice == 4) {
			System.out.printf("%d/%d=%d", number1, number2, number1 / number2).println();
		}
		else {
			System.out.println("invalid option");
		}
	}

	private static void choiceoperationthroughSwitchcase(int number1, int number2, int choice) {
		switch (choice) {
		case 1:
			System.out.printf("%d-%d=%d", number1, number2, number1 - number2).println();
			break;
		case 2:
			System.out.printf("%d-%d=%d", number1, number2, number1 - number2).println();
			break;
		case 3:
			System.out.printf("%d*%d=%d", number1, number2, number1 * number2).println();
			break;
		case 4:
			System.out.printf("%d/%d=%d", number1, number2, number1 / number2).println();
			break;
		default:
			System.out.println("invalid option");

		}
	}
}



