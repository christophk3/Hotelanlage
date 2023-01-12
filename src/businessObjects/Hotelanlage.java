package businessObjects;

import java.util.ArrayList;

public class Hotelanlage {
    private String name;
    private Adresse adresse;
    private ArrayList<Gebaeude>gebaeudeList;

    public Hotelanlage(String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public ArrayList<Gebaeude> getGebaeudeList() {
        return gebaeudeList;
    }


}
