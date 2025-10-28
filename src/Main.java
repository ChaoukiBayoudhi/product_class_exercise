void main(){
    //create an object using @Builder of lombok
    Product product=Product.builder()
            .label("product car")
            .price(33890)
            .id(5)
            .manufacturingDate(LocalDate.of(2024,11,14))
            .build();
    product.showProduct();

    IO.println(product);
    IO.println(product.toString());



    //create 2 products
    //id=5, label ="gaming PC" price = 2750, manufacturing Date : 2025-05-11
    //id=11, label ="Macbook" price = 6500, manufacturing Date : 2025-08-03
    //1st method : using setters to initialize the fields



    Product p1=new Product();
    IO.println("product 1 :"+p1);
    p1.id(5); p1.label("gaming PC"); p1.price(2750);
    p1.manufacturingDate(LocalDate.of(2025,8,3));

    //2nd method : using a parameterized constructor to initialize fields
    Product p2=new Product(11,"product Macbook",-6500,LocalDate.of(2025,5,11));
    IO.println("product 1 :"+p2);

    //print products information using getters
    IO.println("Product 1 :");
    IO.println("id = "+p1.id()+", label = "+p1.label()+", price = "+p1.price());

    IO.println("Product 2 :");
    IO.println("id = "+p2.id()+", label = "+p2.label()+", price = "+p2.price());


    //create 2 other products
    Product p3=new Product();
    //get the information of each product from the keyboard
    IO.println("Enter the information of the first product :");
    p3.getProduct();
    Product p4=new Product();
    IO.println("Enter the information of the second product :");
    p4.getProduct();
    //print information
    IO.println("product 3 :");
    p3.showProduct();
    IO.println("product 4 :");
    p4.showProduct();
}
