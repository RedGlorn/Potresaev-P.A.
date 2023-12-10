public class Main {
    public static void main(String[] args) {

        NoSQLDB noSQLDB = new NoSQLDB();
        DBManagement dbManagement = new MongoDB(noSQLDB);
        dbManagement.addData();
        dbManagement.updateData();
        dbManagement.deleteData();

    }
}