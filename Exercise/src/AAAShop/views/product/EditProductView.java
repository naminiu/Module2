package AAAShop.views.product;

import AAAShop.model.Product;

public class EditProductView extends ProductTemplate {
    public EditProductView() {
        super();
    }

    @Override
    public void showBody() {
        boolean flagEdit = true;
        do {
            System.out.println("EDIT PRODUCT VIEW");
            showProducts(productService.getProducts());
            System.out.println("INPUT ID YOU WANT FIX:");
            Long idProductEdit = Long.parseLong(scanner.nextLine());
            System.out.println("1. Change Name Product");
            System.out.println("2. Change Price Product");
            System.out.println("3. Change Quantity Product");
            System.out.println("4. Change Manufacturer Product ");
            System.out.println("0. Back to menu");
            Product newProduct = new Product();
            newProduct.setId(idProductEdit);
            int menu = Integer.parseInt(scanner.nextLine());
            String nameEdit = null;
            float priceEdit = 0;
            int quantityEdit = 0;
            String manufacturerEdit = null;
            switch (menu) {
                case 1:
                    System.out.println("Input Name Product");
                    System.out.println("Name product cannot be empty");
                    nameEdit = scanner.nextLine();
                    newProduct.setName(nameEdit);
                    productService.editProduct(newProduct);
                    System.out.println("You changed name product Success");
                    break;
                case 2:
                    System.out.println("Input Price Product");
                    System.out.println("Price Product cannot be empty");
                    priceEdit = Float.parseFloat(scanner.nextLine());
                    newProduct.setPrice(priceEdit);
                    productService.editProduct(newProduct);
                    break;
                case 3:
                    System.out.println("Input Quantity Product");
                    System.out.println("Quantity Product cannot be empty");
                    quantityEdit = Integer.parseInt(scanner.nextLine());
                    newProduct.setQuantity(quantityEdit);
                    productService.editProduct(newProduct);
                    break;
                case 4:
                    System.out.println("Manufacturer Product");
                    System.out.println("Manufacturer Product cannot be empty");
                    manufacturerEdit = scanner.nextLine();
                    newProduct.setManufacturer(manufacturerEdit);
                    productService.editProduct(newProduct);
                    break;
                case 0:
                    flagEdit = false;
                    break;
            }
            System.out.println("Click 'y' to continue fix || 'n' to exit");
            String flagEditConitnue = scanner.nextLine();
            if (flagEditConitnue.equals("y")) {
                flagEdit = true;
            } else {
                if (flagEditConitnue.equals("n")) {
                    flagEdit = false;
                }
            }

        } while (flagEdit);
    }
}
