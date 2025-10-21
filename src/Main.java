//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    //Create a product then get its information from the keyboard
   Product p1=new Product();
    Scanner sc=new Scanner(System.in);
    IO.print("id ? = ");
    //long id= sc.nextLong();
    //p1.setId(id);
    //or
    p1.setId(sc.nextLong());
    IO.println("price ? = ");
    double price=sc.nextDouble();
    IO.println("name ? = ");
    String name=sc.nextLine();
    name=sc.nextLine();
    p1.setLabel(name);

    IO.println("date of manufacturing ? = ");
    String date1=sc.next();
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate manufacturingDate = LocalDate.parse(date1,formatter);
    p1.setManufacturingDate(manufacturingDate);

    //show product information on the screen
    IO.println("The product 1 information :");
    IO.println("id = "+p1.getId()+", label = "+p1.getLabel()+", price = "+p1.getPrice()+"manuf. date = "+ p1.getManufacturingDate());

    //create another product with these information:
    //id=5, label = "PC ASUS", price=3500, manufacturing date = 12/11/2025
    Product p2=new Product(5L,"PC ASUS", 3500,LocalDate.of(2025,11,12));
    //show product information on the screen
    IO.println(p2);
    IO.println(p2.toString());


}
