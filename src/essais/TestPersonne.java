package essais;
import entites.*;



public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne bipede1 = new Personne("dead","pool");
		bipede1.adresse = new AdressePostale(26,"street JAVA","34000","small ville");
		
		Personne bipede2 = new Personne("super","woman",new AdressePostale(33,"rue du C","99999","Pays Imaginaire"));
		
		
		//Affichage des personnages créés
		bipede1.affiche(bipede1);
		bipede1.adresse.afficheAdresse(bipede1.adresse);
		System.out.println("");
		bipede2.affiche(bipede2);
		bipede2.adresse.afficheAdresse(bipede2.adresse);
			
	}
	

}
