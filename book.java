package introductiontoobjectorientedprogramming;

public class book {
	// stae noodcopies
	private int noOfCopies;

	book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	void read() {
		System.out.println("read");
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void incnoOfcopies(int howmuch) {
		this.noOfCopies += howmuch;
	}

	public void decnoOfcopies(int howmuch) {
		this.noOfCopies -= howmuch;
	}

}



