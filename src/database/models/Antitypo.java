package database.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nikos
 */
public class Antitypo implements Serializable {

    private String isbnVivliou;
    private int idAntitypou;
    private String katastasiAntitypou;
    private int am_daneismenou_melous;
    private java.sql.Date hmnia_daneismou;
    private ArrayList<IstorikoMelous> istorikoAntitypo;

    public Antitypo() {
    }

    @Override
    public String toString() {
        return "Antitypo{" + "isbnVivliou=" + isbnVivliou + ", idAntitypou=" + idAntitypou + ", katastasiAntitypou=" + katastasiAntitypou + ", am_daneismenou_melous=" + am_daneismenou_melous + ", hmnia_daneismou=" + hmnia_daneismou + ", istorikoAntitypo=" + istorikoAntitypo + '}';
    }

    public String getIsbnVivliou() {
        return isbnVivliou;
    }

    public void setIsbnVivliou(String isbnVivliou) {
        this.isbnVivliou = isbnVivliou;
    }

    public int getIdAntitypou() {
        return idAntitypou;
    }

    public void setIdAntitypou(int idAntitypou) {
        this.idAntitypou = idAntitypou;
    }

    public String getKatastasiAntitypou() {
        return katastasiAntitypou;
    }

    public void setKatastasiAntitypou(String katastasiAntitypou) {
        this.katastasiAntitypou = katastasiAntitypou;
    }

    public int getAm_daneismenou_melous() {
        return am_daneismenou_melous;
    }

    public void setAm_daneismenou_melous(int am_daneismenou_melous) {
        this.am_daneismenou_melous = am_daneismenou_melous;
    }

    public java.sql.Date getHmnia_daneismou() {
        return hmnia_daneismou;
    }

    public void setHmnia_daneismou(java.sql.Date hmnia_daneismou) {
        this.hmnia_daneismou = hmnia_daneismou;
    }

    public ArrayList<IstorikoMelous> getIstorikoAntitypo() {
        return istorikoAntitypo;
    }

    public void setIstorikoAntitypo(ArrayList<IstorikoMelous> istorikoAntitypo) {
        this.istorikoAntitypo = istorikoAntitypo;
    }

}
