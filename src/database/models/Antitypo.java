package database.models;

import java.util.Date;

/**
 *
 * @author Akis
 */
public class Antitypo {
    
    private Vivlio vivlio;    
    private int id;
    private final String []katastasi;
    private Melos melos;
    private Date date;

    public Antitypo() {
        katastasi = new String[] {"kali","metria","kaki"};;        
    }

    public String[] getKatastasi() {
        return katastasi;
    }
       
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Melos getMelos() {
        return melos;
    }

    public void setMelos(Melos melos) {
        this.melos = melos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public Vivlio getVivlio() {
        return vivlio;
    }

    public void setVivlio(Vivlio vivlio) {
        this.vivlio = vivlio;
    }

    @Override
    public String toString() {
        return "Antitypo{" + "vivlio=" + vivlio + ", id=" + id + ", katastasi=" + katastasi + ", melos=" + melos + ", date=" + date + '}';
    }

    
}
