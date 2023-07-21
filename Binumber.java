package introductiontoobjectorientedprogramming;

public class Binumber {
	int number1, number2;

	Binumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;

	}

	int add()
	{
		return number1 + number2;
	}
	int multiply()
	{
		return number1*number2;
	}

	void double1()
	{
		this.number1=number1*2;
		this.number2=number2*2;

	}

	public int getnumber1() {
		return number1;
	}

	public void setnumber1(int number1) {
		this.number1 = number1;
	}

	public int getnumber2() {
		return number2;
	}

	public void setnumber2(int number2) {
		this.number2 = number2;
	}

}
