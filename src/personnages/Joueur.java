package personnages;

import java.util.ArrayList;

import elements.Objet;

public class Joueur {
	private String nom;
	private ArrayList<Objet> inventaire;
	private static final int capaciteInventaire = 5;
	private int nbObjetInventaire;
	private int nbDeplacement;
	
	
	public Joueur(String nom) {
		super();
		this.inventaire = new ArrayList<Objet>(Joueur.capaciteInventaire);
		this.nbDeplacement = 0;
		this.nbObjetInventaire=this.inventaire.size();
	}

	public int getNbDeplacement() {
		return nbDeplacement;
	}

	public static int getCapaciteinventaire() {
		return capaciteInventaire;
	}
	
	// Gérer l'implémentation du nombre de déplacement
	public void déplacer() {  
		this.nbDeplacement++;
	}
	
	// Ajout objets dans l'inventaire:  Exception INVENTAIRE PLEIN A GERER
	
	public void ajouterObjet(Objet objet) {
		this.inventaire.add(objet);
		this.nbObjetInventaire++;
		
	}
	
	public void retirerInventaire(Objet objet) {
		this.inventaire.remove(objet);
			}
	
	public void afficherInventaire() {
	    if (inventaire.isEmpty()) {
	        System.out.println("Inventaire vide.");
	    } else {
	        System.out.println("Inventaire :");
	        for (Objet obj : inventaire) {
	            System.out.println("- " + obj.getNom() + " : " + obj.getDescription());
	        }
	    }
	}
			
	
	
	
	
	

}
