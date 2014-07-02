package database.models;

import java.io.Serializable;
import java.util.Date;

public class IstorikoMelous implements Serializable {

    private String isbnVivliou;
    private int idAntitypou;
    private int amMelous;
    private Date hmniaDaneismou;
    private Date hmniaEpistrofis;

    public IstorikoMelous() {
    }

    @Override
    public String toString() {
        return "IstorikoMelous{" + "isbnVivliou=" + isbnVivliou + ", idAntitypou=" + idAntitypou + ", amMelous=" + amMelous + ", hmniaDaneismou=" + hmniaDaneismou + ", hmniaEpistrofis=" + hmniaEpistrofis + '}';
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

    public int getAmMelous() {
        return amMelous;
    }

    public void setAmMelous(int amMelous) {
        this.amMelous = amMelous;
    }

    public Date getHmniaDaneismou() {
        return hmniaDaneismou;
    }

    public void setHmniaDaneismou(Date hmniaDaneismou) {
        this.hmniaDaneismou = hmniaDaneismou;
    }

    public Date getHmniaEpistrofis() {
        return hmniaEpistrofis;
    }

    public void setHmniaEpistrofis(Date hmniaEpistrofis) {
        this.hmniaEpistrofis = hmniaEpistrofis;
    }

}
