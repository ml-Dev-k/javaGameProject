package enigmes;

import java.util.Arrays;
import java.util.Scanner;

public class Enigme {
	protected String description;
	public String solution;
	public static final int nbEssaimax=3;
	protected int nbEssai;
	
	public Enigme() {
		// le constructeur par défaut
	}
	public Enigme(String description) {
		this.description = description;
		this.nbEssai=0;
	}
	public Enigme(String description, String solution) {
		this.description = description;
		this.solution = solution;
		this.nbEssai = 0;
	}
	
	public boolean repondre(String reponse) {
		reponse = reponse.toLowerCase();
		String solution = this.solution.toLowerCase();
		if(solution.compareTo(reponse) != 0) {
			this.nbEssai += 1;
			return false;
		}else {
			return true;
		}
	}
	
    @SuppressWarnings("resource")
	public String essayer(){
    	Scanner keyboard = new Scanner(System.in);
    	String reponse = keyboard.nextLine();
    	return reponse;
    }
	
	
	public String toString() {
		return "'" + this.description + "'";
	}
	public void affiche() {
		System.out.println(this);
	}
	
	
	
	
	
	
	
	

}
