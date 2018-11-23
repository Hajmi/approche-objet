package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minimum = Integer.MAX_VALUE;
		int maximum = Integer.MIN_VALUE;
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		
		villes.add(new Ville("Nice",343000));
		villes.add(new Ville("Carcassonne",47800));
		villes.add(new Ville("Narbonne",53400));
		villes.add(new Ville("Lyon",484000));
		villes.add(new Ville("Foix",9700));
		villes.add(new Ville("Pau",77200));
		villes.add(new Ville("Marseille",850700));
		villes.add(new Ville("Tarbes",40600));
		
		System.out.println(villes.toString());
		/**
		 * Afficher la ville avec le plus grand nombre d'habitant 
		 */
		Ville pGrande =(Ville) Collections.max(villes, Comparator.comparing(s -> s.getNombreHabitant()));
		/*
		String pGrande ="";
		for (Ville ville : villes) {
			if (ville.getNombreHabitant()> maximum) {
				pGrande = ville.getNom();
				maximum = ville.getNombreHabitant();
			}
		}*/
		System.out.println("La vie ayant la plus grande population est : "+pGrande);
		
		/**
		 * Afficher la ville la moins peuplée ensuite on la supprime
		 */
		Ville pPetite =(Ville) Collections.min(villes, Comparator.comparing(s -> s.getNombreHabitant()));
		System.out.println("La vie ayant la plus petite population est : "+pPetite);
		villes.remove(pPetite);
		System.out.println("Voici la liste des villes : \n"+villes.toString());
		
		/**
		 *Modifier les villes de plus de 100000 habitants en mettant leur nom en majuscules
		 */
		for (Ville ville : villes) {
			if (ville.getNombreHabitant()> 100000)
				ville.setNom(ville.getNom().toUpperCase());
		}
		System.out.println("Voici la liste des villes : \n"+villes.toString());
		

	}

}
