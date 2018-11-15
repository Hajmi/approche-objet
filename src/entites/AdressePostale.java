package entites;

public class AdressePostale {
	
	public int numeroRue;
	public String nomRue;
	public String codePostale;
	public String ville;
	
	public AdressePostale() {
	}
	
	public AdressePostale(int numeroRue,String nomRue,String codePostale,String ville) {
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.codePostale = codePostale;
		this.ville = ville;
	}

	
	public void afficheAdresse (AdressePostale ap) {
		System.out.println("Voici mon adresse postale : "+ap.numeroRue+" "+ap.nomRue+", "+ap.codePostale+" "+ap.ville);
	}

}
