package utils;

/**
 *
 * @author nikos
 */
public class Utils {

    public static final int OK = -1;

    public static int elegxosSimplirwmenwnPediwn(String[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].trim().equals("")) {
                return i;//ean kapoio pedio den exei simplirwthei swsta epestrepse to index tou.
            }
        }
        return OK; //ean ola exoun simplirwthei swsta epestrepse -1.
    }

}//Utils.
