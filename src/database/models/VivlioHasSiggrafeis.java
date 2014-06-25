package database.models;

import java.io.Serializable;

/**
 *
 * @author nikos
 */
public class VivlioHasSiggrafeis implements Serializable {

    private String isbnVivliou;
    private int idSiggrafea;

    public VivlioHasSiggrafeis(String isbnVivliou, int idSiggrafea) {
        this.isbnVivliou = isbnVivliou;
        this.idSiggrafea = idSiggrafea;
    }

    public VivlioHasSiggrafeis() {
    }

    @Override
    public String toString() {
        return "VivlioHasSIggrafeis{" + "isbnVivliou=" + isbnVivliou + ", idSiggrafea=" + idSiggrafea + '}';
    }

    public String getIsbnVivliou() {
        return isbnVivliou;
    }

    public void setIsbnVivliou(String isbnVivliou) {
        this.isbnVivliou = isbnVivliou;
    }

    public int getIdSiggrafea() {
        return idSiggrafea;
    }

    public void setIdSiggrafea(int idSiggrafea) {
        this.idSiggrafea = idSiggrafea;
    }

}
