/**
 * 
 */
package revision;

/**
 * @author François
 *
 */
public class Date {

	/**
	 * @param args
	 */
	int jour;
	int mois;
	int annee;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();

		d.jour = Integer.parseInt(args[0]);
		d.mois = Integer.parseInt(args[1]);
		d.annee = Integer.parseInt(args[2]);
		
		System.out.println(d.jour + " " + d.mois + " " + d.annee);
		
	}

}
