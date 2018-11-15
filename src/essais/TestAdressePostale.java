package essais;
import entites.AdressePostale;
//Création de la classe TestAdressePostale qui nous permet de tester la création d'une adresse postale et de l'afficher
public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Création d'une première adresse postale avec le constructeur sans argument
		AdressePostale ap1 = new  AdressePostale();
		//Création d'une deuxième adresse postale avec le constructeur avec argument 
		AdressePostale ap2 = new  AdressePostale(33,"rue du C","99999","Pays Imaginaire");
		
		//affectation de la valeur des attributs à l'objet ap1 qui est une adresse postale
		ap1.numeroRue = 50;
		ap1.nomRue = "avenue mozart";
		ap1.ville = "Nice";
		ap1.codePostale = "06000";
		//Affichage des adresses postales des objets ap1 et ap2
		ap1.afficheAdresse(ap1);
		ap2.afficheAdresse(ap2);
	}

}
