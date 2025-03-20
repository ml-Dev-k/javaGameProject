package elements;

public class Clef extends Objet {
    //private String type;
	private Porte porte;

	public Clef(String nom, String nomImage, String description, Porte porte) {
		super(nom, nomImage, description);
		this.porte = porte;
	}
	
	  public boolean equals(Clef cle){
		   if ((cle == null) || (this.getClass() != cle.getClass())) 
		     return false;
		   else
		      if (this == cle) 
		         return true;
		      else{
		         Clef aTester = (Clef)cle;
		         return (this.porte.equals(aTester.porte));
		      }
		   }
	
}