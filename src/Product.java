import lombok.*;

import java.time.LocalDate;
@Getter //generates all getters for all private or protected attributes
@Setter //generates all setters for all private or protected attributes
@NoArgsConstructor // generates a constructor with no parameters
@AllArgsConstructor //generates a constructor with all attributes as parameters
@RequiredArgsConstructor //generates a constructor with all attributes except photo
public class Product {
    //attributes
    @NonNull // the id is required
    private long id;
    @NonNull
    private String label;
    @NonNull
    private double price;
    @NonNull
    private LocalDate manufacturingDate;
    //private byte[] photo;
    private String photo;
    //methods

//    public Product() {
//        id=0;
//        label="";
//        price=0;
//        manufacturingDate=LocalDate.of(2025,1,1);
//    }
//    //surcharge of the constructor
//
//    public Product(long id, String label, double price, LocalDate manufacturingDate) {
//        this.id = id;
//        this.label = label;
//        this.price = price;
//        this.manufacturingDate = manufacturingDate;
//    }


    //getters setters

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getLabel() {
//        return label;
//    }
//
//    public void setLabel(String label) {
//        this.label = label;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public LocalDate getManufacturingDate() {
//        return manufacturingDate;
//    }
//
//    public void setManufacturingDate(LocalDate manufacturingDate) {
//        this.manufacturingDate = manufacturingDate;
//    }
}
