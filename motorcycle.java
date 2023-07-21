package introductiontoobjectorientedprogramming;


public class motorcycle { // class
	// state
	// int speed;// int speed is breaking the encapsulation we need to keep it
	// private and i wont operate directly other classes can operate it through
	// method only
	// its role is ro protect the data
	private int speed;

//as the parameterised constructor is called const without parameter will not runfor that we have to create anothr const with no parameter
	motorcycle()// default constructor
	{
		this(5);// calling the parametersied constructor as to initialise default value

	}
	motorcycle(int speed)// parameterised constructor
	{
		this.speed = speed;
	}

	// void setSpeed(int speed)// method to acces the speed value
	// {
	// this.speed = speed; // calling the variable
	// System.out.println(this.speed);
	// instead of doing this eclips have defaout getter and setter

	void start() { // method
		System.out.println("bike start");
	}

// by ri8 click+source+getter and setter we could easily get this


	public int getSpeed() {

	return speed;


	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increasespedd(int howmuch) {
		{
			this.speed = this.speed + howmuch;
		}

	}

	public void decreasespeed(int howmuch)
	{
		{
			this.speed = this.speed - howmuch;
		}
	}

}
