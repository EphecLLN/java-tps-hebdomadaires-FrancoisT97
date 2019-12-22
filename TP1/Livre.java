/**
 * 
 */
package revision;

/**
 * @author François
 *
 */
public class Livre {

	/**
	 * @param args
	 */
    String titre;
    String auteurNom;
    String isbn;

    public static void main(String[] args) {
	Livre livre = new Livre();
	livre.titre = "Harry Potter";
	livre.auteurNom = "JK Rowling";
	livre.isbn = "0123456789";

	System.out.println("titre: " + livre.titre + "\n auteur: " + livre.auteurNom + "\n isbn: " + livre.isbn);
    }

}
