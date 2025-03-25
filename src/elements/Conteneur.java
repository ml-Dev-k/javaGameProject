package elements;

import java.util.ArrayList;

public class Conteneur extends Objet {
    private ArrayList<Objet> contenus; 

    public Conteneur(String nom, String nomImage, String description) {
        super(nom, nomImage, description);
        this.contenus = new ArrayList<Objet>(); 
    }
    
    public boolean estVide() {
    	return contenus.isEmpty();
    }
    
    public Object prendreObjet(Objet obj) {
    	Objet objet = null;
    	if(contenus.contains(obj)) {
    		contenus.remove(objet);
    		objet = obj;
    	}
    	return objet;
    }
    
    
    
    
}