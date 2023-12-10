public class SQLDB implements DBType{
    @Override
    public void useDB() {
        System.out.println("Используется SQL");
    }
}