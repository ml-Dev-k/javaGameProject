package personnages;

import java.util.ArrayList;

import elements.Objet;

public class Joueur {
	private String nom;
	private ArrayList<Objet> inventaire;
	private static final int capaciteInventaire = 0;
	private int nbObjetInventaire;
	private int nbDeplacement;
	
	
	public Joueur(String nom) {
		super();
		this.inventaire = new ArrayList<Objet>(Joueur.capaciteInventaire);
		this.nbDeplacement = 0;
		this.nbObjetInventaire=0;
	}

	public int getNbDeplacement() {
		return nbDeplacement;
	}

	public static int getCapaciteinventaire() {
		return capaciteInventaire;
	}
	
	// Gérer l'implémentation du nombre de déplacement
	public int déplacer() {  
		return this.nbDeplacement+1;
	}
	
	// Ajout objets dans l'inventaire:  Exception INVENTAIRE PLEIN A GERER
	
	public void ajouterObjet(Objet objet) {
		this.inventaire.add(objet);
		this.nbObjetInventaire++;
		
	}
	
	public void retirerInventaire(Objet objet) {
		this.inventaire.remove(objet);
			}
			
	
	
	
	
	

}
