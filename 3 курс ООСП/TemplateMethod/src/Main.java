public class Main {
    public static void main(String[] args) {
        Template event = new Event();
        Template task = new Task();
        Template project = new Project();

        task.print();
        project.print();
        event.print();

    }
}