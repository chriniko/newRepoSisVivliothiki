package database.models;

import java.io.Serializable;

/**
 *
 * @author Akis
 */
public class Vivliothikarios implements Serializable{

    private int am;
    private String password;

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
}
