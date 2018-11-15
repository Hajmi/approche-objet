package entites;
import entites.AdressePostale;

public class Personne {
	
	public String nom ;
	public String prenom ;
	public AdressePostale adresse  ;//= new AdressePostale()
	
	public Personne (String nom,String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne (String nom, String prenom, AdressePostale adresse) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public void affiche(Personne per) {
		System.out.println("je suis un personnage mon nom est "+per.nom+" et mon prénom "+per.prenom);
	}
}
