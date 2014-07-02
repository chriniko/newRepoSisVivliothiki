package utils;

import database.models.Ekdotis;
import database.models.Siggrafeas;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ApothikeutisEnimerwmenwnSiggrafewnEkdoti {

    //========================================
    public static enum OnomataArxeiwn {

        ARXEIO_SIGGRAFEWN("siggrafeis_serial.dat"),
        ARXEIO_SIGGRAFEWN_BACKUP("siggrafeis_serial_bu.dat"),//backup arxeio, an akyrwsei thn enimerwsi na epistrepsoume se auth thn epilogh....
        ARXEIO_EKDOTIS("ekdotis_serial.dat"),
        ARXEIO_EKDOTIS_BACKUP("ekdotis_serial_bu.dat");//backup arxeio, an akyrwsei thn enimerwsi na epistrepsoume se auth thn epilogh....

        private final String onomaArxeiou;

        OnomataArxeiwn(String on) {
            onomaArxeiou = on;
        }

        public String getOnomaArxeiou() {
            return onomaArxeiou;
        }

    }//OnomataArxeiwn.
    //========================================

    public static boolean NEA_ARXEIA = false;//ean epilexe nees rithmiseis, diladi exoun dimiourgithei nea seiriopoihmena arxeia me ton neo ekdoti kai tous neous siggrafeis/siggrafea....

    //=========================================
    public static void katestrepseArxeia(String[] onomataArxeiwn) {
        for (String temp : onomataArxeiwn) {
            File file = new File(temp);
            file.delete();
        }
    }//katestrepseArxeia.

    public static boolean yparxeiToArxeio(String onomaArxeiou) {
        File selectedFile = new File(onomaArxeiou);
        return selectedFile.exists();
    }
    //=========================================

    public static void swseArrayListSiggrafewn(ArrayList<Siggrafeas> siggrafeisToSave, String onomaArxeiou) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(onomaArxeiou)))) {

            oos.writeObject(siggrafeisToSave);
            oos.flush();

        } catch (Exception ex) {
            System.err.println(ex.getMessage() + " === " + ex.toString());
        }
    }

    //==========================================================
    public static ArrayList<Siggrafeas> anaktiseArrayListSiggrafewn(String onomaArxeiou) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(onomaArxeiou)))) {

            ArrayList<Siggrafeas> siggrafeis = (ArrayList<Siggrafeas>) ois.readObject();
            return siggrafeis;
        } catch (Exception ex) {
            System.err.println(ex.getMessage() + " === " + ex.toString());

        }
        return null;
    }
    //==========================================================

    public static void swseStoixeiaEkdoti(Ekdotis ekdotisToSave, String onomaArxeiou) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(onomaArxeiou)))) {

            oos.writeObject(ekdotisToSave);
            oos.flush();

        } catch (Exception ex) {
            System.err.println(ex.getMessage() + " === " + ex.toString());
        }
    }
    //==========================================================

    public static Ekdotis anaktiseStoixeiaEkdoti(String onomaArxeiou) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(onomaArxeiou)))) {

            Ekdotis ekd = (Ekdotis) ois.readObject();
            return ekd;

        } catch (Exception ex) {
            System.err.println(ex.getMessage() + " === " + ex.toString());
        }
        return null;
    }
    //==========================================================

}
