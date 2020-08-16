package entitie;

import java.util.Objects;

public class Product {

    private String product;
    private Double price;

    public Product(String product, Double price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product1 = (Product) o;
        return product.equals(product1.product) &&
                price.equals(product1.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price);
    }
}
