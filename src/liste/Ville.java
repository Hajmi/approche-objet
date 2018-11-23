package liste;

import java.util.HashMap;
import java.util.Map;

public class Ville {
	
	private String nom;
	private int nombreHabitant;
	//private Map<String, Integer> villes = new HashMap<>();
	
	
	public Ville(String nom, int nombreHabitant) {
		
		this.nom = nom;
		this.nombreHabitant = nombreHabitant;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNombreHabitant() {
		return nombreHabitant;
	}
	public void setNombreHabitant(int nombreHabitant) {
		this.nombreHabitant = nombreHabitant;
	}


	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nombreHabitant=" + nombreHabitant + "]\r\n";
	}

	

}
