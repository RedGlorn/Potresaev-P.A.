public class Main {
    public static void main(String[] args) {

        Blog blog = new Blog();
        new Subscriber("Иссак Иванов", blog);
        new Subscriber("Павел Андреевич", blog);

        blog.NewAnnouncement("Unity объявила о новом налоге на установку игр. Куда катится мир...");


    }
}

