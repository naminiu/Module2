package AAAShop.views.product;

public class FindNameProductView extends ProductTemplate{
    public FindNameProductView() {
        super();
    }

    @Override
    public void showBody() {
        System.out.println("FIND NAME PRODUCT VIEW");
        System.out.println("Input name");
        String findName = scanner.nextLine();

    }
}
