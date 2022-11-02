package AAAShop;

import AAAShop.views.ViewTemplate;
import AAAShop.views.product.*;
import AAAShop.views.user.*;

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
            System.out.println("4: Edit Product");
            System.out.println("5: Sort Product");
            System.out.println("6: Search Name Product");
            System.out.println("7: Show List User");
            System.out.println("8: Add User");
            System.out.println("9: Delete User");
            System.out.println("10: Edit User");
            System.out.println("11: Search Name User");
            System.out.println("12: Search ID User");




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
                    viewPage = new EditProductView();
                    break;
                case 5:
                    viewPage = new SortProductView();
                    break;
                case 6:
                    viewPage = new SearchNameProductView();
                    break;
                case 7:
                    viewPage = new UserView();
                    break;
                case 8:
                    viewPage = new  AddUserView();
                    break;
                case 9:
                    viewPage = new DeleteUserView();
                    break;
                case 10:
                    viewPage = new EditUserView();
                    break;
                case 11:
                    viewPage = new SearchNameUserView();
                    break;
                case 12:
                    viewPage = new SearchIdUserView();
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