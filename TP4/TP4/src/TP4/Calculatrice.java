/**
 * 
 */
package TP4;

/**
 * @author François
 *
 */
public class Calculatrice {

	/**
	 * @param args
	 */
	double valeurCourante; // Stocke la valeur affichée sur l'écran de la calculatrice

   
 
    public boolean equals(Calculatrice obj) {
	return this.valeurCourante == obj.valeurCourante;
    }

    
    public String toString() {
	return "La valeur courante vaut :" + valeurCourante;
    }

   
    void ajoute(double n) {
	valeurCourante += n;
    }

    void soustrait(double n) {
	valeurCourante -= n;
    }

   
    void multi(int n) {
	valeurCourante *= n;
    }

   
    void carre() {
	valeurCourante *= valeurCourante;
    }

   
    public static void main(String[] args) {
	Calculatrice myCalc = new Calculatrice();
	Calculatrice myCalc2 = new Calculatrice();
	myCalc.ajoute(5);
	myCalc2.ajoute(5);
	myCalc.soustrait(2);
	myCalc2.soustrait(2);

	if (myCalc.equals(myCalc2)) {
	    System.out.println("Les deux calculatrices sont égales.");
	} else {
	    System.out.println("Les deux calculatrices ne sont pas égales.");
	}
    }

}
