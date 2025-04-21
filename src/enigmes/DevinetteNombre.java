package enigmes;

import java.util.Random;
import java.util.Scanner;

public class DevinetteNombre extends Enigme {
	
	public DevinetteNombre() {
		super();
		initSolution();
		initDescription();
	}
	
	public void initSolution() {
		Random rand = new Random();
		this.solution = Integer.toString(rand.nextInt(9) + 1);
	}
	
	public boolean repondre(String reponse) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		while(this.solution.compareTo(reponse) != 0) {
			if(this.solution.compareTo(reponse) < 0) {
				System.out.println("Essayez plus petit !");
			}else{
				System.out.println("Essayez plus grand !");
			}
			this.nbEssai += 1;
			System.out.println("Votre réponse :");
			reponse = (keyboard.nextLine());	
		}
		return true;
	}
	
	public void initDescription() {
		this.description = "Devinez un nombre entre 1 et 10";
	}
}
