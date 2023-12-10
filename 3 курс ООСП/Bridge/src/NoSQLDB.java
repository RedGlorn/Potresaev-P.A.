public class NoSQLDB implements DBType{
    @Override
    public void useDB() {
        System.out.println("Используется NoSQL");
    }
}