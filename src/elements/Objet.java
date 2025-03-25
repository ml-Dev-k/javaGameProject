package elements;

public class Objet {
    private String nom;
    private String nomImage;
    private String description;

    public Objet(String nom, String nomImage, String description) {
        this.nom = nom;
        this.nomImage = nomImage;
        this.description = description;
    }
    
    public String getNom() {
    	return this.nom;
    }
}

