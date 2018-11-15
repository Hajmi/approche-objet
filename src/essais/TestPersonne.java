package essais;
import entites.*;


public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Création d'une première personne dead pool en utilisant le constrcuteur avec le nom et le prenom en arguments
		Personne bipede1 = new Personne("dead","pool");
		//Création d'une adresse pour la première personne en utilisant le constructeur avec arguments : le numéro de la rue, le nom de la rue, le code postale et la ville.
		bipede1.adresse = new AdressePostale(26,"street JAVA","34000","small ville");
		//Création d'une deuxième personne super woman en utilisant le constrcuteur avec le nom, le prenom ainsi que une adresse en arguments
		Personne bipede2 = new Personne("super","woman",new AdressePostale(33,"rue du C","99999","Pays Imaginaire"));
		//Création d'une personne avec le premier constructeur (sans paramètre) en utilisant les setters 
		Personne bipede3 = new Personne();
		bipede3.setNom("Benakcha");
		bipede3.setPrenom("samir");
		bipede3.setAdresse(new AdressePostale(110,"bd de la madeleine","09300","Lavelanet"));
		//Affichage des personnages crées
		System.out.println("Voici le premier personnage : ");
		bipede1.affiche(bipede1);
		bipede1.adresse.afficheAdresse(bipede1.adresse);
		System.out.println("");
		System.out.println("Voici le second personnage : ");
		bipede2.affiche(bipede2);
		bipede2.adresse.afficheAdresse(bipede2.adresse);
		System.out.println("");
		//Affichage de la première personne avec le nom en majuscule grâce à la méthode toString()
		System.out.println("Voici le premier personnage avec son nom en majuscule : ");
		System.out.println(bipede1.toString());
		System.out.println("");
		//Affichage de la troisième personne crée à partir du premier constructeur
		System.out.println("Voici le troisième personnage : ");
		bipede3.affiche(bipede3);
		bipede3.adresse.afficheAdresse(bipede3.adresse);
		System.out.println("");
		
	}
	

}
