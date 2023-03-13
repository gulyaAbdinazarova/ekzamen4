package productStore;

import productStore.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();
    private List<Product> discount = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getDiscount() {
        return discount;
    }

    public void setDiscount(List<Product> discount) {
        this.discount = discount;
    }
}

