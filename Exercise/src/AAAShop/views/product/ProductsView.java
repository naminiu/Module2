package AAAShop.views.product;

public class ProductsView extends ProductTemplate {
    public ProductsView(){

    }

    @Override
    public void showBody() {
        showProducts(productService.getProducts());
    }
}
