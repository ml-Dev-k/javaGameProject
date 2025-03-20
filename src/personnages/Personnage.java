package personnages;

import java.util.ArrayList;


import elements.Objet;


public class Personnage {
    private String nom;
    private String urlImage;
    private String[] dialogue;
    private String description;
    private ArrayList<Objet> listeObjet;
    
    public Personnage(String nom, String urlImage, String[] dialogue, String description, ArrayList<Objet> listeObjet ) {
    	this.setNom(nom);
    	this.setUrlImage(urlImage);
    	this.setDialogue(dialogue);
    	this.setDescription(description);
    	this.listeObjet = listeObjet;
    }

    public Object donnerObjet(Object obj) {
    	Object objet = null;
    	if((listeObjet.contains(obj))) {
    		objet = obj;
    		listeObjet.remove(obj);
    	}
    	return objet;
    }
    
    

    
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String[] getDialogue() {
		return dialogue;
	}

	public void setDialogue(String[] dialogue) {
		this.dialogue = dialogue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
}
