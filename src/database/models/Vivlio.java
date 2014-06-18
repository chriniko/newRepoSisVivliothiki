package database.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Akis
 */
public class Vivlio implements Serializable{
    
    private String isbn;
    private String title;
    private String imageUrl;
    private String description;
    private Ekdotis ekdotis;
    private ArrayList<Syggrafeas> syggrafeis;

    public Vivlio() {
    }

    public ArrayList<Syggrafeas> getSyggrafeis() {
        return syggrafeis;
    }

    public void setSyggrafeis(Syggrafeas syggrafeas) {
        this.syggrafeis.add(syggrafeas);
    }
                
    public Ekdotis getEkdotis() {
        return ekdotis;
    }

    public void setEkdotis(Ekdotis ekdotis) {
        this.ekdotis = ekdotis;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Vivlio{" + "isbn=" + isbn + ", title=" + title + ", imageUrl=" + imageUrl + ", description=" + description + ", ekdotis=" + ekdotis + '}';
    }
           
}
