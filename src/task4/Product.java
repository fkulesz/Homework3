package task4;

public class Product {
    String name;
    double price;
    String description;
    Category category;

    Product(String productName, double productPrice, String productDescription, Category productCategory){
        name = productName;
        price = productPrice;
        description = productDescription;
        category = productCategory;
    }
    Product(String productName, double productPrice, String productDescription){
        name = productName;
        price = productPrice;
        description = productDescription;
    }
}
