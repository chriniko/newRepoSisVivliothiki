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
    private boolean selected;

    public Ekdotis() {
    }

    @Override
    public String toString() {
        return "Ekdotis{" + "id=" + id + ", name=" + name + ", vivlia=" + vivlia + ", isSelected=" + selected + '}';
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

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean isSelected) {
        this.selected = isSelected;
    }
}
