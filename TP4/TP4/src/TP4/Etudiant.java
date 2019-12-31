/**
 * 
 */
package TP4;

/**
 * @author François
 *
 */
public class Etudiant {

	private String nom;
	private String prenom;
	private int matricule;
	//Cette variable d'instance est du type Date, disponible dans le mÃªme package
	private Date dateNaissance;
	static int nbEtudiants = 1;
	
	public Etudiant() {
		this.nom = "toto";
		this.prenom = "tata";
		this.matricule = nbEtudiants;
		nbEtudiants += 1;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the matricule
	 */
	public int getMatricule() {
		return matricule;
	}
	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	/**
	 * @return le nombre d'étudiant inscrits
	 */
	public int getNbEtudiants() {
		return nbEtudiants;
	}
	
	/*
	 * Méthode main qui crÃ©e un étudiant et initialise les variables d'instance au dÃ©part de la ligne de commande
	 * 
	 */
	public static void main(String[] args) {
		Etudiant etu = new Etudiant();
		Etudiant etud = new Etudiant();
		/*etu.nom = args[0];
		etu.prenom = args[1];
		etu.matricule = Integer.parseInt(args[2]);
		etu.dateNaissance = new Date();
		etu.dateNaissance.jour = Integer.parseInt(args[3]);
		etu.dateNaissance.mois = Integer.parseInt(args[4]);
		etu.dateNaissance.annee = Integer.parseInt(args[5]);
		*/
		System.out.println(etu.getMatricule() + " " + etud.getMatricule());
	}

}