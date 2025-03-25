package elements;

public class Porte{
	private boolean etatPorte;
	private Clef clef;

	public boolean isOuverte() {
		return etatPorte;
	}

	
	public Porte() {
		this.etatPorte = false;
	}
	
	public void setClef(Clef clef) {
		this.clef = clef;
	}
	
	public void ouvrir(Clef cle) {
		if(this.clef.equals(cle)){
			this.etatPorte = true;
		}
	}
	
	public void fermer() {
		this.etatPorte = false;
	}
	
	public boolean equals(Porte porte) {
		if ((porte == null) || (this.getClass() != porte.getClass()))
			return false;
		else if (this == porte)
			return true;
		else {
			Porte aTester = (Porte) porte;
			return (this.clef.equals(aTester.clef));
		}
	}




}
