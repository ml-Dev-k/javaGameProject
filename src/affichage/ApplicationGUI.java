package affichage;

import javax.swing.*;
import java.awt.*;

public class ApplicationGUI extends JFrame {
    VueZone vz;
    JPanel panneauBtn, menuPanel;
    JLabel invite;
    JButton boutonValider, boutonAutre, boutonNouvellePartie, boutonChargerPartie, boutonQuitter;
    JTextField zoneSaisie;
    CardLayout cardLayout;
    JPanel mainPanel;

    public ApplicationGUI() {
        setTitle("MIAGE Jeu Aventure");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 600);

        // Layout qui permet de switcher entre le menu et le jeu
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        initMenuPanel();
        mainPanel.add(menuPanel, "menu");
        mainPanel.add(createGameUI(), "jeu");

        add(mainPanel);
        cardLayout.show(mainPanel, "menu"); // Affiche d'abord le menu
    }

    private void initMenuPanel() {
        menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBorder(BorderFactory.createEmptyBorder(100, 200, 100, 200));

        boutonNouvellePartie = new JButton( "Nouvelle Partie");
        boutonChargerPartie = new JButton("Charger Partie");
        boutonQuitter = new JButton("Quitter");

        boutonNouvellePartie.setAlignmentX(Component.CENTER_ALIGNMENT);
        boutonChargerPartie.setAlignmentX(Component.CENTER_ALIGNMENT);
        boutonQuitter.setAlignmentX(Component.CENTER_ALIGNMENT);

        boutonNouvellePartie.addActionListener(e -> {
            cardLayout.show(mainPanel, "jeu");
            // Initialisation du jeu (reset de l'état si nécessaire)
        });
        boutonChargerPartie.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Fonction de chargement non implémentée !");
        });
        boutonQuitter.addActionListener(e -> System.exit(0));

        menuPanel.add(boutonNouvellePartie);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        menuPanel.add(boutonChargerPartie);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        menuPanel.add(boutonQuitter);
        
        
    }

    private JPanel createGameUI() {
        vz = new VueZone();
        vz.setPreferredSize(new Dimension(700, 400));

        // Chemins à adapter à ton système
        vz.setFonds("images/Fond_Entrée.png", "images/Scoruscant.png");
        vz.setPersonnage("images/cuisinier.png");

        panneauBtn = new JPanel();
        invite = new JLabel("Entrez votre choix : ");
        boutonValider = new JButton("Valider");
        boutonAutre = new JButton("Autre");
        zoneSaisie = new JTextField("commande", 30);

        boutonValider.setName("Valider");
        boutonAutre.setName("Autre");

        MonActionControler mac = new MonActionControler(this);
        boutonValider.addActionListener(mac);
        boutonAutre.addActionListener(mac);

        panneauBtn.add(invite);
        panneauBtn.add(zoneSaisie);
        panneauBtn.add(boutonValider);
        panneauBtn.add(boutonAutre);

        JPanel gamePanel = new JPanel(new BorderLayout());
        gamePanel.add(vz, BorderLayout.CENTER);
        gamePanel.add(panneauBtn, BorderLayout.SOUTH);

        return gamePanel;
    }

    public void changeFond() {
        vz.changeFond();
    }

    public static void main(String[] args) {
        ApplicationGUI app = new ApplicationGUI();
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }
}