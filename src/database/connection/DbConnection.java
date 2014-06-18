package database.connection;

/**
 *
 * @author nikos
 */
public class DbConnection {

    private DbConnection() {
    }

    public static DbConnection getInstance() {
        return DbConnectionHolder.INSTANCE;
    }

    private static class DbConnectionHolder {

        private static final DbConnection INSTANCE = new DbConnection();
    }
}
