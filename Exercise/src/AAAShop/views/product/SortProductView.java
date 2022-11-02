package AAAShop.views.product;

import AAAShop.Sort.ComparatorByPrice;
import AAAShop.Sort.ComparatorByName;
import AAAShop.model.Product;

import java.util.Comparator;

public class SortProductView extends ProductTemplate {


    @Override
    public void showBody() {
        System.out.println("SORT PRODUCT");
        System.out.println("1. SORT BY NAME");
        System.out.println("2. SORT BY PRICE");
        Comparator<Product> comparator;
        int action = Integer.parseInt(scanner.nextLine());
        switch (action) {
            case 1:
                comparator = new ComparatorByName();
                productService.sortProduct(comparator);
                break;
            case 2:
                comparator = new ComparatorByPrice();
                productService.sortProduct(comparator);
                break;
        }
        showProducts(productService.getProducts());
    }
}