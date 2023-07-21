package conditionalstatements;

public class Switchcase {

	public static void main(String[] args) {
		System.out.println(isweek(3));
		isonth(10);
		System.out.println(determinenameofday(4));


	}


public static boolean isweek(int daynumber)
{
	switch (daynumber) {
	case 0:
		return false;

	case 1:
		return true;
	case 2:
		return true;
	case 3:
		return true;
	case 4:
		return true;
	case 5:
		return true;
	case 6:
		return false;
	default:
		return false;
	}
}

public static void isonth(int monthnumber) {
	switch (monthnumber) {
	case 1:
		System.out.println("january");
		break;
		case 2:
			System.out.println("febuary");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("july");
			break;
		case 8:
			System.out.println("august");

			break;
		case 9:
			System.out.println("september");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("novwmber");
			break;
		case 12:
			System.out.println("december");
			break;
		default:
			System.out.println("invalid");
			break;

	}

}

public static String determinenameofday(int daynumber)
{

	switch (daynumber) {
	case 0:
		return "sunday";

	case 1:
		return "monday";
	case 2:
		return "tuesday";
	case 3:
		return "wednesday";
	case 4:
		return "thursday";
	case 5:
		return "friday";
	case 6:
		return "saturday";
	default:
		return "invalid";
	}
	}

}
