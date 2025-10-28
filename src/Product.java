import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@Builder
@Getter // generates all getters for all private or protected fields
@Setter //generates all setters for all private or protected fields
@AllArgsConstructor //generates a constructor with all parameters (all fields)
@NoArgsConstructor //generates a constructor with no parameters
//@RequiredArgsConstructor //generates a constructor with only fields with @NonNull annotation (required)
@FieldDefaults(level=AccessLevel.PRIVATE)//all fields are private without need to write the private accessor explicitly
@Accessors(chain=true, fluent = true)//fluent option to call getters and setters without starting with get or set respectively
public class Product {
    //Attributes
    @NonNull //the id is required
            int id;
    @NonNull
    String label;
    @NonNull
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

    //print product information on the screen
    public void showProduct()
    {
        IO.println("id = "+id);
        IO.println("label = "+label);
        IO.println("price = "+price);
        //or
        //IO.println("id = "+id+", label = "+label+ ",price = "+price);
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
    public boolean compareProduct(Product p){
        //compare 2 products (courant object(this) and the product p (the parameter)
        return true;
    }

}
