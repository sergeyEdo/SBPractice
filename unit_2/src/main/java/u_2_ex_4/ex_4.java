package u_2_ex_4;

public class ex_4 {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Фёдор Михайлович Достоевский", "Мужской", "@mail.ru");
        Book book = new Book("Преступление и наказание", dostoevsky);
        System.out.println(book.toString());
    }
}
