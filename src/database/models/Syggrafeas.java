package database.models;

import java.io.Serializable;

/**
 *
 * @author Akis
 */
public class Syggrafeas implements Serializable{

    private int id;
    private String name;
    private String surname;

    public Syggrafeas() {
    }
    
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    @Override
    public String toString() {
        return "Syggrageas{" + "id=" + id + ", name=" + name + ", surname=" + surname + '}';
    }

    
}
