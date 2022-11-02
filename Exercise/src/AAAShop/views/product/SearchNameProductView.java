package AAAShop.views.product;

import AAAShop.Sort.ComparatorByPrice;
import AAAShop.model.Product;

import java.util.List;

public class SearchNameProductView extends ProductTemplate {

    public SearchNameProductView() {
    }

    @Override

    public void showBody() {
        showProducts(productService.getProducts());
        System.out.println("FIND NAME USER");
        System.out.println("Input name");
        String nameSearch = scanner.nextLine();
        List<Product> listProductSearch = productService.searchNameProduct(nameSearch);
        ComparatorByPrice comparatorByPrice = new ComparatorByPrice();
        listProductSearch.sort(comparatorByPrice);
        showProducts(listProductSearch);

    }
}
