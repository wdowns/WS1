/**
 * Exercise 2(a) Write a Java-program that converts masses given in the imperial
 * system into kilograms.
 * 
 * @author William Downs
 * @version 04/10/15.
 */

public class WS1E2 {

	/**
	 * ton2kilogram converts weight given in tons to kilograms. Tons are
	 * converted into weight given in kilograms.
	 * 
	 * @param ton weight given in tons
	 * @return the weight given in kilograms
	 */
	public static double ton2kilogram(double ton) {
		return (ton * 2240) * 0.45359237;
	}

	/**
	 * Converts hundred weight to kilograms.
	 * 
	 * @param hunw8
	 * @return the weight in kilograms
	 */
	public static double hundredweight2Kilogram(double hunw8) {
		return (hunw8 * 112 * 0.45359237);
	}

	/**
	 * Converts quarters to kilograms.
	 * 
	 * @param quarter
	 * @return weight in kilograms
	 */
	public static double quarter2Kilogram(double quarter) {
		return (quarter * 28 * 0.45359237);
	}

	/**
	 * Converts stones to kilograms.
	 * 
	 * @param stone
	 * @return weight in kilograms
	 */
	public static double stone2Kilogram(double stone) {
		return (stone * 14 * 0.45359237);
	}

	/**
	 * Converts ounces to kilograms.
	 * 
	 * @param ounce
	 * @return weight in kilograms
	 */
	public static double ounce2Kilogram(double ounce) {
		return (ounce * 1.0 / 16 * 0.45359237);
	}

	/**
	 * Converts drachm to kilograms.
	 * 
	 * @param drachm
	 * @return weight in kilograms
	 */
	public static double drachm2Kilogram(double drachm) {
		return (drachm * 1.0 / 256 * 0.45359237);
	}

	/**
	 * Converts grain to kilograms.
	 * 
	 * @param grain
	 * @return weight in kilograms
	 */
	public static double grain2Kilogram(double grain) {
		return (grain * 1.0 / 7000 * 0.45359237);
	}

	/**
	 * Converts pounds to kilograms.
	 * 
	 * @param pound
	 * @return weight in kilograms
	 */
	public static double pound2Kilogram(double pound) {
		return (pound * 0.45359237);
	}

	/**
	 * Exercise 2(b) 
	 * Converts stones and pounds to kilograms by first computing
	 * total weight in pounds and then converting to kilograms.
	 *  
	 * @param stones, pounds
	 * @return weight in kilograms
	 */
	public static int imperial2Metric(int stones, int pounds) {
		return (int) Math.round(pound2Kilogram((stones * 14) + pounds));
	}

	public static void main(String[] args) {

		int stones = 11;
		int pounds = 6;
		System.out.println("A person with " + stones + " stones and " + pounds
		+ " pounds has a weight that corresponds to "
		+ imperial2Metric(stones, pounds) + " kilograms.");
		
	}

}
