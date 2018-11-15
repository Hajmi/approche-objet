package essais;
import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdressePostale ap1 = new  AdressePostale();
		AdressePostale ap2 = new  AdressePostale(33,"rue du C","99999","Pays Imaginaire");
		
		ap1.numeroRue = 50;
		ap1.nomRue = "avenue mozart";
		ap1.ville = "Nice";
		ap1.codePostale = "06000";
		
		ap1.afficheAdresse(ap1);
		ap2.afficheAdresse(ap2);
	}

}
