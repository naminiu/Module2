package AAAShop.views;

import java.util.Scanner;

public abstract class ViewTemplate {
    protected Scanner scanner = new Scanner(System.in);
    public void showMenu() {
        System.out.println("Wellcome to TanDung Company");
    }

    public void showFooter() {
        System.out.println("...@Design by TanDung");
    }

    public abstract void showBody();

    public void showPage() {
        showMenu();
        showBody();
        showFooter();
    }




}
