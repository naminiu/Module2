package AAAShop;

import AAAShop.views.ViewTemplate;
import AAAShop.views.product.AddProductView;
import AAAShop.views.product.DeleteProductView;
import AAAShop.views.product.EditProductView;
import AAAShop.views.product.ProductsView;
import AAAShop.views.user.AddUserView;
import AAAShop.views.user.DeleteUserView;
import AAAShop.views.user.UserView;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        ProductService.init();
        ViewTemplate viewPage = null;
        boolean flagMenu = true;
        do{
            System.out.println("Menu: ");
            System.out.println("1: Show List Product");
            System.out.println("2: Add Product");
            System.out.println("3: Delete Product");
            System.out.println("4: Show List User");
            System.out.println("5: Add User");
            System.out.println("6: Delete User");
            System.out.println("7: Edit Product");


            System.out.println("0: Exit");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    viewPage = new ProductsView();
                    break;
                case 2:
                    viewPage = new AddProductView();
                    break;
                case 3:
                    viewPage = new DeleteProductView();
                    break;
                case 4:
                    viewPage = new UserView();
                    break;
                case 5:
                    viewPage = new  AddUserView();
                    break;
                case 6:
                    viewPage = new DeleteUserView();
                    break;
                case 7:
                    viewPage = new EditProductView();
                    break;
                case 0:
                    flagMenu = false;
                    break;
            }
            viewPage.showPage();
            //
        }while (flagMenu);

    }

}