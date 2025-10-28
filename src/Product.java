import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

@Builder
@Getter // generates all getters for all private or protected fields
@Setter //generates all setters for all private or protected fields
@AllArgsConstructor //generates a constructor with all parameters (all fields)
@NoArgsConstructor //generates a constructor with no parameters
//@RequiredArgsConstructor //generates a constructor with only fields with @NonNull annotation (required)
@FieldDefaults(level=AccessLevel.PRIVATE)//all fields are private without need to write the private accessor explicitly
@Accessors(chain=true, fluent = true)//fluent option to call getters and setters without starting with get or set respectively
//@ToString //returns a String with the values of all fields
//@ToString(exclude="photo") //returns a String with the values of all fields except the photo's path
//@ToString(exclude={"photo","id"}) //returns a String with the values of all fields except the photo's path and the id
@ToString(of={"label", "price"})
//@EqualsAndHashCode //compares 2 products based on all fields
//1er case of use
//@EqualsAndHashCode(onlyExplicitlyIncluded = true) // only the fields annotated with @EqualsAndHashCode.Include are used to compare products (label and price)
//or using the property "of"
//@EqualsAndHashCode(of={"price", "label"})
@EqualsAndHashCode(exclude = {"id", "photo"}) //compares products using all fields except id and photo
public class Product {
    //Attributes
    @NonNull //the id is required
            int id;
    @NonNull
    //@EqualsAndHashCode.Include
    //used only with @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    String label;
    @NonNull
    //@EqualsAndHashCode.Include
    double price;
    @NonNull
    LocalDate manufacturingDate;
    String photo;

    public Product(@NonNull int id, @NonNull String label, @NonNull double price,@NonNull LocalDate mdate) {
        this.id = id;
        if(label.startsWith("product"))
            this.label = label;
        else
            IO.println("Verify the product label format");
        if(price>0)
            this.price = price;
        else
            IO.println("Verify the price value");
        this.manufacturingDate=mdate;
    }

    //get product information from the keyboard
    public void getProduct()
    {
        Scanner sc=new Scanner(System.in);
        IO.println("id ? = ");
        id=sc.nextInt();
        IO.println("label ? = ");
        label=sc.nextLine();
        label=sc.nextLine();
        IO.println("price ? = ");
        price=sc.nextDouble();
        //get the LocalDate value from the keyboard
        IO.println("manufacturing date ? = ");
        String date=sc.next();
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd");
        manufacturingDate=LocalDate.parse(date,formatter);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Product product)) return false;
//        return Double.compare(price, product.price) == 0 && Objects.equals(label, product.label) && Objects.equals(manufacturingDate, product.manufacturingDate);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(label, price, manufacturingDate);
//    }
}
