package database.models;

import java.io.Serializable;

/**
 *
 * @author nikos
 */
public class Ekdotis implements Serializable {

    private int id;
    private String name;

    public Ekdotis() {
    }

    public Ekdotis(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ekdotis{" + "id=" + id + ", name=" + name + '}';
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
}
