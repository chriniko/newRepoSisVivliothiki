package database.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nikos
 */
public class Melos implements Serializable {

    private int am;
    private String onoma;
    private String epitheto;
    private String email;
    private String pass;
    private ArrayList<Antitypo> daneismenaAntitypa;
    private ArrayList<IstorikoMelous> istorikoDaneismwn;

    public Melos() {
    }

    @Override
    public String toString() {
        return "Melos{" + "am=" + am + ", onoma=" + onoma + ", epitheto=" + epitheto + ", email=" + email + ", pass=" + pass + ", daneismenaAntitypa=" + daneismenaAntitypa + ", istorikoDaneismwn=" + istorikoDaneismwn + '}';
    }

    public int getAm() {
        return am;
    }

    public void setAm(int am) {
        this.am = am;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Antitypo> getDaneismenaAntitypa() {
        return daneismenaAntitypa;
    }

    public void setDaneismenaAntitypa(ArrayList<Antitypo> daneismenaAntitypa) {
        this.daneismenaAntitypa = daneismenaAntitypa;
    }

    public ArrayList<IstorikoMelous> getIstorikoDaneismwn() {
        return istorikoDaneismwn;
    }

    public void setIstorikoDaneismwn(ArrayList<IstorikoMelous> istorikoDaneismwn) {
        this.istorikoDaneismwn = istorikoDaneismwn;
    }

}
