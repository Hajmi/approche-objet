package entites;
//Création de la classe Adresse postale avec 4 attributs : le numéro de la rue, le nom de la rue, le code postale et la ville.
public class AdressePostale {
	
	public int numeroRue;
	public String nomRue;
	public String codePostale;
	public String ville;
	//Création d'un constructeur vide
	public AdressePostale() {
	}
	//Création d'un constructeur avec arguments : le numéro de la rue, le nom de la rue, le code postale et la ville.
	public AdressePostale(int numeroRue,String nomRue,String codePostale,String ville) {
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.codePostale = codePostale;
		this.ville = ville;
	}

	//Méthode pour afficher une adresse postale 
	public void afficheAdresse (AdressePostale ap) {
		System.out.println("Voici mon adresse postale : "+ap.numeroRue+" "+ap.nomRue+", "+ap.codePostale+" "+ap.ville);
	}

}
