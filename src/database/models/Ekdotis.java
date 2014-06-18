package database.models;

import java.io.Serializable;

/**
 *
 * @author nikos
 */
public class Ekdotis implements Serializable {

    private String id;
    private String onoma;

    public Ekdotis() {
    }

    public Ekdotis(String id, String onoma) {
        this.id = id;
        this.onoma = onoma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

}
