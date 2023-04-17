package LiveCoding;

public class Main {
    public static void main(String[] args) {
        
    Book book = new Book();
    System.out.println("==========[BOOK 1 INFO]==========");
    book.setTitle("Filosofi Teras");
    book.setOutor("Hendry Manampiring");
    book.setType("Novel");
    book.setYearPublished(2018);
    book.setPrice("98.000");

    book.displayInfo();

    Book book2 = new Book("Psycologi of money","Morgan Housel","Novel",2022,"78.000");
    System.out.println("==========[BOOK 2 INFO]==========");
    System.out.println("Title: " + book2.getTitle());
    System.out.println("Outor: " + book2.getOutor());
    System.out.println("Type: " + book2.getType());
    System.out.println("Year Published: " + book2.getYearPublished());
    System.out.println("Price: " + book2.getPrice());
    System.out.println("==================================");
    
    SelfUtils.displaySelfData();

    }
}
