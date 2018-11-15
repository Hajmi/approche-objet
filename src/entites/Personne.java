package entites;
import entites.AdressePostale;

//Création de la classe personne
public class Personne {
	
	public String nom ;
	public String prenom ;
	public AdressePostale adresse  ;//= new AdressePostale()
	
	public Personne () {
	}
	
	//constrcuteur avec le nom et le prenom en arguments
	public Personne (String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
		
	//constrcuteur avec le nom et le prenom ainsi que l'adresse en arguments
	public Personne (String nom, String prenom, AdressePostale adresse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public AdressePostale getAdresse() {
		return adresse;
	}
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	//Méthode pour afficher les attributs d'une personne 
	public void affiche(Personne per) {
		System.out.println("je suis un personnage mon nom est "+per.nom+" et mon prénom "+per.prenom);
	}
	//Méthode pour afficher le nom en majuscule et le prenom 
	public String toString() {
		return "je suis un personnage mon nom est "+this.nom.toUpperCase()+" et mon prénom "+this.prenom;
	}

}
