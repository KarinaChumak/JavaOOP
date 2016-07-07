/**
 * Created by Karina on 06.07.2016.
 */
public class Book {

    private static int nextId = 0;
    private final int id = nextId++;
    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private int price;
    private String binding;



    public String getBinding() {
        return binding;
    }

    public Book setBinding(String binding) {
        this.binding = binding;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Book setYear(int year) {
        this.year = year;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public Book setPages(int pages) {
        this.pages = pages;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Book setPrice(int price) {
        this.price = price;
        return this;
    }

}
