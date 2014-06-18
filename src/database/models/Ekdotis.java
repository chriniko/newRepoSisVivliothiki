package database.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nikos
 */
public class Ekdotis implements Serializable {

    private int id;
    private String name;
    private ArrayList<Vivlio> vivlia;

    public Ekdotis() {
    }

    public Ekdotis(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ekdotis{" + "id=" + id + ", name=" + name + ", vivlia=" + vivlia + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Vivlio> getVivlia() {
        return vivlia;
    }

    public void setVivlia(ArrayList<Vivlio> vivlia) {
        this.vivlia = vivlia;
    }
}
