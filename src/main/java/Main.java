import dao.BookDaoImpl;
import model.Book;
import service.BookServiceImpl;

public class Main {
    public static void main(String[] args) {
        BookServiceImpl dao = new BookServiceImpl();
        dao.addBook(new Book("Dostoevskiy", "Idiot", 200));
    }
}
