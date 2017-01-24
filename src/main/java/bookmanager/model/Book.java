package bookmanager.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Book_title")
    private String bookTitle;

    @Column(name = "Book_author")
    private String bookAuthor;

    @Column(name = "Book_price")
    private int price;

    public Book(){

    }

    public Book(String bookTitle, String bookAuthor, int price) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    /**
     * Gets id.
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the new value.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets bookTitle.
     *
     * @return bookTitle
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets bookTitle.
     *
     * @param bookTitle the new value.
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * Gets bookAuthor.
     *
     * @return bookAuthor
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * Sets bookAuthor.
     *
     * @param bookAuthor the new value.
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    /**
     * Gets price.
     *
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price the new value.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", price=" + price +
                '}';
    }
}
