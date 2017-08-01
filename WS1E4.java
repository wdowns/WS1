/**
 * Write a Java program which computes numbers es, ds and ep, dp,
 * which stand for the sum (add+) and the product (multiply*) of the two fractions, 
 * respectively. 
 * 
 * @author William Downs
 * @version 04/10/15. 
 */

public class WS1E4 {

	/**
	 * Calculate the numerator (top number) of the sum 
	 * 
	 * @param e1
	 * @param e2
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static int es(int e1, int e2, int d1, int d2) {
		return (e1 * d2 + e2 * d1);
	}

	/**
	 * Calculate the denominator (bottom number) of the sum 
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static int ds(int d1, int d2) {
		return (d1 * d2);
	}

	/**
	 * Calculate the numerator (top number) of the product 
	 * 
	 * @param e1
	 * @param e2
	 * @return
	 */
	public static int ep(int e1, int e2) {
		return (e1 * e2);
	}

	/**
	 * Calculate the denominator (bottom number) of the product 
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static int dp(int d1, int d2) {
		return (d1 * d2);
	}

	public static void main(String[] args) {

		int e1, d1, e2, d2;
		e1 = 1;
		d1 = 2;
		e2 = 1;
		d2 = 3;

		System.out.println(e1 + "/" + d1 + " + " + e2 + "/" + d2 + " = "
				+ es(e1, e2, d1, d2) + "/" + ds(d1, d2));

	    e1 = 1;
		d1 = 3;
		e2 = 3;
		d2 = 4;
		
		System.out.println(e1 + "/" + d1 + " + " + e2 + "/" + d2 + " = "
				+ es(e1, e2, d1, d2) + "/" + ds(d1, d2));

		e1 = 1;
		d1 = 2;
		e2 = 2;
		d2 = 3;
		
		System.out.println(e1 + "/" + d1 + " * " + e2 + "/" + d2 + " = "
				+ dp(e1, e2) + "/" + dp(d1, d2));

		e1 = 1;
		d1 = 4;
		e2 = 2;
		d2 = 3;
		
		System.out.println(e1 + "/" + d1 + " * " + e2 + "/" + d2 + " = "
				+ dp(e1, e2) + "/" + dp(d1, d2));
		
		}
}

