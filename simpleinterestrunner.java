package introductiontoobjectorientedprogramming;

import java.math.BigDecimal;

public class simpleinterestrunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleinterest calculator = new simpleinterest("4500", "7.5");
		BigDecimal totalvalue = calculator.calculatetotalvalue("5");
System.out.println(totalvalue);
	}

}
