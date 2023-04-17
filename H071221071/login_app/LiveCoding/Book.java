package LiveCoding;

public class Book {
    private String Title;
    private String Outor;
    private String Type;
    private int yearPublished;
    private String Price;

    public String getTitle() {
        return Title;
    }

    public String getOutor() {
        return Outor;
    }

    public String getType() {
        return Type;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getPrice() {
        return Price;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setOutor(String outor) {
        Outor = outor;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Book() {
    }

    public Book(String Title,String Outor,String Type,int yearPublished,String Price){
        this.Title = Title;
        this.Outor = Outor;
        this.Type = Type;
        this.yearPublished = yearPublished;
        this.Price = Price;
    }


    public void displayInfo(){
        System.out.println("Title: " + Title);
        System.out.println("Outor: " + Outor);
        System.out.println("Type: " + Type);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: " + Price);
    }
}
