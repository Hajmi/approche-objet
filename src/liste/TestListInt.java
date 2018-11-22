package liste;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Samir Benakcha
 * @since 22/11/2018
 */
public class TestListInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minimum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;
		//Exo1
		//premiere méthode :
		/*ArrayList<Integer> al = new ArrayList<Integer>(); //on vient typer notre arraylist sachant qu'on va manipuler que des integer
		al.add(1);//Ajout de 1 à la arraylist
		al.add(5);
		al.add(7);
		al.add(3);
		al.add(-2);
		al.add(4);
		al.add(8);
		al.add(5);

		for (Integer integer : al) {
			System.out.print(integer+" ");
		}*/
		//Deuxieme méthode avec Collections.AddAll
		List<Integer> tab = new ArrayList<Integer>();
		Integer[] nombre = {-1,5,7,3,-2,4,8,5};
		Collections.addAll(tab, nombre);
		System.out.println("=========Exo1========\nVoici la liste de nombres :");
		System.out.println(tab);
		/*for (int i=0; i<tab.size(); i++) {
			System.out.print(tab.get(i)+" : ");
		}*/
		
		//Troisieme méthode avec Arrays.List()
		/*Integer[] nombre = {1,5,7,3,-2,4,8,5};
		ArrayList tab = new ArrayList(Arrays.asList(nombre));
		System.out.println("=========Exo1========\nVoici la liste de nombre :");
		System.out.println(tab);
		for (int i=0; i<tab.size(); i++) {
			System.out.println(tab.get(i));
		}
		*/
		/**
		 * On parcourt le tableau pour trouver le nombre le plus grand
		 */
		maximum = Collections.max(tab);
		//maximum = (int) Collections.max(Arrays.asList(nombre));
		/*for (int i=0; i<tab.size(); i++) {
			if (tab.get(i) > maximum)
				maximum = tab.get(i);
		}*/
		System.out.println("\nVoici le chiffre le plus grand : "+maximum);
		/**
		 * Supprimer le plus petit élément
		 */
		minimum = (int) Collections.min(tab);
		int index = tab.indexOf(minimum);
		System.out.println("Voici le chiffre le plus petit : "+minimum);
		System.out.println("l'index du plus petit :"+index);
		tab.remove( Collections.min(tab));
		System.out.println("Voici la liste après suppresion du plus petit : \r\n"+tab);
		/**
		 * Modifier tout les éléments négatifs en positifs
		 */
		for (Integer elem : tab) {
			if (elem < 0 ) {
				tab.set(tab.indexOf(elem), -elem);
			}		
		}
		System.out.println(tab);
		
	}

}
