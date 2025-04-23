package affichage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MonActionControler implements ActionListener {
    ApplicationGUI fen;

    public MonActionControler(ApplicationGUI fen) {
        this.fen = fen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton leBouton = (JButton) e.getSource();

        if (leBouton.getName().equals("Valider")) {
            System.out.println("On a appuyé sur le bouton : " + leBouton.getName());
            String commande = fen.zoneSaisie.getText().trim().toLowerCase();
            switch (commande) {
                case "nord":
                    System.out.println("Je vais sur Coruscant");
                    fen.changeFond();
                    break;
                case "sud":
                    System.out.println("Je vais sur Tatooine");
                    fen.changeFond();
                    break;
                // Ajoutez d'autres directions ou actions ici
                default:
                    System.out.println("Commande non reconnue");
                    break;
            }
        }

        if (leBouton.getName().equals("Autre")) {
            System.out.println("On a appuyé sur le bouton : " + leBouton.getName());
            System.out.println("A vous de décider ce que l'on fait dans ce cas");
        }
    }
}