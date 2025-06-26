package u_2_ex_4;

public class ex_4 {
    public static void main(String[] args) {
        Author dostoevsky = new Author("Фёдор Михайлович Достоевский", "Мужской", "@mail.ru");
        Book book = new Book("Преступление и наказание", dostoevsky);
        System.out.println(book.toString());
    }

    private static class Author{
        String name;
        String sex;
        String email;

        public Author(String name, String sex, String email){
            this.name = name;
            this.sex = sex;
            this.email = email;
        }

        public String get_name() {
            return this.name;
        }

        public void set_name(String name) {
            this.name = name;
        }

        public String get_sex() {
            return this.sex;
        }

        public void set_sex(String sex) {
            this.sex = sex;
        }

        public String get_email() {
            return this.email;
        }

        public void set_email(String email) {
            this.email = email;
        }
    }

    public static class Book{
        String title;
        Author author;

        public Book(String title, Author author) {
            this.title = title;
            this.author = author;
        }

        public String get_title() {
            return this.title;
        }

        public void set_title(String title) {
            this.title = title;
        }

        public Author get_author() {
            return this.author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public String toString() {
            return this.title + " " + this.author.name;
        }
    }
}
