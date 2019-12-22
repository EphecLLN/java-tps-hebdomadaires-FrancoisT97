/**
 * 
 */
package revision;

/**
 * @author François
 *
 */
public class Calculatrice {

	/**
	 * @param args
	 */
	double valeurCourante = 0;
	
	void ajout(double n) {
		valeurCourante+=n;
		
	}
	void soustrait (double n) {
		valeurCourante -=n;
	}
	
	void carre() {
		valeurCourante *= valeurCourante;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculatrice myCalc = new Calculatrice();
		
		myCalc.ajout(5);
		System.out.println(myCalc.valeurCourante);
		
		myCalc.soustrait(2);
		System.out.println(myCalc.valeurCourante);
		

	}

}
