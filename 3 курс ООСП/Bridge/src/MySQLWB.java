public class MySQLWB extends DBManagement{

    public MySQLWB(DBType dbType) {
        super(dbType);
    }

    @Override
    public void addData() {
        System.out.println("Добавление данных");
        dbType.useDB();
    }

    @Override
    public void updateData() {
        System.out.println("Обновление данных");
        dbType.useDB();
    }

    @Override
    public void deleteData() {
        System.out.println("Удаление данных");
        dbType.useDB();
    }
}