package introductiontoobjectorientedprogramming;

public class bookrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book artofcomputerprogramming = new book(1000);
		book effectivejava = new book(1000);

		System.out.println(artofcomputerprogramming.getNoOfCopies());
		System.out.println(effectivejava.getNoOfCopies());

 artofcomputerprogramming.read();
 effectivejava.read();


	artofcomputerprogramming.setNoOfCopies(70);
	effectivejava.setNoOfCopies(40);
	artofcomputerprogramming.incnoOfcopies(10);
	effectivejava.decnoOfcopies(15);
	System.out.println(artofcomputerprogramming.getNoOfCopies());
	System.out.println(effectivejava.getNoOfCopies());

	;
	}

}
