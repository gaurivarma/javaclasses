package introductiontoobjectorientedprogramming;

import java.math.BigDecimal;

public class simpleinterest {
	BigDecimal principle;
	BigDecimal interest;

	public simpleinterest(String principle, String interest) {
		this.principle = new BigDecimal(principle);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculatetotalvalue(String noofyears)
{
	//	this.noofyears = new BigDecimal(noofyears);
	//	BigDecimal n1=noofyears.multiply(new BigDecimal (interest) );
	BigDecimal no = principle.add(principle.multiply(interest).multiply(new BigDecimal(noofyears)));
	return no;
}

}
