package elements;

public class Porte{
	private boolean ouverte;
	private Clef clef;

	public boolean isOuverte() {
		return ouverte;
	}

	public void setOuverte(boolean ouverte) {
		this.ouverte = ouverte;
	}
	
	public Porte(Clef cle,Boolean ouverte) {
		this.clef = cle;
		if(ouverte == true) {
			this.setOuverte(true);
		}else {
			this.setOuverte(false);
		}
	}
	
	public void ouvrir(Clef cle) {
		if(this.clef.equals(cle)){
			this.setOuverte(true);
		}
	}
	
	public void fermer() {
		this.setOuverte(false);
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
