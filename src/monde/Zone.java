package monde;
import java.util.ArrayList;
import java.util.HashMap;
import elements.Objet;
import personnages.Personnage;

public class Zone {
    private String nom;
    private String cheminImg;
    private ArrayList<Objet> objets;
    private ArrayList<Personnage> personnages;
    private HashMap<String, Zone> sorties; // Ex: "nord" -> autre zone !
    private ArrayList<Zone> sousZones;

    public Zone(String nom, String cheminImg) {
        this.nom = nom;
        this.cheminImg = cheminImg;
        this.objets = new ArrayList<>();
        this.personnages = new ArrayList<>();
        this.sorties = new HashMap<>();
        this.sousZones = new ArrayList<>();
    }

    public void ajouterObjet(Objet objet) {
        objets.add(objet);
    }

    public void ajouterPersonnage(Personnage pnj) {
        personnages.add(pnj);
    }

    public void ajouterSortie(String direction, Zone zoneDestination) {
        sorties.put(direction, zoneDestination);
    }

    public void ajouterSousZone(Zone zone) {
        sousZones.add(zone);
    }

    public Zone getSortie(String direction) {
        return sorties.get(direction);
    }

    // Getters utiles ici
    public String getNom() {
        return nom;
    }

    public String getCheminImg() {
        return cheminImg;
    }

    public ArrayList<Objet> getObjets() {
        return objets;
    }

    public ArrayList<Personnage> getPersonnages() {
        return personnages;
    }

    public HashMap<String, Zone> getSorties() {
        return sorties;
    }

    public ArrayList<Zone> getSousZones() {
        return sousZones;
    }
}
