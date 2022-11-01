package AAAShop.views.product;

public class DeleteProductView extends ProductTemplate {

    public DeleteProductView() {
       super();
    }

    @Override
    public void showBody() {
        System.out.println("DELETE PRODUCT VIEW");
        showProducts(productService.getProducts());
        System.out.println("Input ID:");
        Long idProductDel = Long.parseLong(scanner.nextLine());
        productService.removeProductById(idProductDel);
        showProducts(productService.getProducts());
    }


}
