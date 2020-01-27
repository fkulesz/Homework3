package task4;

public class MainShop {
    public static void main(String[] args) {
        Category category1 = new Category("Proteins", "Products contains proteins");
        Category category2 = new Category("Sugarfree", "Products without sugar");

        Product product1 = new Product("mleko", 5, "bez laktozy", category1);
        Product product2 = new Product("jogurt", 3, "12 %", category1);
        Product product3 = new Product("Cola", 5, "cola bez cukru", category2);
        Product product4 = new Product("Chleb", 2, "wieloziarnisty");

        SpecialOffer specialOfferForCola;
        specialOfferForCola = new SpecialOffer(product3, "promocja na Colę", "27-01-2020", "27-02-2020", 20);

        System.out.println("Zniżka na colę" + specialOfferForCola.discount +"zł");
    }
}
