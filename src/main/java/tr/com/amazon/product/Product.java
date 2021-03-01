package tr.com.amazon.product;


public class Product {

    private final String productUrl ;

    public Product(){
        this.productUrl = "https://www.amazon.com.tr/Samsung-SM-M115F-Telefon-T%C3%BCrkiye-Garantili/dp/B087MQMQ4N?ref_=Oct_DLandingS_D_fa421a9c_61&smid=A1UNQM1SR2CHM";
    }

    public Product(String productUrl){
        this.productUrl = productUrl ;
    }

    public String getProductUrl() {
        return productUrl;
    }
}
