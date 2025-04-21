package enigmes;

import java.util.ArrayList;
import java.util.Random;

public class Decryptage extends Enigme {
	private int mode; //Deux Valeurs Possibles: 0-> Chiifre Vers Lettre - 1-> Lettre Vers Chiffre
	public ArrayList<Integer> inconnus = new ArrayList<Integer>(); 
	public ArrayList<Integer> indices = new ArrayList<Integer>(); 

	private static final String[] LETTRE = {
    	    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
    	    "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
    	    "U", "V", "W", "X", "Y", "Z"
    };

	public Decryptage() {
		super();
		initMode();
		initElementInconnus();
		initIndices();
		initDescription();
		initSolution();
	}
	
	private void initMode() {
		Random rand = new Random();
		this.mode = rand.nextInt(2);
		//Deux Valeurs Possibles: 
		//0-> Chiifre Vers Lettre - 1-> Lettre Vers Chiffre
	}
	
	private void initElementInconnus() {
		//Le joueur n'aura que deux chifre/Lettre à décrypter 
		//Le reste lui sera donné comme indice
		this.inconnus = new ArrayList<Integer>(2);
		Random rand = new Random();
		
		do {
			Integer inconnu = rand.nextInt(25)+1; //[1-26]: 26 lettres alphabétiques	
			if(!this.inconnus.contains(inconnu) && !this.indices.contains(inconnu)) {
				//Cette condition doit empécher un inconnu de venir 2 fois ou d'etre révélé en indice
				this.inconnus.add(inconnu);				
			}
		}while(this.inconnus.size() <2);
	}
	
	private void initIndices() {
		this.indices = new ArrayList<Integer>(3);
		Random rand = new Random();
	
		do {
			Integer indice = rand.nextInt(25)+1;	
			if(!this.indices.contains(indice) && !this.inconnus.contains(indice)) {
				this.indices.add(indice);				
			}
		}while(this.indices.size() <3);
	}
	
	private void initSolution() {
		String solution = "";
		if(this.mode == 0) { //Si mode = Lettre Vers Chiffre
			for(int i=0; i<this.inconnus.size();i++) {
				solution += this.inconnus.get(i); // exemple "1310" -> ACJ
			}		
		}else { // Si mode = Chiifre  Vers Lettre
			for(int i=0; i<this.inconnus.size();i++) {
				//Chaque lettre a pour index son ordre dans la lettre alphabétique - 1
				int index = this.inconnus.get(i)-1;
				solution += LETTRE[index] ; // exemple "BDM" - > 2413
			}	
		}
		this.solution = solution;
	}
	 
	private void initDescription() {
		String elementManquant;
		if(this.mode == 0) {//Si mode = Lettre Vers Chiffre
			elementManquant = "chiffres manquants";
		}else { // Si mode = Chiifre  Vers Lettre
			elementManquant = "Lettres manquants";
		}
		String des = "";
		des += "Utilises ta logique, ton imagination, et les indices donnés pour retrouver les " +  elementManquant ;
		des += "\n";
		for(int i=0; i<this.indices.size(); i++) {
			int indice = this.indices.get(i);
			int indexIndice = indice-1;
			
			//Pour l'affichage, on alterne entre indice et inconnu
			if(this.mode == 0) {//Si mode = Lettre Vers Chiffre
				des += LETTRE[indexIndice] + " -> " + indice; // exemple: A -> 1
				if(i<this.inconnus.size()) {
					int indexInconnu = this.inconnus.get(i)-1;
					des += "\n";
					des += LETTRE[indexInconnu]  + " -> ? \n"; // exemple: A -> ?		
				}
				
			}else { // Si mode = Chiifre  Vers Lettre
				des += indice + " -> " + LETTRE[indexIndice]; // exemple: 1 -> A
				if(i<this.inconnus.size()) {
					int inconnu = this.inconnus.get(i);
					des += "\n";
					des += inconnu  + " -> ? \n"; // exemple: 2 -> ?
				}
			}
		}
		this.description = des;
	}

	
	

}
