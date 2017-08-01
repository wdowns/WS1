 /**  The area A of a circle is computed by π*(r*r). Write a Java-
     *   program that makes this computation. Initialize the variable r
     *   to 5 and print the result.   
     *   @author William Downs
     *   @version 04/10/15.
     */
public class WS1E1 { 
 
        public static double A (double r){
		return Math.PI * (r * r);
	}
    public static void main(String[] args) {
    	double r = 5;
		System.out.println("The area of a circle with radius " + r + " is " + A(5) + ".");
    }
}
