package database.models;

import java.io.Serializable;

/**
 *
 * @author Akis
 */
public class Melos implements Serializable{

    private int am;
    private String name;
    private String surname;
    private String email;
    private String pass;

    public Melos() {
    }
    
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAm() {
        return am;
    }

    public void setAm(int am) {
        this.am = am;
    }

    @Override
    public String toString() {
        return "melos{" + "am=" + am + ", name=" + name + ", surname=" + surname + ", email=" + email + ", pass=" + pass + '}';
    }
    
       
}
