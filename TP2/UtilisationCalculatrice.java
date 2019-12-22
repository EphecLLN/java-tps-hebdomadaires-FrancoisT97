/**
 * 
 */
package TP2;

/**
 * @author François
 *
 */
public class UtilisationCalculatrice {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
    	
	Calculatrice myCalc = new Calculatrice();

	myCalc.ajoute(10);
	System.out.println(myCalc.getValeurCourante());
    }
}
