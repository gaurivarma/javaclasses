package introductiontoobjectorientedprogramming;

public class motorbikerunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		motorcycle honda = new motorcycle(100); // object

		motorcycle ducati = new motorcycle(50);
		motorcycle suzuki = new motorcycle();// this no arg obj can be called due to creation of deafault constructor
												// separately

		System.out.println(suzuki.getSpeed());// to print the defakult value

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		honda.start(); // calling of method
		ducati.start();

		ducati.setSpeed(100);
		honda.setSpeed(80);

		ducati.increasespedd(76);
		honda.increasespedd(50);

		ducati.decreasespeed(10);
		honda.decreasespeed(10);

		System.out.println(ducati.getSpeed());

		System.out.println(honda.getSpeed());

	}

}
