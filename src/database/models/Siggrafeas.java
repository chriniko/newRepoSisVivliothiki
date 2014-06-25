package database.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nikos
 */
public class Siggrafeas implements Serializable {

    private int id;
    private String onoma;
    private String epitheto;
    private ArrayList<VivlioHasSiggrafeis> vivlia;
    private boolean isSelected = false;

    public Siggrafeas() {
    }

    @Override
    public String toString() {
        return "Siggrafeas{" + "id=" + id + ", onoma=" + onoma + ", epitheto=" + epitheto + ", vivlia=" + vivlia + ", isSelected=" + isSelected + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEpitheto() {
        return epitheto;
    }

    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    public ArrayList<VivlioHasSiggrafeis> getVivlia() {
        return vivlia;
    }

    public void setVivlia(ArrayList<VivlioHasSiggrafeis> vivlia) {
        this.vivlia = vivlia;
    }

    public boolean isIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

}//Siggrafeas.
