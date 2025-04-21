package enigmes;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Code extends Enigme {
	private String[] combunaison = new String[0];
	
	public Code() {
		super();
		initSolution();
		initDescription();
	}
	
	public void initSolution() {
		String[] listeSolutions = {
			    "rougevertjaune",
			    "rougejaunevert",
			    "vertrougejaune",
			    "vertjaunerouge",
			    "jaunerougevert",
			    "jaunevertrouge"
			};
		
		Random rand = new Random();
		int i = rand.nextInt(6);
		this.solution = listeSolutions[i];
	}
	
	public void initDescription() {
		String des = "Trois boutons colorés se tiennent devant vous : rouge, vert et jaune. \n"
				+ "Pour ouvrir la porte, vous devez les presser dans le bon ordre. \n"
				+ "Une seule combinaison est correcte… à vous de la deviner !";
		this.description = des;
	}
	
    @SuppressWarnings("resource")
	public String essayer(){
    	Scanner keyboard = new Scanner(System.in);
    	while(this.combunaison.length < 3) {
    		int n = this.combunaison.length;
    		System.out.println("écrivez la touche numéro " + (n+1) + " que vous appuyez (rouge/vert/jaune):");
    		String bouton = keyboard.nextLine();
    		this.combunaison = Arrays.copyOf(this.combunaison, n+1);
    		this.combunaison[n] = bouton;
    	}
    	String reponse = "";
    	for(String btn : this.combunaison)
    		reponse += btn;
    	
    	return reponse;
    }
	
	
}
