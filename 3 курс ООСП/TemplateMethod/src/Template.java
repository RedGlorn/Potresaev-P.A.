public abstract class Template {
    public void print (){
        System.out.println("Начало жизни задания");
        activity();
        System.out.println("Конец жизни задания");
        System.out.println("\n");
    }

    public abstract void activity();
}