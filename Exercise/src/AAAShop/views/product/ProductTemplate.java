package AAAShop.views.product;

import AAAShop.model.Product;
import AAAShop.services.ProductService;
import AAAShop.views.ViewTemplate;

import java.util.List;

public abstract class ProductTemplate extends ViewTemplate {
    protected ProductService productService;
    public ProductTemplate() {
        productService = new ProductService();
    }
    public void showProducts(List<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
