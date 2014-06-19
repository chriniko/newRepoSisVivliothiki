package database.models;

import java.io.Serializable;

/**
 *
 * @author Akis
 */
public class Vivliothikarios implements Serializable {

    private int am;
    private String password;
    private String onoma;
    private String epitheto;

    public Vivliothikarios() {
    }

    @Override
    public String toString() {
        return "Vivliothikarios{" + "am=" + am + ", password=" + password + ", onoma=" + onoma + ", epitheto=" + epitheto + '}';
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
