package task4;

import java.util.Date;

public class SpecialOffer {
    Product product;
    String offerDescription;
    String startDate;
    String endDate;
    double discount;

    SpecialOffer(Product offerForProduct, String specialOfferDescription, String offerStartDate, String offerEndDate, double offerDiscount){
        product = offerForProduct;
        offerDescription = specialOfferDescription;
        startDate = offerStartDate;
        endDate = offerEndDate;
        discount = offerForProduct.price*offerDiscount/100;
    }
}
