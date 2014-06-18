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
    private ArrayList<VivlioHasSIggrafeis> vivlia;

    public Siggrafeas() {
    }

    @Override
    public String toString() {
        return "Siggrafeas{" + "id=" + id + ", onoma=" + onoma + ", epitheto=" + epitheto + ", vivlia=" + vivlia + '}';
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

    public ArrayList<VivlioHasSIggrafeis> getVivlia() {
        return vivlia;
    }

    public void setVivlia(ArrayList<VivlioHasSIggrafeis> vivlia) {
        this.vivlia = vivlia;
    }

}//Siggrafeas.
