
import java.util.ArrayList;


/**
 * main1
 */
public class main1 {

    public static void main(String[] args) {
        Book book1 = new Book("art of code", "nito", 0) ;
        Book book2 = new Book("art of game", "nito", 0) ;
        Book book3 = new Book("art of sleep", "ilham", 0);
        
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library lib = new Library("self", "in my mind", books);
        // lib.listBooksByAuthor("nito");
        lib.listBooks();
        
    }
}


class Library {
    String name,address;
    ArrayList<Book> books;

    Library(String name,String address,ArrayList<Book> books){
        this.name=name;
        this.address = address;
        this.books = books;
    }

    void addBook(Book book){
        books.add(book);
        System.out.printf("buku %s telah ditambahkan",book.getTitle());
    }

    void removeBook(Book book){
        books.remove(book);
        System.out.printf("buku %s telah dihapus",book.getTitle());
    }

    ArrayList<Book> findBooksByAuthor(String author){
        ArrayList<Book> result = new ArrayList<Book>();
        for(Book book : books){
            if(book.getAuthor().equals(author)){
                result.add(book);
            }
        }
        return result;
    }

    void listBooksByAuthor(String authors){
        ArrayList<Book> r = findBooksByAuthor(authors);

        for (Book book : r) {
            System.out.printf("Judul Buku %s \n",book.getTitle(), book.getAuthor());
        }
    }

    void listBooks(){
        for (Book book : books) {
            System.out.printf("Judul Buku %s \n",book.getTitle(), book.getAuthor());
        }
    }


}

/**
 * Innermain1
 */
class Book {

    String title,author;
    int yearPublished;

    public Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    String getTitle(){
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }
}


