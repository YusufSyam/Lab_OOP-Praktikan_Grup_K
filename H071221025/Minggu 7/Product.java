import java.time.LocalDate;

public class Product<T> {  //T pada kelas Product<T> adalah parameter tipe generik untuk menggunakan tipe data yang berbeda-beda untuk harga pada objek Product.
    private String name;  
    private T price;  
    private LocalDate expiryDate;  

    public Product(String name, T price, LocalDate expiryDate) {  
        this.name = name;  
        this.price = price;  
        this.expiryDate = expiryDate;  
    }

    public String getName() {  
        return name;  
    }

    public T getPrice() { 
        return price; 
    }

    public LocalDate getExpiryDate() {  
        return expiryDate;  
    }
}
