import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karina on 06.07.2016.
 */
public class BookRunner {

    public static void main(String[] args) {

        List<Book> booksList = new ArrayList<>();

        booksList.add( new Book()
                .setName("To Kill a Mockingbird")
                .setAuthor("Harper Lee")
                .setPages(712)
                .setBinding("Soft")
                .setPrice(50)
                .setPublisher("Publisher1")
                .setYear(1962)
        );

        booksList.add( new Book()
                .setName("The Count of Monte Cristo")
                .setAuthor("Alexandre Dumas")
                .setPages(1502)
                .setBinding("Hard")
                .setPrice(70)
                .setPublisher("Penguin Classics")
                .setYear(1845)
        );
        booksList.add( new Book()
                .setName("The Lord of the Rings")
                .setAuthor("J.R.R. Tolkien")
                .setPages(1502)
                .setBinding("Hard")
                .setPrice(70)
                .setPublisher("Penguin Classics")
                .setYear(1968)
        );


        List<Book> booksByHarperLee = BookUtils.findByAuthor(booksList, "Harper Lee");
        System.out.println("Books by Harper Lee:");
        BookUtils.output(booksByHarperLee);

        List<Book> booksAfter1800 = BookUtils.findAfterYear(booksList,1800);
        System.out.println("\nBooks after 1800:");
        BookUtils.output(booksAfter1800);

        List<Book> booksByPenguin = BookUtils.findByPublisher(booksList, "Penguin Classics");
        System.out.println("\nBooks by Penguin Classics:");
        BookUtils.output(booksByPenguin);
    }
}
