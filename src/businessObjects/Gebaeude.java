package businessObjects;

import java.util.ArrayList;

public class Gebaeude {
    private String name;
    private ArrayList<Etage>etagenListe;

    public Gebaeude(String name) {
        this.name = name;
        etagenListe = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Etage> getEtagenListe() {
        return etagenListe;
    }

    public int getAnzahlEtagen() {
        return
    }

    public int getAnzahlZimmer() {
        return
    }

    public int getAnzahlZimmerFrei() {
        return
    }

    public int getAnzahlGaeste() {
        return
    }

    @Override
    public String toString() {
        return "Gebaeude{" +
                "name='" + name + '\'' +
                ", etagenListe=" + etagenListe +
                '}';
    }
}
