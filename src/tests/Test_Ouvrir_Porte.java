package tests;
import elements.*;

public class Test_Ouvrir_Porte {

	public static void main(String[] args) {
		

		Porte porte1 = new Porte();
		
		Clef clef1 = new Clef("cle chambre froid", "", "");
		Clef clef2 = new Clef("cle chambre froid", "", "");
		
		porte1.setClef(clef1);
		clef1.setPorte(porte1);
		
		System.out.println(porte1.isOuverte());
		porte1.ouvrir(clef2);
		System.out.println(porte1.isOuverte());

		
		
		
		
		

	}

}
