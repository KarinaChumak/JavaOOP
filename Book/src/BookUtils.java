import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Karina on 06.07.2016.
 */
public class BookUtils {

    public static List<Book> findByAuthor(List <Book> bookList, String author){

        List <Book> results = new ArrayList<>();
        for( Book book : bookList){
            if(Objects.equals(book.getAuthor(),author)){
                results.add(book);
            }
        }
        return results;
    }

    public static List<Book> findAfterYear (List <Book> bookList,int year){
        List <Book> results = new ArrayList<>();
        for( Book book : bookList){
            if(book.getYear()>year)
                results.add(book);
        }

        return results;
    }

    public static List<Book> findByPublisher (List <Book> bookList,String publisher){
        List <Book> results = new ArrayList<>();
        for( Book book : bookList){
            if(Objects.equals(book.getPublisher(),publisher))
                results.add(book);
        }
        return results;
    }


    public static void output (List <Book> bookList){
        for (Book book : bookList) {
            System.out.print("\nid:" + book.getId() +
                    "\nname:" + book.getName() +
                    "\nauthor:" + book.getAuthor() +
                    "\npublisher:" + book.getPublisher() +
                    "\nyear:" + book.getYear() +
                    "\npages:" + book.getPages() +
                    "\nprice:" + book.getPrice() +
                    "\nbinding:" + book.getBinding() + '\n' );

        }
    }

}
