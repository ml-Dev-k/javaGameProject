package enigme;

public class Enigme {
	private String nom;
	private String description;
	private String solution;
	private final static int nbEssaimax=3;
	private int nbEssai;
	
	
	public Enigme(String nom, String description, String solution) {
		super();
		this.nom = nom;
		this.description = description;
		this.solution = solution;
		this.nbEssai=0;
		
	}
	
	
	

}
