package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Samir Benakcha
 * @since 22/11/2018
 */

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Exo2
		 */
		String maximum = "";
		List<String> tab = new ArrayList<String>();
		String[] villes = {"Nice","Carcassone","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"};
		Collections.addAll(tab, villes);
		System.out.println("=========Exo2========\nVoici la liste des villes :");
		System.out.println(tab.toString());
		//1ere méthode avec le comparator
		maximum =  (String) Collections.max(tab, Comparator.comparing(s -> s.length()));
		System.out.println("la ville ayant le nom le plus grand dans la liste est : "+maximum);
		/**
		 * 2eme méthode 
		 */
		String maxi = "";
		for (String ville : tab) {
			if (ville.length() > maxi.length())
				maxi = ville;
		}
		System.out.println("2eme méthode : la ville ayant le nom le plus grand dans la liste est : "+maxi);
	    
		/**
		 * Mettre en majuscule toute les villes
		 */
		for (String elem : tab) {
				tab.set(tab.indexOf(elem), elem.toUpperCase());	
				
		}
		System.out.println("Voici la liste des villes en majuscules : \r\n"+tab);
		
		/**
		 * Retirer de la liste toute les villes commençant par la lettre N
		 */
		for (int i=0; i<tab.size(); i++) {
			//if (tab.get(i).startsWith("N") ) 
			if (tab.get(i).charAt(0) == 'N'){
				tab.remove(tab.get(i));
			}
		}
		System.out.println("Voici la liste des villes sans N au début : \r\n"+tab);
	}
	

}
