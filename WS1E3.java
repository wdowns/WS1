/**
 * A capital of £100 is invested at a fixed interest rate of
 * 2.3 per cent. The interest is added to the capital at the 
 * end of each year. Use the formula 
 * [total=capital*(1 + 0.01 * interest_rate)years]
 * to print the balance of the first five years and after
 * 500 years.
 * 
 * @author William Downs
 * @version 04/10/14
 */

public class WS1E3 {
	
	public static double interestAdded2CapitalSum(double capital,
			double interest_rate, int years) {
		return capital * Math.pow(1. + 0.01 * interest_rate, years);
	}

	public static void main(String[] args) {

		double capitalSum = 100; // Initial capital sum in pounds
		double interestRate = 2.3; // The interest rate per annum
		int years = 1; // The time for which the capital is invested in years
		double total; // The capital sum after interest added

		total = interestAdded2CapitalSum(capitalSum, interestRate, years);

		System.out.println("After " + years + " year, a capital of \u00A3"
				+ capitalSum + " grows with an interest rate of " + interestRate
				+ "\u0025 to \u00A3" + Math.round(total));

		years = 2;
		total = interestAdded2CapitalSum(capitalSum, interestRate, years);
		System.out.println("After " + years + " years a capital of \u00A3"
				+ capitalSum + " grows with an interest rate of " + interestRate
				+ "\u0025 to \u00A3" + Math.round(total));

		years = 3;
		total = interestAdded2CapitalSum(capitalSum, interestRate, years);
		System.out.println("After " + years + " years a capital of \u00A3"
				+ capitalSum + " grows with an interest rate of " + interestRate
				+ "\u0025 to \u00A3" + Math.round(total));

		years = 4;
		total = interestAdded2CapitalSum(capitalSum, interestRate, years);
		System.out.println("After " + years + " years a capital of \u00A3"
				+ capitalSum + " grows with an interest rate of " + interestRate
				+ "\u0025 to \u00A3" + Math.round(total));

		years = 5;
		total = interestAdded2CapitalSum(capitalSum, interestRate, years);
		System.out.println("After " + years + " years a capital of \u00A3"
				+ capitalSum + " grows with an interest rate of " + interestRate
				+ "\u0025 to \u00A3" + Math.round(total));

		years = 500;
		total = interestAdded2CapitalSum(capitalSum, interestRate, years);
		System.out.println("After " + years + " years a capital of \u00A3"
				+ capitalSum + " grows with an interest rate of " + interestRate
				+ "\u0025 to \u00A3" + Math.round(total));

	}
}
 
