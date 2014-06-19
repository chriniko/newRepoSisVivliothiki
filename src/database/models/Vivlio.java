package database.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author nikos
 */
public class Vivlio implements Serializable {

    private String isbn;
    private String titlos;
    private String url_exwfilou_vivliou;
    private String perigrafi_vivliou;
    private int id_ekdoti;
    private ArrayList<VivlioHasSiggrafeis> siggrafeis;
    private ArrayList<Antitypo> antitypaVivliou;

    public Vivlio() {
    }

    @Override
    public String toString() {
        return "Vivlio{" + "isbn=" + isbn + ", titlos=" + titlos + ", url_exwfilou_vivliou=" + url_exwfilou_vivliou + ", perigrafi_vivliou=" + perigrafi_vivliou + ", id_ekdoti=" + id_ekdoti + ", siggrafeis=" + siggrafeis + ", antitypaVivliou=" + antitypaVivliou + '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitlos() {
        return titlos;
    }

    public void setTitlos(String titlos) {
        this.titlos = titlos;
    }

    public String getUrl_exwfilou_vivliou() {
        return url_exwfilou_vivliou;
    }

    public void setUrl_exwfilou_vivliou(String url_exwfilou_vivliou) {
        this.url_exwfilou_vivliou = url_exwfilou_vivliou;
    }

    public String getPerigrafi_vivliou() {
        return perigrafi_vivliou;
    }

    public void setPerigrafi_vivliou(String perigrafi_vivliou) {
        this.perigrafi_vivliou = perigrafi_vivliou;
    }

    public int getId_ekdoti() {
        return id_ekdoti;
    }

    public void setId_ekdoti(int id_ekdoti) {
        this.id_ekdoti = id_ekdoti;
    }

    public ArrayList<VivlioHasSiggrafeis> getSiggrafeis() {
        return siggrafeis;
    }

    public void setSiggrafeis(ArrayList<VivlioHasSiggrafeis> siggrafeis) {
        this.siggrafeis = siggrafeis;
    }

    public ArrayList<Antitypo> getAntitypaVivliou() {
        return antitypaVivliou;
    }

    public void setAntitypaVivliou(ArrayList<Antitypo> antitypaVivliou) {
        this.antitypaVivliou = antitypaVivliou;
    }

}
