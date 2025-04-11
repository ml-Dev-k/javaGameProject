package enigmes;

import java.util.ArrayList;

public class Enigme {
	private String nom;
	private String description;
	private ArrayList<String> solutions;
	public static final int nbEssaimax=3;
	private int nbEssai;
	
	
	public Enigme(String nom, String description) {
		this.nom = nom;
		this.description = description;
		this.nbEssai=0;
	}
	
	public void setSolution(String solutionPossible) {
		this.solutions.add(solutionPossible);
	}
	
	public boolean repondre(String réponse) {
		if(this.solutions.contains(réponse)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		String str = "Nom : " + this.nom;
		str += "Description : \n" + this.description ;
		return str;
	}
	
	public void affiche() {
		System.out.println(this);
	}
	
	

}
