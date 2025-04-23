package affichage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class VueZone extends JPanel {
    ImageIcon fond;
    ImageIcon fond1;
    ImageIcon fond2;
    int fondActif;
    ImageIcon joueur;

    public VueZone() {
    }

    public void setFonds(String nom1, String nom2) {
        this.fond1 = new ImageIcon(nom1);
        this.fond2 = new ImageIcon(nom2);
        this.fondActif = 1;
        this.fond = this.fond1;
    }

    public void setPersonnage(String nom) {
        this.joueur = new ImageIcon(nom);
    }

    public void changeFond() {
        if (this.fondActif == 1) {
            this.fond = this.fond2;
            this.fondActif = 2;
        } else {
            this.fond = this.fond1;
            this.fondActif = 1;
        }
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.fond.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        g.drawImage(this.joueur.getImage(), 0, 320, 50, 80, this);
        g.setColor(Color.WHITE);
        Font iodaFont = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 20);
        g.setFont(iodaFont);
       
    }
}