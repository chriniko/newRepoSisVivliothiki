package utils;

public class Utils {

    public static final int OK = -1;

    public static int elegxosSimplirwmenwnPediwn(String[] values) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].trim().equals("")) {
                return i;//ean kapoio pedio den exei simplirwthei swsta epestrepse to index tou.
            }
        }
        return OK; //ean ola exoun simplirwthei swsta epestrepse -1.
    }//elegxosSimplirwmenwnPediwn.

    public static int findSum(int[] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i];
        }
        return sum;
    }//findSum.

    public static boolean isIntegerNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }//isIntegerNumber.

}//Utils.
